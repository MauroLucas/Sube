package negocio;

import java.util.GregorianCalendar;

import dao.RedSubeDao;
import datos.RedSube;
import datos.TarjetaSube;

public class RedSubeABM {
	RedSubeDao dao = new RedSubeDao();
	
	public RedSube traerRedSube(long idRedSube) throws Exception{
		RedSube rs= dao.traerRedSube(idRedSube);
		return rs;
	}
	
	public long agregar(GregorianCalendar fechaHora, int contador, String linea, TarjetaSube tarjetasube) throws Exception{
		RedSube rs= new RedSube(fechaHora, contador, linea, tarjetasube);
		return dao.agregar(rs);
	}
	
	public void eliminar(long idRedSube) throws Exception{ 
			RedSube rs= dao.traerRedSube(idRedSube);
			dao.eliminar(rs);
	}
	
	public void modificar(RedSube rs) throws Exception{
		dao.actualizar(rs);
	}

	public double calcularDescuento(long nroTarjetaSube, String lineaTransporte, GregorianCalendar fechaHora) throws Exception{
		/* IMPORTANTE!: El metodo está pensado para utilizar su salida multiplicandola por el precio. 
		En caso de no existir descuento devuelve 1. */
		
		RedSube redSube = dao.traerRedSube(nroTarjetaSube);
		
		boolean sinDescuento=false;
		double descuento=1;
		
		// Restricciones 
		
		// Si la diferencia entre la hora de RedSube y el viaje actual es mayor a 2hs no hay descuento y resetear RedSube
		if((fechaHora.getTimeInMillis()-redSube.getFechaHora().getTimeInMillis())/1000/60>120){
			resetearRedSube(nroTarjetaSube, fechaHora);
			sinDescuento=true;
		}
		
		// Si el transporte es el mismo al de RedSube no hay descuento
		if(redSube.getLinea().equals(lineaTransporte)&&!sinDescuento) {
			resetearRedSube(nroTarjetaSube, fechaHora);
			sinDescuento=true;
		}
			
		//Restricciones por cantidad de viajes
				
		// Si el contador está en 1: no hay descuento
		if(!sinDescuento) {
			int contador= redSube.getContador();
			if(contador==1) {
				redSube.setContador(contador+1);
				redSube.setLinea(lineaTransporte);
				modificar(redSube);
			} else {
				// Si el contador está en 2: 50% de descuento
				if(contador==2) {
					redSube.setContador(contador+1);
					redSube.setLinea(lineaTransporte);
					modificar(redSube);
					descuento=0.5;
				} else {
					// Si el contador es mayor de 2 y menor o igual a 5 el descuento es 75%
					if(contador>=3&&contador<=5) {
						redSube.setContador(contador+1);
						redSube.setLinea(lineaTransporte);
						modificar(redSube);
						descuento=0.25;
					} else {
						// Si el contador llegó a 6 viajes no hay descuento y se debe resetear el contador y la fecha hora.
						if(contador==6) {
							resetearRedSube(nroTarjetaSube, fechaHora);
						}
					}
				}
			}
		}
		return descuento;
	}
	
	private void resetearRedSube(long nroTarjetaSube, GregorianCalendar fechaHora) {
		RedSube rs = dao.traerRedSube(nroTarjetaSube);
		RedSubeABM ABM = new RedSubeABM();
		rs.setFechaHora(fechaHora);
		rs.setContador(1);
		rs.setLinea("");
		try {
			ABM.modificar(rs);
		} catch (Exception e) {
			System.out.println("Error al resetear la RedSube");
		}
	}
}

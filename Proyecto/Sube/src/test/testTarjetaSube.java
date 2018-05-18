package test;

import datos.EstadoSube;
import negocio.TarjetaSubeABM;

public class testTarjetaSube {

	public static void main(String[] args) {
		testTarjetaSube test= new testTarjetaSube();
		
		test.agregarTarjeta();
				
//		test.eliminarTarjeta(3);
		
	}
	
	public void agregarTarjeta() {
		float saldo = 50;
		TarjetaSubeABM abm = new TarjetaSubeABM();
		EstadoSube es = null;
		int idUsuario=1;
		try{
			abm.agregar(idUsuario, saldo, es);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void eliminarTarjeta(long nroTarjeta) {
		TarjetaSubeABM abm = new TarjetaSubeABM();
		try {
			abm.eliminar(nroTarjeta);
		} catch(Exception e) { 
			System.out.println(e);
		}
	}
}

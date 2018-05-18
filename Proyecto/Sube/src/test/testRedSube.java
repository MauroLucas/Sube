package test;

import java.util.GregorianCalendar;

import datos.RedSube;
import datos.TarjetaSube;
import negocio.RedSubeABM;
import negocio.TarjetaSubeABM;

public class testRedSube {

	public static void main(String[] args) {
		testRedSube test= new testRedSube();
		
//		test.agregarRedSube();
		
//		test.eliminarRedSube(3);
		
		System.out.println(test.modificarRedSube(4).toString());
		
	}
	
	public void agregarRedSube() {
		RedSubeABM abmRedSube = new RedSubeABM();
		GregorianCalendar fechaHora = new GregorianCalendar();
		int contador=1; 
		int nroTarjeta=4;
		
		TarjetaSubeABM abmTarjeta = new TarjetaSubeABM();
		
		try{
			TarjetaSube tarjetasube= abmTarjeta.traerTarjetaSube(nroTarjeta);
			abmRedSube.agregar(fechaHora, contador, tarjetasube);	
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void eliminarRedSube(long idRedSube) {
		RedSubeABM abm = new RedSubeABM();
		try {
			abm.eliminar(idRedSube);
		} catch(Exception e) { 
			System.out.println(e);
		}
	}
	
	public RedSube traerRedSube(long idRedSube) {
		RedSubeABM abm = new RedSubeABM();
		RedSube rs = null;
		try {
			rs=abm.traerRedSube(idRedSube);
		} catch(Exception e) { 
			System.out.println(e);
		}
		return rs;
	}
	
	public RedSube modificarRedSube(long idRedSube) {
		RedSubeABM abm = new RedSubeABM();
		RedSube rs = null;
		try {
			rs=abm.traerRedSube(idRedSube);
			rs.setContador(rs.getContador()+1);
			abm.modificar(rs);
		} catch(Exception e) { 
			System.out.println(e);
		}
		return rs;
	}
}

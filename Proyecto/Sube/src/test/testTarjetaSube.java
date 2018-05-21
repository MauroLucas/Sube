package test;

import negocio.TarjetaSubeABM;

public class testTarjetaSube {

	public static void main(String[] args) {
		testTarjetaSube test= new testTarjetaSube();
		
		test.agregarTarjeta();
				
//		test.eliminarTarjeta(6);
		
	}
	
	public void agregarTarjeta() {
		float saldo = 50;
		TarjetaSubeABM abm = new TarjetaSubeABM();
		int idUsuario=1;
		int estado=0;
		try{
			abm.agregar(idUsuario, saldo, estado);
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

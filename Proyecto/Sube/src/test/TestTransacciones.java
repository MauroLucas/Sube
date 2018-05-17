package test;

import negocio.TransaccionABM;
import datos.*;
import funciones.Funciones;

public class TestTransacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TransaccionABM abm=TransaccionABM.getInstance();
			//abm.agregarRecarga(50, Funciones.traerFecha(2018, 5, 9),1);
			//abm.agregarViajeTren(3,Funciones.traerFecha(2018,5,10,9,0,0),1,1,1,1);
			//abm.agregarViajeSubte(3,Funciones.traerFecha(2018,5,10,9,0,0),1,1,1);
			//abm.agregarViajeColectivo(3,Funciones.traerFecha(2018,5,10,9,0,0),1,1,1);
			//abm.traerRecarga(); no anda
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}

	}

}

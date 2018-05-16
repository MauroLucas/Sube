package test;

import negocio.RecargaABM;
import datos.Recarga;
import funciones.Funciones;
import negocio.ViajeTrenABM;
import datos.ViajeTren;

public class TestTransacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//RecargaABM abm=RecargaABM.getInstance();
			//abm.agregar(50, Funciones.traerFecha(2018, 5, 9),1);
			ViajeTrenABM abm=ViajeTrenABM.getInstance();
			abm.agregar(3,Funciones.traerFecha(2018,5,10,9,0,0),1,1,1,1);
			
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}

	}

}

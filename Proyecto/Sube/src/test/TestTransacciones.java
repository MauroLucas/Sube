package test;

import negocio.*;
import datos.*;
import funciones.Funciones;

public class TestTransacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(TarjetaSubeABM.getInstance().traerTarjetaSube(123));
			TransaccionABM.getInstance().agregarRecarga(50, Funciones.traerFecha(2018, 5, 9),TarjetaSubeABM.getInstance().traerTarjetaSube(123));
			
			//TransaccionABM.getInstance().agregarViajeTren(3,Funciones.traerFecha(2018,5,10,9,0,0),1,1,1,1);
			//TransaccionABM.getInstance().agregarViajeSubte(3,Funciones.traerFecha(2018,5,10,9,0,0),1,1,1);
			//TransaccionABM.getInstance().agregarViajeColectivo(3,Funciones.traerFecha(2018,5,10,9,0,0),1,1,1);
			//TransaccionABM.getInstance().traerRecarga(); no anda
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}

	}

}

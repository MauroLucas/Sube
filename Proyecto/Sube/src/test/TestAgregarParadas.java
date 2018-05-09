package test;

import negocio.ParadaABM;
import negocio.TramoABM;

public class TestAgregarParadas {

	public static void main(String[] args) {
		
		//Linea C//
		ParadaABM.getInstance().agregar("Constitucion");
		ParadaABM.getInstance().agregar("San Juan");
		ParadaABM.getInstance().agregar("Independencia");
		ParadaABM.getInstance().agregar("Moreno");
		ParadaABM.getInstance().agregar("Av. de Mayo");
		ParadaABM.getInstance().agregar("Diagonal Norte");
		ParadaABM.getInstance().agregar("Lavalle");
		ParadaABM.getInstance().agregar("Gnral. San Martin");
		ParadaABM.getInstance().agregar("Retiro");

	}

}

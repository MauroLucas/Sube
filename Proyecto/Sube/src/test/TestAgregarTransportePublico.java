package test;

import negocio.TransportePublicoABM;

public class TestAgregarTransportePublico {

	public static void main(String[] args) throws Exception {

        
        TransportePublicoABM.getInstance().agregarColectivo("514");

	}

}

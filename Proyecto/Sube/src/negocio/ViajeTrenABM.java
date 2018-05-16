package negocio;

import java.util.GregorianCalendar;

import dao.ViajeTrenDao;
import datos.ViajeTren;

public class ViajeTrenABM {
	
	private static ViajeTrenABM instancia = null; // Patrón Singleton

	protected ViajeTrenABM() {}

	public static ViajeTrenABM getInstance() {
		if (instancia == null)
			instancia = new ViajeTrenABM();
		return instancia;
	}
	
	ViajeTrenDao dao=ViajeTrenDao.getInstance();
	
	public long agregar(float monto, GregorianCalendar fechaHora, int tarjetaSube, int tren, int origen, int destino) {
		ViajeTren vt=new ViajeTren(monto,fechaHora,tarjetaSube,tren,origen,destino);
		return dao.agregar(vt);
	}
	
	

}

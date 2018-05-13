package negocio;

import java.util.GregorianCalendar;

import dao.RecargaDao;
import datos.Recarga;

public class RecargaABM {
	
	private static RecargaABM instancia = null; // Patrón Singleton

	protected RecargaABM() {}

	public static RecargaABM getInstance() {
		if (instancia == null)
			instancia = new RecargaABM();
		return instancia;
	}
	
	RecargaDao dao=RecargaDao.getInstance();
	
	public long agregar(float monto, GregorianCalendar fechaHora, int tarjetaSube) {
		Recarga r=new Recarga(monto,fechaHora,tarjetaSube);
		return dao.agregar(r);
	}
	
	public boolean modificar(Recarga r) {
		return dao.modificar(r);
	}
	
	public boolean eliminar(Recarga r) {
		return dao.eliminar(r);
	}

}

package dao;

import datos.ViajeTren;

public class ViajeTrenDao {
	
	private static ViajeTrenDao instancia = null; // Patrón Singleton

	protected ViajeTrenDao() {}

	public static ViajeTrenDao getInstance() {
		if (instancia == null)
			instancia = new ViajeTrenDao();
		return instancia;
	}
	
	DAO dao= Singleton.getInstanciaDao();
	
	public long agregar(ViajeTren vt) {
		return dao.agregar(vt);
	}
	
	public boolean modificar(ViajeTren vt) {
		return dao.actualizar(vt);
	}
	
	public boolean eliminar(ViajeTren vt) {
		return dao.eliminar(vt);
	}

}

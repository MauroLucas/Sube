package dao;

import datos.Recarga;

public class RecargaDao {
	
	private static RecargaDao instancia = null; // Patrón Singleton

	protected RecargaDao() {}

	public static RecargaDao getInstance() {
		if (instancia == null)
			instancia = new RecargaDao();
		return instancia;
	}
	
	DAO dao= Singleton.getInstanciaDao();
	
	public long agregar(Recarga r) {
		return dao.agregar(r);
	}
	
	public boolean modificar(Recarga r) {
		return dao.actualizar(r);
	}
	
	public boolean eliminar(Recarga r) {
		return dao.eliminar(r);
	}
	
}

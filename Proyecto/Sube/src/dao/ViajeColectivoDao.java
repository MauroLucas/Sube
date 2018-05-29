package dao;

import datos.ViajeColectivo;

public class ViajeColectivoDao {
	
	private static ViajeColectivoDao instancia = null; // Patrón Singleton

	protected ViajeColectivoDao() {}

	public static ViajeColectivoDao getInstance() {
		if (instancia == null)
			instancia = new ViajeColectivoDao();
		return instancia;
	}
	
	DAO dao= Singleton.getInstanciaDao();
	
	public long agregar(ViajeColectivo vc) {
		return dao.agregar(vc);
	}
	
	public boolean modificar(ViajeColectivo vc) {
		return dao.actualizar(vc);
	}
	
	public boolean eliminar(ViajeColectivo vc) {
		return dao.eliminar(vc);
	}

}

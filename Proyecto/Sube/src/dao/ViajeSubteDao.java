package dao;

import datos.ViajeSubte;

public class ViajeSubteDao {
	
	DAO dao= Singleton.getInstanciaDao();
	
	public long agregar(ViajeSubte vs) {
		return dao.agregar(vs);
	}
	
	public boolean modificar(ViajeSubte vs) {
		return dao.actualizar(vs);
	}
	
	public boolean eliminar(ViajeSubte vs) {
		return dao.eliminar(vs);
	}

}

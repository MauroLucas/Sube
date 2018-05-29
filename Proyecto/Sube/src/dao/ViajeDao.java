package dao;

import datos.Viaje;

public class ViajeDao {
	
	DAO dao= Singleton.getInstanciaDao();
	
	public long agregar(Viaje v) {
		return dao.agregar(v);
	}
	
	public boolean modificar(Viaje v) {
		return dao.actualizar(v);
	}
	
	public boolean eliminar(Viaje v) {
		return dao.eliminar(v);
	}

}

package dao;

import datos.Transaccion;

public class TransaccionDao {
	
	DAO dao= Singleton.getInstanciaDao();
	
	public long agregar(Transaccion t) {
		return dao.agregar(t);
	}
	
	public boolean modificar(Transaccion t) {
		return dao.actualizar(t);
	}
	
	public boolean eliminar(Transaccion t) {
		return dao.eliminar(t);
	}
	

}

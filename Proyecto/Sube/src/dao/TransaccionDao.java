package dao;

import org.hibernate.HibernateException;

import datos.Transaccion;

public class TransaccionDao extends DAO{
	
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
	
	public Transaccion traer(int idTransaccion) throws HibernateException {
		Transaccion objeto = null;
		try {
		iniciaOperacion();
		objeto = (Transaccion)session.createQuery("from Transaccion t where t.idTransaccion="+idTransaccion).uniqueResult();
		} 
		finally {
		session.close();
		}
		return objeto;
	}

}

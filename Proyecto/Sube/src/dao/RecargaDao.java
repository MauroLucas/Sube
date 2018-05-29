package dao;

import java.util.List;

import org.hibernate.HibernateException;

import datos.Recarga;

public class RecargaDao extends DAO{
	
	private static RecargaDao instancia = null; // Patr�n Singleton

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
	
	public Recarga traerRecarga(int idRecarga) throws HibernateException {
		Recarga objeto = null;
		try {
		iniciaOperacion();
		objeto = (Recarga)session.createQuery("from Recarga r where r.idRecarga="+idRecarga).uniqueResult();
		} 
		finally {
		session.close();
		}
		return objeto;
	}
		
	@SuppressWarnings ("unchecked")
	public List<Recarga> traerRecarga() throws HibernateException {
		List<Recarga> lista= null;
		try {
		iniciaOperacion();
		lista=session.createQuery("from Recarga r order by r.idRecarga asc").list();
		} 
		finally {
		session.close();
		}
		return lista;
	}
	
}

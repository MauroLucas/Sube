package negocio;

import java.util.GregorianCalendar;

import dao.RedSubeDao;
import datos.RedSube;
import datos.TarjetaSube;

public class RedSubeABM {
	RedSubeDao dao = new RedSubeDao();
	
	public RedSube traerRedSube(long idRedSube) throws Exception{
		RedSube rs= dao.traerRedSube(idRedSube);
		return rs;
	}
	
	public long agregar(GregorianCalendar fechaHora, int contador, String linea, TarjetaSube tarjetasube) throws Exception{
		RedSube rs= new RedSube(fechaHora, contador, linea, tarjetasube);
		return dao.agregar(rs);
	}
	
	public void eliminar(long idRedSube) throws Exception{ 
			RedSube rs= dao.traerRedSube(idRedSube);
			dao.eliminar(rs);
	}
	
	public void modificar(RedSube rs) throws Exception{
		dao.actualizar(rs);
	}

}

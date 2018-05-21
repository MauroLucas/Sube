package negocio;

import dao.TarjetaSubeDao;
import datos.EstadoSube;
import datos.TarjetaSube;

public class TarjetaSubeABM {
	TarjetaSubeDao dao = new TarjetaSubeDao();
	
	public TarjetaSube traerTarjetaSube(long nroTarjeta) throws Exception{
		TarjetaSube t= dao.traerTarjetaSube(nroTarjeta);
		// Si la tarjeta no existe tirar error
		if(t==null)
			throw new Exception("La tarjeta no existe");
		return t;
	}
	
	public long agregar(int idUsuario, float saldo, int estado, EstadoSube estadoSube) throws Exception{
		TarjetaSube t= new TarjetaSube(idUsuario, saldo, estado, estadoSube);
		return dao.agregar(t);
	}
	
	public void eliminar(long nroTarjeta) throws Exception{ 
			TarjetaSube t= dao.traerTarjetaSube(nroTarjeta);
			if(t==null)
				throw new Exception("La tarjeta no existe");  
			else
				dao.eliminar(t);
	}
	
	public void modificar(TarjetaSube tarjetaSube) throws Exception{
		dao.actualizar(tarjetaSube);
	}

}

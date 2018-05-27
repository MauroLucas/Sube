package negocio;

import dao.TarjetaSubeDao;
import datos.TarjetaSube;

public class TarjetaSubeABM {
	
	private static TarjetaSubeABM instancia = null;
	protected TarjetaSubeABM() {}
	
	public static TarjetaSubeABM getInstance() {
		if(instancia==null) {
			instancia = new TarjetaSubeABM();
		}
		return instancia;
	}
	
	public long agregarSube(long nroTarjeta, int idUsuario) {
		TarjetaSube t=new TarjetaSube(nroTarjeta,idUsuario,0);
		return TarjetaSubeDao.getInstance().agregar(t);
	}
	
	public TarjetaSube traerTarjetaSube(long nroTarjeta) {
		return TarjetaSubeDao.getInstance().traerTarjetaSube(nroTarjeta);
	}

}

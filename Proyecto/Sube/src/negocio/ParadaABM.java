package negocio;
import datos.Parada;
import dao.ParadaDao;

public class ParadaABM {
	
	private static ParadaABM instance = null;
	
	protected ParadaABM() {}
	
	public static ParadaABM getInstance() {
		if(instance==null) {
			instance = new ParadaABM();
		}
		return instance;
	}
	
	
	public long agregar(String nombre) {
		Parada parada = new Parada(nombre);
		return ParadaDao.getInstance().agregar(parada);
	}
	
	public Parada traer(long idParada) {
		return ParadaDao.getInstance().traer(idParada);
	}

}

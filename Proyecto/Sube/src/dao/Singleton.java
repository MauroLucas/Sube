package dao;

public class Singleton {
	
	private static DAO instanciaDao;
	
	protected Singleton(){}
	
	public static DAO getInstanciaDao() {
		if(instanciaDao==null){
		instanciaDao = new DAO();
		}
		return instanciaDao;
	}

}

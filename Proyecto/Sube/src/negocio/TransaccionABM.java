package negocio;

import java.util.GregorianCalendar;

import dao.*;
import datos.*;

public class TransaccionABM {
	
	private static TransaccionABM instancia = null; // Patrón Singleton

	protected TransaccionABM() {}

	public static TransaccionABM getInstance() {
		if (instancia == null)
			instancia = new TransaccionABM();
		return instancia;
	}
	
	RecargaDao dao=RecargaDao.getInstance();
	
	public long agregarRecarga(float monto, GregorianCalendar fechaHora, int tarjetaSube) {
		Recarga r=new Recarga(monto,fechaHora,tarjetaSube);
		return dao.agregar(r);
	}
	
	public boolean modificarRecarga(Recarga r) {
		return dao.modificar(r);
	}
	
	public boolean eliminarRecarga(Recarga r) {
		return dao.eliminar(r);
	}
	
	ViajeTrenDao daoVT=ViajeTrenDao.getInstance();
	
	public long agregarViajeTren(float monto, GregorianCalendar fechaHora, int tarjetaSube, int tren, int origen, int destino) {
		ViajeTren vt=new ViajeTren(monto,fechaHora,tarjetaSube,tren,origen,destino);
		return daoVT.agregar(vt);
	}
	
	public boolean modificarViajeTren(ViajeTren vt) {
		return daoVT.modificar(vt);
	}
	
	public boolean eliminarViajeTren(ViajeTren vt) {
		return daoVT.eliminar(vt);
	}
	
	ViajeSubteDao daoVS=ViajeSubteDao.getInstance();
	
	public long agregarViajeSubte(float monto, GregorianCalendar fechaHora, int tarjetaSube, int subte, int origen) {
		ViajeSubte vs=new ViajeSubte(monto,fechaHora,tarjetaSube,subte,origen);
		return daoVS.agregar(vs);
	}
	
	public boolean modificarViajeSubte(ViajeSubte vs) {
		return daoVS.modificar(vs);
	}
	
	public boolean eliminarViajeSubte(ViajeSubte vs) {
		return daoVS.eliminar(vs);
	}
	
	ViajeColectivoDao daoVC=ViajeColectivoDao.getInstance();
	
	public long agregarViajeColectivo(float monto, GregorianCalendar fechaHora, int tarjetaSube, int colectivo, int tramo) {
		ViajeColectivo vc=new ViajeColectivo(monto,fechaHora,tarjetaSube,colectivo,tramo);
		return daoVC.agregar(vc);
	}
	
	public boolean modificarViajeColectivo(ViajeColectivo vc) {
		return daoVC.modificar(vc);
	}
	
	public boolean eliminarViajeColectivo(ViajeColectivo vc) {
		return daoVC.eliminar(vc);
	}

}

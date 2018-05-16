package datos;

import java.util.GregorianCalendar;

public class ViajeSubte extends Viaje{
	
	private int origen;
	
	public ViajeSubte() {}

	public ViajeSubte(float monto, GregorianCalendar fechaHora, int tarjetaSube, int subte, int origen) {
		super(monto,fechaHora,tarjetaSube,subte);
		this.origen = origen;
	}

	public int getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "ViajeSubte [origen=" + origen + ", transporte=" + transporte + ", idTransaccion=" + idTransaccion
				+ ", monto=" + monto + ", fechaHora=" + fechaHora + ", tarjetaSube=" + tarjetaSube + "]";
	}
	
	
	

}

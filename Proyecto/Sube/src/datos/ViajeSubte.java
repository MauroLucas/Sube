package datos;

import java.util.GregorianCalendar;

public class ViajeSubte extends Viaje{
	
	private String origen;

	public ViajeSubte(float monto, GregorianCalendar fechaHora, int tarjetaSube, int subte, String origen) {
		super(monto,fechaHora,tarjetaSube,subte);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "ViajeSubte [origen=" + origen + ", transporte=" + transporte + ", idTransaccion=" + idTransaccion
				+ ", monto=" + monto + ", fechaHora=" + fechaHora + ", tarjetaSube=" + tarjetaSube + "]";
	}
	
	
	

}

package datos;

import java.util.GregorianCalendar;

public class ViajeColectivo extends Viaje {
	
	private int tramo;
	
	public ViajeColectivo() {}

	public ViajeColectivo(float monto, GregorianCalendar fechaHora, int tarjetaSube, int colectivo, int tramo) {
		super(monto, fechaHora, tarjetaSube, colectivo);
		this.tramo = tramo;
	}

	public int getTramo() {
		return tramo;
	}

	public void setTramo(int tramo) {
		this.tramo = tramo;
	}

	@Override
	public String toString() {
		return "ViajeColectivo [tramo=" + tramo + ", transporte=" + transporte + ", idTransaccion=" + idTransaccion
				+ ", monto=" + monto + ", fechaHora=" + fechaHora + ", tarjetaSube=" + tarjetaSube + "]";
	}
	
	
	

}

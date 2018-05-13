package datos;

import java.util.GregorianCalendar;

public abstract class Viaje extends Transaccion{
	
	protected int transporte;
	
	public Viaje() {}
	
	public Viaje(float monto, GregorianCalendar fechaHora, int tarjetaSube, int transporte) {
		super(monto,fechaHora,tarjetaSube);
		this.transporte = transporte;
	}

	public int getTransporte() {
		return transporte;
	}

	public void setTransporte(int transporte) {
		this.transporte = transporte;
	}

	@Override
	public String toString() {
		return "Viaje [transporte=" + transporte + ", idTransaccion=" + idTransaccion + ", monto=" + monto
				+ ", fechaHora=" + fechaHora + ", tarjetaSube=" + tarjetaSube + "]";
	}

	
	

}

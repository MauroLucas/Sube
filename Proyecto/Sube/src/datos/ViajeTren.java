package datos;

import java.util.GregorianCalendar;

public class ViajeTren extends Viaje{
	
	private int origen;
	private int destino;
	
	public ViajeTren() {}
	
	public ViajeTren(float monto, GregorianCalendar fechaHora, int tarjetaSube, int tren, int origen, int destino) {
		super(monto,fechaHora,tarjetaSube,tren);
		this.origen = origen;
		this.destino = destino;
	}

	public int getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "ViajeTren [origen=" + origen + ", destino=" + destino + "]";
	}
	
	
	
	
	

}

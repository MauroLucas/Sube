package datos;

import java.util.GregorianCalendar;

public class ViajeTren extends Viaje{
	
	private String origen;
	private String destino;
	
	public ViajeTren(float monto, GregorianCalendar fechaHora, int tarjetaSube, int tren, String origen, String destino) {
		super(monto,fechaHora,tarjetaSube,tren);
		this.origen = origen;
		this.destino = destino;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "ViajeTren [origen=" + origen + ", destino=" + destino + "]";
	}
	
	
	
	
	

}

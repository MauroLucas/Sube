package datos;

import java.util.GregorianCalendar;
import datos.TarjetaSube;
import modelo.Funciones;

public class RedSube {
	private long idRedSube;
	private GregorianCalendar fechaHora;
	private int contador;
	private TarjetaSube tarjetasube;
	
	public RedSube() {
	}

	public RedSube(GregorianCalendar fechaHora, int contador, TarjetaSube tarjetasube) {
		super();
		this.fechaHora = fechaHora;
		this.contador = contador;
		this.tarjetasube = tarjetasube;
	}

	public long getIdRedSube() {
		return idRedSube;
	}

	protected void setIdRedSube(long idRedSube) {
		this.idRedSube = idRedSube;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public TarjetaSube getTarjetasube() {
		return tarjetasube;
	}

	public void setTarjetasube(TarjetaSube tarjetasube) {
		this.tarjetasube = tarjetasube;
	}

	@Override
	public String toString() {
		return "RedSube [idRedSube: " + idRedSube + ", fechaHora: " + Funciones.traerFechaCortaHora(fechaHora) + ", contador: " + contador + "]";
	}
	
	
	
	
}

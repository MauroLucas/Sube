package datos;
import java.util.Set;
public class Subte extends TransportePublico {
	
	private Set<Parada> paradas;
	
	public Subte() {}
	
	public Subte(String linea) {
		super(linea);
	}

	public Set<Parada> getParadas() {
		return paradas;
	}

	public void setParadas(Set<Parada> paradas) {
		this.paradas = paradas;
	}
	
	public boolean agregar(Parada parada) {
		return paradas.add(parada);
	}

	@Override
	public String toString() {
		return "Subte [idTransporte=" + idTransporte + ", linea=" + linea + "]";
	}

	
	
	
	

}

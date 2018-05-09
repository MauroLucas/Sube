package datos;
import java.util.Set;
public class Colectivo extends TransportePublico {
	
	
	private Set<Tramo> tramos;
	
	public Colectivo() {}
	
	public Colectivo(String linea) {
		super(linea);
		
	}

	public Set<Tramo> getTramos() {
		return tramos;
	}

	public void setTramos(Set<Tramo> tramos) {
		this.tramos = tramos;
	}
	
	public boolean agregar(Tramo tramo) {
		return tramos.add(tramo);
	}

	@Override
	public String toString() {
		return "Colectivo [idTransporte=" + idTransporte + ", linea=" + linea + "]";
	}
	
	
	
	
	
    
    
    
}

package datos;

import java.util.Set;

public class Tren extends TransportePublico {
	
   private Set<Parada> paradas;
	
	public Tren() {}
	
	public Tren(String linea) {
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
	
	

}

package datos;

public class Parada {
	
	private long idParada;
	private String nombre;
	
	public Parada() {};
	
	public Parada(String nombre) {
		this.nombre = nombre;
	}
	
	protected void setIdParada(long idParada) {
		this.idParada = idParada;
	}
	
	public long getIdParada() {
		return idParada;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Parada [idParada=" + idParada + ", nombre=" + nombre + "]";
	}
	
	

}

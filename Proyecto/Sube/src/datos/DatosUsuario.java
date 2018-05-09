package datos;

import enums.Generos;

public class DatosUsuario {
	private long idDatosUsuario;
	private String nombre;
	private String apellido;
	private Generos genero;
	private Contacto contacto;

	public DatosUsuario() { }
	
	public DatosUsuario(String nombre, String apellido, Generos genero, Contacto contacto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.contacto = contacto;
	}

	public long getIdDatosUsuario() {
		return idDatosUsuario;
	}

	@SuppressWarnings("unused")
	private void setIdDatosUsuario(long idDatosUsuario) {
		this.idDatosUsuario = idDatosUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	public String getGenero() {
		return genero.genero();
	}
	
	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "DatosUsuario [idDatosUsuario=" + idDatosUsuario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", genero=" + genero + ", contacto=" + contacto + "]";
	}
}	

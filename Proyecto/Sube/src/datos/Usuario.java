package datos;

import java.util.GregorianCalendar;

import enums.TipoDeDocumento;

public class Usuario {
	private long idUsuario;
	private TipoDeDocumento tipoDocumento;
	private String documento;
	private String clave;
	private GregorianCalendar fechaAlta;
	private DatosUsuario datosUsuario;
	
	public Usuario() { }
	
	public Usuario(TipoDeDocumento tipoDocumento, String documento, String clave, GregorianCalendar fechaAlta,
			DatosUsuario datosUsuario) {
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.clave = clave;
		this.fechaAlta = fechaAlta;
		this.datosUsuario = datosUsuario;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	@SuppressWarnings("unused")
	private void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTipoDocumento() {
		return tipoDocumento.tipoDeDocumento();
	}

	public void setTipoDocumento(TipoDeDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(GregorianCalendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public DatosUsuario getDatosUsuario() {
		return datosUsuario;
	}

	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", tipoDocumento=" + tipoDocumento.tipoDeDocumento() + ", documento=" + documento
				+ ", clave=" + clave + ", fechaAlta=" + fechaAlta + ", datosUsuario=" + datosUsuario + "]";
	}
}
package datos;

public class TarjetaSube {
	private long nroTarjeta;
	private int idUsuario;
	private float saldo;
	private int estado;
	private EstadoSube estadoSube;
	private RedSube redSube;
	
	public TarjetaSube() {
		super();
	}

	public TarjetaSube(int idUsuario, float saldo, int estado, EstadoSube estadoSube) {
		super();
		this.idUsuario = idUsuario;
		this.saldo = saldo;
		this.estado = estado;
		this.estadoSube = estadoSube;
	}

	public long getNroTarjeta() {
		return nroTarjeta;
	}

	protected void setNroTarjeta(long nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public EstadoSube getEstadosube() {
		return estadoSube;
	}

	public void setEstadosube(EstadoSube estadoSube) {
		this.estadoSube = estadoSube;
	}

	public RedSube getRedSube() {
		return redSube;
	}

	public void setRedSube(RedSube redSube) {
		this.redSube = redSube;
	}
	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public EstadoSube getEstadoSube() {
		return estadoSube;
	}

	public void setEstadoSube(EstadoSube estadoSube) {
		this.estadoSube = estadoSube;
	}

	@Override
	public String toString() {
		return "TarjetaSube [nroTarjeta=" + nroTarjeta + ", idUsuario=" + idUsuario + ", saldo=" + saldo
				+ ", estado=" + estado + "]";
	}
	
}

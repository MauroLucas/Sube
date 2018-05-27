package datos;

public class TarjetaSube {
	
	private long nroTarjeta;
	private int idUsuario;
	private float saldo;
	
	public TarjetaSube() {}
	
	public TarjetaSube(long nroTarjeta, int idUsuario, float saldo) {
		super();
		this.nroTarjeta = nroTarjeta;
		this.idUsuario = idUsuario;
		this.saldo = saldo;
	}
	public long getNroTarjeta() {
		return nroTarjeta;
	}
	public void setNroTarjeta(long nroTarjeta) {
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
	@Override
	public String toString() {
		return "TarjetaSube [nroTarjeta=" + nroTarjeta + ", idUsuario=" + idUsuario + ", saldo=" + saldo + "]";
	}
	
	

}

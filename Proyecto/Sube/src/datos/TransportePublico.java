package datos;

public abstract class TransportePublico {
	protected long idTransporte;
	protected String linea;
	
	public TransportePublico() {}
	
	public TransportePublico(String linea) {
		super();
		this.linea = linea;
	}
	
	protected void setIdTransporte(long idTransporte) {
		this.idTransporte = idTransporte;
	}
	
	public long getIdTransporte() {
		return idTransporte;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	
	
	
	

}

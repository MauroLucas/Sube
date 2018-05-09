package enums;

public enum TipoDeDocumento {
	DocumentoNacional("Documento Nacional"),
	DocumentoExtranjero("Documento Extranjero");
	
	private String tipoDeDocumento;
	
	TipoDeDocumento(String tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}
	
	public String tipoDeDocumento() {
		return this.tipoDeDocumento;
	}
}

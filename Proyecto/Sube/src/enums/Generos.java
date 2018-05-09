package enums;

public enum Generos {
	FEMENINO("F"),
	MASCULINO("M"),
	INDEFINIDO("X");

	private String genero;

	Generos(String genero){
		this.genero = genero;
	}
	
	public String genero() {
		return genero;
	}
}

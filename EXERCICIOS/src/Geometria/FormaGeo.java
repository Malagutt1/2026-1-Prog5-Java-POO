package Geometria;

public abstract class FormaGeo {
	private String Nome;
	public abstract int calcArea();
	
	public FormaGeo(String nome) {
		super();
		Nome = nome;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	

}

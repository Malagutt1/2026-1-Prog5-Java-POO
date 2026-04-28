package Exercicios_Heranca.Herenca_Sobrescrita;

public class FormaGeometrica {
	private String nome;

	public FormaGeometrica(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
    public double calculaArea() {
        return 0;
    }
	
	
}

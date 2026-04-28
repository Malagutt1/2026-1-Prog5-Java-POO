package Exercicios_Heranca.Veiculos;

public class Aquativo extends Veiculo{
	private String casco;

	public Aquativo(int peso, String motor, String casco) {
		super(peso, motor);
		this.casco = casco;
	}

	public String getCasco() {
		return casco;
	}

	public void setCasco(String casco) {
		this.casco = casco;
	}	
}

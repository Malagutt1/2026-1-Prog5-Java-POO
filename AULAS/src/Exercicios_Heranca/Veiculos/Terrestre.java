package Exercicios_Heranca.Veiculos;

public class Terrestre extends Veiculo{
	private int qtdRodas;

	public Terrestre(int peso, String motor, int qtdRodas) {
		super(peso, motor);
		this.qtdRodas = qtdRodas;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
}

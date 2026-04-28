package Exercicios_Heranca.Veiculos;
/*
 * 1. Vamos criar a classe mãe chamada veículo.
	1. O que todos os veículos tem em comum?
	R: Uma classe mãe chamada VEICULO que tem as classes filhas TERRESTRE e AQUATICO
	
	2. Após vamos criar as classes filhas chamadas
	terrestre e aquático.
	1. O que as classes filhas tem em específico que seja
	apenas características e comportamentos delas
	próprias?
	
	3. Vamos instanciar um objeto de cada classe filha
	que herda características da classe mãe chamada
	veículo.
	VEICULO: Atributos: – Peso – Motor
	TERRESTRE: Atributos: – Rodas
	AQUATICO: Atributos: – Casco*/


public class Veiculo {
	private int peso;
	private String motor;
	
	public Veiculo(int peso, String motor) {
		super();
		this.peso = peso;
		this.motor = motor;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	

}

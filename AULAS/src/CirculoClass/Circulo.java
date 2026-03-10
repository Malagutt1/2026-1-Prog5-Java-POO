package CirculoClass;

public class Circulo {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	public Circulo() {}


	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	// AREA
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	// DIAMETRO
	public double diametro() {
		return raio * 2;
	}

	// CIRCUNFERENCIA
	public double circunferencia() {
		return 2 * Math.PI * raio;
	}

}
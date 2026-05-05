package FormaGeo;

public final class Triangulo extends FormaGeo{ // Classe que não pode ser herdada (FINAL)
	private float lado1;
	private float lado2;
		
	public float getLado1() {
		return lado1;
	}
	
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public Triangulo(float area, float lado1, float lado2) {
		super(area);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public float calcArea() {
		return(this.lado1 * this.lado2)/2;
	}
	

}

package FormaGeo;

public final class Quadrado extends FormaGeo {
	private float lado;

	public Quadrado(float area, float lado) {
		super(area);
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public float calcArea() {
		return (float) Math.pow(this.lado, 2);
	}

}

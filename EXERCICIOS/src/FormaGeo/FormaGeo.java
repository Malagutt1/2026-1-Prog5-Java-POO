package FormaGeo;

public abstract class FormaGeo {
	private float area;
	
	
	public FormaGeo(float area) {
		super();
		this.area = area;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	
	public abstract float calcArea(); // Ele é obrigatorio a ser instanciado nas classes filhas
	
}

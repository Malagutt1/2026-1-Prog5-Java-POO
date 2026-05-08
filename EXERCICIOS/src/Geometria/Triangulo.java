package Geometria;

public final class Triangulo extends FormaGeo implements FiguraGeometrica {
    private int lado1;
    private int lado2;

    public Triangulo(String nome, int lado1, int lado2) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String getNomeFigura() {
        return this.getNome();
    }

    @Override
    public int getArea() {
        return (lado1 * lado2) / 2;
    }

    @Override
    public int getPerimetro() {
        return lado1 * 3;
    }

    @Override
    public int calcArea() {
        return getArea();
    }
}
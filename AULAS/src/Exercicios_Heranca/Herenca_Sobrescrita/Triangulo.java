package Exercicios_Heranca.Herenca_Sobrescrita;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (base * altura) / 2;
    }
}

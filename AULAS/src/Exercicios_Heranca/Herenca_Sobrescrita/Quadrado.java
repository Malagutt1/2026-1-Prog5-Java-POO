package Exercicios_Heranca.Herenca_Sobrescrita;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}

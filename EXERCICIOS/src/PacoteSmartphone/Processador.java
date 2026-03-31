package PacoteSmartphone;

public class Processador {
    private String marca;
    private String modelo;
    private double velocidade; // em GHz
    
    public Processador() {
        this.marca = "Intel";
        this.modelo = "i5";
        this.velocidade = 2.5;
    }

    public Processador(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}

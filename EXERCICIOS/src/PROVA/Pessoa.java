package PROVA;

public class Pessoa {
    private MicroOndas microOndas;
    private String nome;

    public Pessoa(MicroOndas microOndas, String nome) {
        this.microOndas = microOndas;
        this.nome = nome;
    }

    // Método que adiciona 30 segundos ao micro-ondas
    public void mais30Micro() {
        this.microOndas.mais30Micro();
    }
}
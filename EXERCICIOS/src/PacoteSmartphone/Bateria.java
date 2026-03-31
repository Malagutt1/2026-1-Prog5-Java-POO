package PacoteSmartphone;

public class Bateria {
    private int capacidade; // em mAh

    public Bateria() {
        this.capacidade = 4000; 
    }

    public Bateria(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}

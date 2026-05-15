package PROVA;

public class MicroOndas {
    private int tempo; // Em segundos

    public MicroOndas(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public void mais30Micro() {
        this.tempo += 30;
        System.out.println("Tempo do micro-ondas: " + this.tempo + " segundos");
    }
}
package PacoteSmartphone;

public class Tela {
    private double tamanho; // em polegadas
    private String resolucao;
    
    public Tela() {
        this.tamanho = 15.6;
        this.resolucao = "1920x1080";
    }

    public Tela(double tamanho, String resolucao) {
        this.tamanho = tamanho;
        this.resolucao = resolucao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
}

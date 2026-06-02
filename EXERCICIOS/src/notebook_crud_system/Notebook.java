package notebook_crud_system;

public class Notebook {
    private Processador processador;
    private PlacaVideo placaVideo;
    private Tela tela;

    private String marca; 
    private String modelo;
    private String tipo; // Gamer / normal
    private double preco;
    private int memoriaRamGb;
    private int armazenamentoGb;

    public Notebook(String marca, String modelo, String tipo, double preco, 
                    Processador processador, PlacaVideo placaVideo, int memoriaRamGb, 
                    int armazenamentoGb, Tela tela) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
        this.processador = processador;
        this.placaVideo = placaVideo;
        this.memoriaRamGb = memoriaRamGb;
        this.armazenamentoGb = armazenamentoGb;
        this.tela = tela;
    }

    // TOSTRING ATUALIZADO
    @Override
    public String toString() {
        return "===================================\n" +
               " BRAND/MODELO: " + marca + " " + modelo + " (" + tipo + ")\n" +
               " PREÇO: R$ " + String.format("%.2f", preco) + "\n" +
               "-----------------------------------\n" +
               " CPU: " + processador.toString() + "\n" + // Chama o toString do Processador
               " GPU: " + placaVideo + "\n" +
               " RAM: " + memoriaRamGb + " GB | SSD: " + armazenamentoGb + " GB\n" +
               " TELA: " + tela.toString() + "\n" + // Chama o toString da Tela
               "===================================";
    }

    // GETTERS E SETTERS ATUALIZADOS
    public Processador getProcessador() { return processador; }
    public void setProcessador(Processador processador) { this.processador = processador; }

    public Tela getTela() { return tela; }
    public void setTela(Tela tela) { this.tela = tela; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public PlacaVideo getPlacaVideo() { return placaVideo; }
    public void setPlacaVideo(PlacaVideo placaVideo) { this.placaVideo = placaVideo; }

    public int getMemoriaRamGb() { return memoriaRamGb; }
    public void setMemoriaRamGb(int memoriaRamGb) { this.memoriaRamGb = memoriaRamGb; }

    public int getArmazenamentoGb() { return armazenamentoGb; }
    public void setArmazenamentoGb(int armazenamentoGb) { this.armazenamentoGb = armazenamentoGb; }
}
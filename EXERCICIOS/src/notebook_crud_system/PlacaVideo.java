package notebook_crud_system;

public class PlacaVideo {
    private String modelo;    // Ex: "NVIDIA RTX 4060" ou "Intel Iris Xe"
    private String tipo;      // Ex: "Dedicada" ou "Integrada"
    private int vramGb;       // Ex: 8, 6 (coloque 0 se for integrada)

    // CONSTRUTOR: Para inicializar a placa de vídeo
    public PlacaVideo(String modelo, String tipo, int vramGb) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.vramGb = vramGb;
    }

    // TOSTRING: Mostra os detalhes da placa direto na ficha técnica
    @Override
    public String toString() {
        if (tipo.equalsIgnoreCase("Integrada")) {
            return modelo + " (Integrada)";
        }
        return modelo + " (Dedicada - " + vramGb + "GB VRAM)";
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getVramGb() { return vramGb; }
    public void setVramGb(int vramGb) { this.vramGb = vramGb; }
}
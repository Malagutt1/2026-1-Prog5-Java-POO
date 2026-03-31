package PacoteSmartphone;

public class Smartphone {
    private Ram ram;
    private Processador processador;
    private Tela tela;
    private Bateria bateria;
    private Camera camera;
    private String modelo;

    // Construtor padrão
    public Smartphone() {
        this.modelo = "Desconhecido";
        this.ram = new Ram();
        this.processador = new Processador();
        this.tela = new Tela();
        this.bateria = new Bateria();
        this.camera = new Camera();
    }

    public Smartphone(String modelo, Ram ram, Processador processador, Tela tela, Bateria bateria, Camera camera) {
        this.modelo = modelo;
        this.ram = ram;
        this.processador = processador;
        this.tela = tela;
        this.bateria = bateria;
        this.camera = camera;
    }

    // GETTERS
    public String getModelo() {
        return modelo;
    }

    public Ram getRam() {
        return ram;
    }

    public Processador getProcessador() {
        return processador;
    }

    public Tela getTela() {
        return tela;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Camera getCamera() {
        return camera;
    }

    // SETTERS
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    // Método para imprimir características
    public void imprimirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("RAM: " + ram.getTipo() + " - " + ram.getCapacidade() + "GB");
        System.out.println("Processador: " + processador.getMarca() + " " + processador.getModelo() + " - " + processador.getVelocidade() + "GHz");
        System.out.println("Tela: " + tela.getTamanho() + "\" - " + tela.getResolucao());
        System.out.println("Bateria: " + bateria.getCapacidade() + " mAh");
        System.out.println("Camera: " + camera.getResolucao());
        System.out.println("----------------------------");
    }
}

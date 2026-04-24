package TelevisaoControle;

public class televisao {
    private String marca;
    private int volume;
    private int canal;
    private boolean ligada;
    private int canalAnterior = 1;

    public televisao(String marca, int volume, int canal, boolean ligada) {
        this.marca = marca;
        this.volume = volume;
        this.canal = canal;
        this.ligada = ligada;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public boolean isLigada() {
        return ligada;
    }

// ===== MÉTODOS =====

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("TV ligada!");
        } else {
            System.out.println("A TV já está ligada!");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("TV desligada!");
        } else {
            System.out.println("A TV já está desligada!");
        }
    }

    public void aumentarVolume() {
        if (!ligada) {
            System.out.println("Erro: TV desligada!");
            return;
        }

        if (volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume máximo!");
        }
    }

    public void diminuirVolume() {
        if (!ligada) {
            System.out.println("Erro: TV desligada!");
            return;
        }

        if (volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume mínimo!");
        }
    }

    public void passarCanal() {
        if (!ligada) {
            System.out.println("TV desligada!");
            return;
        }

        canalAnterior = canal;
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void voltarCanal() {
        if (!ligada) {
            System.out.println("TV desligada!");
            return;
        }

        if (canal > 1) {
            canalAnterior = canal;
            canal--;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("Canal mínimo!");
        }
    }

    public void trocarCanal(int novo) {
        if (ligada) {
            canalAnterior = canal;
            canal = novo;
        }
    }

    public void canalAnterior() {
        if (ligada) {
            int temp = canal;
            canal = canalAnterior;
            canalAnterior = temp;
        }
    }

    public void status() {
        System.out.println("\n--- STATUS ---");
        System.out.println("Marca: " + marca);
        System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }
}
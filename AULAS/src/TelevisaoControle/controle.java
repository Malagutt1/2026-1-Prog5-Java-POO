package TelevisaoControle;

public class controle {
    televisao tv;

    public controle(televisao tv) {
        this.tv = tv;
    }

    public void ligarTV() {
        tv.ligar();
    }

    public void desligarTV() {
        tv.desligar();
    }

    public void aumentarVolume() {
        tv.aumentarVolume();
    }

    public void diminuirVolume() {
        tv.diminuirVolume();
    }

    public void subirCanal() {
        tv.passarCanal();
    }

    public void descerCanal() {
        tv.voltarCanal();
    }

    public void trocarCanal(int canal) {
        tv.trocarCanal(canal);
    }

    public void canalAnterior() {
        tv.canalAnterior();
    }
}
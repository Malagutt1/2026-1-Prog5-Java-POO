package PROVA;

public class Carro_Motor {
    private String modelo;
    private Motor motor;

    public Carro_Motor(String modelo, int potenciaMotor) {
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor);
    }

    public void ligarCarro() {
        System.out.println("Carro " + modelo + " ligado.");
        motor.ligar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


/*
 * 5) Explique por que é composição ou agragação. 
 * R: Significa meio que "Carro contem um motor" e nãoherabça pois não está sendo herdado
*/
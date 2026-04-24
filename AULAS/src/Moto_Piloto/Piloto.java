package Moto_Piloto;

public class Piloto {

	Motocicleta moto;
    private String nome;

    public Piloto(String nome, Motocicleta moto) {
        this.nome = nome;
        this.moto = moto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Motocicleta getMoto() {
        return moto;
    }

    public void setMoto(Motocicleta moto) {
        this.moto = moto;
    }

    public void acelerarMoto() {
        moto.acelerar();
    }

    public void frearMoto() {
        moto.frear();
        
    }

    public void subirMarcha() {
        moto.aumentarMarcha();
    }

    public void descerMarcha() {
        moto.diminuirMarcha();
    }
}
package PROVA;

public class CarroAbstrato extends Veiculo {
    public CarroAbstrato(String marca) {
        super(marca);
    }

    @Override //método abstrato
    public void mover() {
        System.out.println("O carro está se movendo.");
    }
}
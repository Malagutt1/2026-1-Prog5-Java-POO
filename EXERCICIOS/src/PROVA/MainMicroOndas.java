package PROVA;

public class MainMicroOndas {
	public static void main(String[] args) {
        MicroOndas m = new MicroOndas(60);
        Pessoa p = new Pessoa(m, "Kauã");
        p.mais30Micro();
        p.mais30Micro(); 

	}
}

package Jogo2Classes;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   HARRY POTTER e VOLDEMORT");
        System.out.println("=================================");

        // Criando personagens
        Mago harry = new Mago("Harry Potter", 100, 200, "Expecto Patronum");
        Mago voldemort = new Mago("Lord Voldemort", 120, 250, "Avada Kedavra");

        // Mostrando os status
        System.out.println("== Harry Potter:");
        harry.exibirStatusCompleto();

        System.out.println("\n== Lord Voldemort:");
        voldemort.exibirStatusCompleto();

    }
}
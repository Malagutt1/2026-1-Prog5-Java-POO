package Exercicios_Heranca.Veiculos;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tkl = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Criar veículo terrestre");
            System.out.println("2 - Criar veículo aquático");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = tkl.nextInt();

            if (opcao == 1) {
                System.out.print("Peso: ");
                int peso = tkl.nextInt();

                System.out.print("Motor: ");
                String motor = tkl.next();

                System.out.print("Quantidade de rodas: ");
                int rodas = tkl.nextInt();

                Terrestre t = new Terrestre(peso, motor, rodas);

                System.out.println("\n--- Dados do Terrestre ---");
                System.out.println("Peso: " + t.getPeso());
                System.out.println("Motor: " + t.getMotor());
                System.out.println("Rodas: " + t.getQtdRodas());

            } else if (opcao == 2) {
                System.out.print("Peso: ");
                int peso = tkl.nextInt();

                System.out.print("Motor: ");
                String motor = tkl.next();

                System.out.print("Casco: ");
                String casco = tkl.next();

                Aquativo a = new Aquativo(peso, motor, casco);

                System.out.println("\n--- Dados do Aquático ---");
                System.out.println("Peso: " + a.getPeso());
                System.out.println("Motor: " + a.getMotor());
                System.out.println("Casco: " + a.getCasco());

            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        tkl.close();
    }
}


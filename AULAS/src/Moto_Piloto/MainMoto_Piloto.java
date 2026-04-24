package Moto_Piloto;

import java.util.Scanner;

public class MainMoto_Piloto {
    public static void main(String[] args) {
        Scanner tkl = new Scanner(System.in);
        Motocicleta moto = new Motocicleta("Honda", 0, 0, "ABC-1234");
        Piloto piloto = new Piloto("Kauã", moto);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Subir marcha");
            System.out.println("4 - Descer marcha");
            System.out.println("5 - Ver status");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = tkl.nextInt();

            if (opcao == 1) {
                piloto.acelerarMoto();
            }

            if (opcao == 2) {
                piloto.frearMoto();
            }

            if (opcao == 3) {
                piloto.subirMarcha();
            }

            if (opcao == 4) {
                piloto.descerMarcha();
            }

            if (opcao == 5) {
                System.out.println("\n--- STATUS ---");
                System.out.println("Piloto: " + piloto.getNome());
                System.out.println("Marca: " + moto.getMarca());
                System.out.println("Velocidade: " + moto.getVelocidade());
                System.out.println("Marcha: " + moto.getMarcha());
                System.out.println("Placa: " + moto.getPlaca());
            }

            if (opcao < 0 || opcao > 5) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Encerrando...");
        tkl.close();
    }
}
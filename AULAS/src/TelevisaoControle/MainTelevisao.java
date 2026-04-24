package TelevisaoControle;

import java.util.Scanner;

public class MainTelevisao {

    public static void main(String[] args) {

        Scanner tkl = new Scanner(System.in);

        televisao tv = new televisao("LG", 0, 1, false);
        controle controle = new controle(tv);

        int op;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Volume +");
            System.out.println("4 - Volume -");
            System.out.println("5 - Canal +");
            System.out.println("6 - Canal -");
            System.out.println("7 - Trocar canal");
            System.out.println("8 - Canal anterior");
            System.out.println("9 - Status");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            op = tkl.nextInt();

            if (op == 1) controle.ligarTV();
            if (op == 2) controle.desligarTV();
            if (op == 3) controle.aumentarVolume();
            if (op == 4) controle.diminuirVolume();
            if (op == 5) controle.subirCanal();
            if (op == 6) controle.descerCanal();

            if (op == 7) {
                System.out.print("Canal: ");
                int c = tkl.nextInt();
                controle.trocarCanal(c);
            }

            if (op == 8) controle.canalAnterior();

            if (op == 9) tv.status();

        } while (op != 0);

        tkl.close();
        System.out.println("Encerrado.");
    }
}
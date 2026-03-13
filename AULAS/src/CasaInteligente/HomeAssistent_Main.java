package CasaInteligente;
import java.util.Scanner;

public class HomeAssistent_Main {
    public static void main(String[] args) {

        Scanner tkl = new Scanner(System.in);
        CasaInteligente minhaCasa = new CasaInteligente("Minha Casa");

        int op = 0;

        do {
            System.out.println("\n======== MENU CASA INTELIGENTE ========");
            System.out.println("1 - Renomear Casa");
            System.out.println("2 - Ver Status da Casa");
            System.out.println("3 - Alterar Temperatura");
            System.out.println("4 - Ligar Casa");
            System.out.println("5 - Ativar Modo Cinema");
            System.out.println("6 - Ligar Todas as Luzes");
            System.out.println("7 - Desligar Casa");
            System.out.println("8 - Sair");
            System.out.println("=======================================");
            System.out.print("Escolha uma opção: ");

            op = tkl.nextInt();
            tkl.nextLine();

            if (op == 1) {

                System.out.print("Digite o novo nome da casa: ");
                String novoNome = tkl.nextLine();

                minhaCasa.setNomeMoradia(novoNome);

            } 
            else if (op == 2) {

                minhaCasa.mostrarStatus();

            } 
            else if (op == 3) {

                System.out.print("Digite a nova temperatura (16 a 30): ");
                int temp = tkl.nextInt();

                if (temp >= 16 && temp <= 30) {

                    minhaCasa.setTemperaturaAr(temp);
                    System.out.println("Temperatura alterada!");

                } 
                else {

                    System.out.println("Temperatura inválida!");

                }

            } 
            else if (op == 4) {

                minhaCasa.ligarCasa();

            } 
            else if (op == 5) {

                minhaCasa.ativarModoCinema();

            } 
            else if (op == 6) {

                minhaCasa.ligarTodasLuzes();

            }

            else if (op == 7) {

                minhaCasa.desligarCasa();

            }

            else if (op == 8) {

                System.out.println("Encerrando sistema...");

            } 
            else {

                System.out.println("Opção inválida!");

            }

        } while (op != 8);

        tkl.close();
    }
}
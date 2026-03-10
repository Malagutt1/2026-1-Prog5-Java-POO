package CasaInteligente;
import java.util.Scanner;

public class HomeAssistent_Main {
    public static void main(String[] args) {

        Scanner tkl = new Scanner(System.in);
        CasaInteligente minhaCasa = new CasaInteligente("Minha Casa");

        int op = 0;

        do {
            System.out.println("\n======== MENU CASA INTELIGENTE ========");
            System.out.println("1 - Configurar Nome da Casa");
            System.out.println("2 - Ver Status da Casa");
            System.out.println("3 - Alterar Temperatura");
            System.out.println("4 - Ligar Casa");
            System.out.println("5 - Ativar Modo Cinema");
            System.out.println("6 - Sair");
            System.out.println("=======================================");
            System.out.print("Escolha uma opção: ");

            op = tkl.nextInt();
            tkl.nextLine();

            if (op == 1) {
                System.out.print("Digite o novo nome da moradia: ");
                String novoNome = tkl.nextLine();
                minhaCasa.setNomeMoradia(novoNome);

            } 
            else if (op == 2) {

                System.out.println("\n--- RELATÓRIO ATUAL ---");
                System.out.println("Moradia: " + minhaCasa.getNomeMoradia());
                System.out.println("Luzes: " + (minhaCasa.isLuzesLigadas() ? "LIGADAS" : "DESLIGADAS"));
                System.out.println("Temperatura: " + minhaCasa.getTemperaturaAr() + "°C");
                System.out.println("Modo Segurança: " + (minhaCasa.isModoSeguranca() ? "ATIVO" : "INATIVO"));
                System.out.println("-----------------------");

            } 
            else if (op == 3) {

                System.out.print("Digite a nova temperatura: ");
                int temp = tkl.nextInt();
                minhaCasa.setTemperaturaAr(temp);

            } 
            else if (op == 4) {

                minhaCasa.ligarCasa();

            } 
            else if (op == 5) {

                minhaCasa.setLuzesLigadas(true);
                minhaCasa.ativarModoCinema();

            } 
            else if (op == 6) {

                System.out.println("Encerrando sistema...");

            } 
            else {

                System.out.println("Opção inválida!");

            }

        } while (op != 6);

        tkl.close();
    }
}
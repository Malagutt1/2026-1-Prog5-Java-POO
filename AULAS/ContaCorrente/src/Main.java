import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();

        // Configurações iniciais da conta
        System.out.print("Informe o número da sua Agência: ");
        conta1.setAgencia(tcd.nextInt());

        System.out.print("Informe o número da sua Conta Corrente: ");
        conta1.setContaCorrente(tcd.nextInt());

        int op; // opção do menu

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            op = tcd.nextInt();

            if (op == 1) {
                System.out.print("Digite o valor a depositar: ");
                int valorDep = tcd.nextInt();
                conta1.depositar(valorDep);
            } 
            else if (op == 2) {
                System.out.print("Digite o valor a sacar: ");
                int valorSaq = tcd.nextInt();
                conta1.sacar(valorSaq);
            } 
            else if (op == 3) {
                conta1.status();
            } 
            else if (op == 4) {
                System.out.println("=== Programa finalizado ===");
            } 
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (op != 4);

        tcd.close();
    }
}
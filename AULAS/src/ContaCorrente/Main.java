package ContaCorrente;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente contaAtiva = null;

        int op; // opção do menu

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Configurar Conta 1");
            System.out.println("2 - Configurar Conta 2");
            System.out.println("3 - Selecionar Conta para Operações");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            op = tcd.nextInt();

            if (op == 1) {
                System.out.println("\n=== CONFIGURAR CONTA 1 ===");
                System.out.print("Informe o número da Agência: ");
                conta1.setAgencia(tcd.nextInt());

                System.out.print("Informe o número da Conta Corrente: ");
                conta1.setContaCorrente(tcd.nextInt());
                
                System.out.println("✓ Conta 1 configurada!");
            } 
            else if (op == 2) {
                System.out.println("\n=== CONFIGURAR CONTA 2 ===");
                System.out.print("Informe o número da Agência: ");
                conta2.setAgencia(tcd.nextInt());

                System.out.print("Informe o número da Conta Corrente: ");
                conta2.setContaCorrente(tcd.nextInt());
                
                System.out.println("✓ Conta 2 configurada!");
            } 
            else if (op == 3) {
                System.out.println("\n=== SELECIONAR CONTA ===");
                System.out.println("1 - Conta 1 (Agência: " + conta1.getAgencia() + 
                                 " | Conta: " + conta1.getContaCorrente() + ")");
                System.out.println("2 - Conta 2 (Agência: " + conta2.getAgencia() + 
                                 " | Conta: " + conta2.getContaCorrente() + ")");
                System.out.print("Escolha a conta: ");
                
                int escolha = tcd.nextInt();
                if (escolha == 1) {
                    contaAtiva = conta1;
                    System.out.println("✓ Conta 1 selecionada!");
                } else if (escolha == 2) {
                    contaAtiva = conta2;
                    System.out.println("✓ Conta 2 selecionada!");
                } else {
                    System.out.println("Opção inválida!");
                    continue;
                }
                
                menuOperacoes(tcd, contaAtiva, conta1, conta2);
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

    public static void menuOperacoes(Scanner tcd, ContaCorrente contaAtiva, ContaCorrente conta1, ContaCorrente conta2) {
        int op;

        do {
            System.out.println("\n=== OPERAÇÕES ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            op = tcd.nextInt();

            if (op == 1) {
                System.out.print("Digite o valor a depositar: ");
                int valorDep = tcd.nextInt();
                contaAtiva.depositar(valorDep);
            } 
            else if (op == 2) {
                System.out.print("Digite o valor a sacar: ");
                int valorSaq = tcd.nextInt();
                contaAtiva.sacar(valorSaq);
            } 
            else if (op == 3) {
                System.out.println("\n=== TRANSFERÊNCIA ===");
                System.out.println("1 - Transferir para Conta 1");
                System.out.println("2 - Transferir para Conta 2");
                System.out.print("Escolha: ");
                
                int destino = tcd.nextInt();
                ContaCorrente contaDestino = null;
                
                if (destino == 1 && contaAtiva != conta1) {
                    contaDestino = conta1;
                    System.out.println("Conta destino: Agência " + conta1.getAgencia() + 
                                     " | Conta " + conta1.getContaCorrente());
                } else if (destino == 2 && contaAtiva != conta2) {
                    contaDestino = conta2;
                    System.out.println("Conta destino: Agência " + conta2.getAgencia() + 
                                     " | Conta " + conta2.getContaCorrente());
                } else {
                    System.out.println("Opção inválida ou tentativa de transferir para a mesma conta!");
                    continue;
                }
                
                System.out.print("Digite o valor a transferir: ");
                float valorTransf = tcd.nextFloat();
                
                contaAtiva.transferir(contaDestino, valorTransf);
                System.out.println("Saldo da conta destino: " + contaDestino.getSaldo());
            }
            else if (op == 4) {
                contaAtiva.status();
                System.out.println("\n=== SALDOS DE TODAS AS CONTAS ===");
                System.out.println("Conta 1 - Saldo: " + conta1.getSaldo());
                System.out.println("Conta 2 - Saldo: " + conta2.getSaldo());
            } 
            else if (op == 5) {
                System.out.println("Voltando ao menu principal...");
            } 
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (op != 5);
    }
}
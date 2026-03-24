package MicroOndas;
import java.util.Scanner;

public class MicroOndas_Main {
    public static void main(String[] args) {
        Scanner tkl = new Scanner(System.in);

        // ===== MICRO 1 (COM PARÂMETROS) =====
        System.out.println("\n--- Configurando o Micro-ondas 1 ---");
        System.out.print("Marca: ");
        String marca = tkl.nextLine();

        System.out.print("Tempo inicial: ");
        int tempo = tkl.nextInt();
        tkl.nextLine();

        System.out.print("Tipo de alimento: ");
        String alimento = tkl.nextLine();

        System.out.print("Ligado? (true/false): ");
        boolean ligado = tkl.nextBoolean();

        MicroOndas micro1 = new MicroOndas(marca, tempo, alimento, ligado);

        // ===== MICRO 2 (PADRÃO) =====
        MicroOndas micro2 = new MicroOndas();

        int escolhaMicro;
        int opcao;

        do {
            System.out.println("\n====== ESCOLHER MICRO-ONDAS ======");
            System.out.println("1 - Micro-ondas 1");
            System.out.println("2 - Micro-ondas 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            escolhaMicro = tkl.nextInt();

            if (escolhaMicro == 0) {
                System.out.println("Encerrando...");
                break;
            }

            MicroOndas microSelecionado;

            if (escolhaMicro == 1) {
                microSelecionado = micro1;
            } else if (escolhaMicro == 2) {
                microSelecionado = micro2;
            } else {
                System.out.println("Micro inválido!");
                continue;
            }

            // ===== MENU DE OPERAÇÕES =====
            do {
                System.out.println("\n====== MENU ======");
                System.out.println("1 - Ligar/Desligar");
                System.out.println("2 - Tipo de alimento");
                System.out.println("3 - Inserir tempo");
                System.out.println("4 - +30 segundos");
                System.out.println("5 - Status");
                System.out.println("0 - Voltar");
                System.out.print("Opção: ");

                opcao = tkl.nextInt();
                tkl.nextLine();

                if (opcao == 1) {
                    microSelecionado.ligaDesliga();
                    microSelecionado.status();

                } else if (opcao == 2) {
                    System.out.print("Novo alimento: ");
                    String tipo = tkl.nextLine();
                    microSelecionado.tipoAlimento(tipo);
                    microSelecionado.status();

                } else if (opcao == 3) {
                    System.out.print("Novo tempo: ");
                    int novoTempo = tkl.nextInt();
                    microSelecionado.insiraTempo(novoTempo);
                    microSelecionado.status();

                } else if (opcao == 4) {
                    microSelecionado.mais30();
                    microSelecionado.status();

                } else if (opcao == 5) {
                    microSelecionado.status();

                } else if (opcao == 0) {
                    System.out.println("Voltando...");
                } else {
                    System.out.println("Opção inválida!");
                }

            } while (opcao != 0);

        } while (true);

        tkl.close();
    }
}
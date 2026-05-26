package FilaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class LifoCtrlZ {

    public static void main(String[] args) {
        ArrayList<String> historicoAcoes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- SIMULADOR CTRL + Z (PILHA) ---");
            System.out.println("1 - Digitar texto (Nova Ação)");
            System.out.println("2 - Pressionar Ctrl + Z (Desfazer)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                System.out.print("Digite o texto da sua ação: ");
                String acao = scanner.nextLine();
                historicoAcoes.add(acao); // Adiciona no final (topo da pilha)
                
                System.out.println("\nHistórico atual:");
                for (int i = 0; i < historicoAcoes.size(); i++) {
                    System.out.println((i + 1) + " - " + historicoAcoes.get(i));
                }

            } else if (opcao == 2) {
                if (!historicoAcoes.isEmpty()) {
                    int ultimoIndice = historicoAcoes.size() - 1;
                    String desfeito = historicoAcoes.remove(ultimoIndice); // Remove o último (topo)
                    System.out.println("\nCtrl + Z executado! Desfeito: \"" + desfeito + "\"");
                    
                    System.out.println("Histórico atual:");
                    for (int i = 0; i < historicoAcoes.size(); i++) {
                        System.out.println((i + 1) + " - " + historicoAcoes.get(i));
                    }
                } else {
                    System.out.println("\nNada para desfazer! O histórico está vazio.");
                }

            } else if (opcao == 3) {
                System.out.println("\nSaindo... Texto final no histórico:");
                for (int i = 0; i < historicoAcoes.size(); i++) {
                    System.out.println((i + 1) + " - " + historicoAcoes.get(i));
                }

            } else {
                System.out.println("\nOpção inválida!");
            }
        }

        scanner.close();
    }
}
package FilaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FilaArrayList {

    public static void main(String[] args) {
        ArrayList<String> fila = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- MENU DA FILA ---");
            System.out.println("1 - Adicionar na fila");
            System.out.println("2 - Remover da fila");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o texto para adicionar: ");
                String valor = scanner.nextLine();
                fila.add(valor);
                
                System.out.print("Fila atualizada: [");
                for (int i = 0; i < fila.size(); i++) {
                    System.out.print(fila.get(i));
                    if (i < fila.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

            } else if (opcao == 2) {
                if (!fila.isEmpty()) {
                    String removido = fila.remove(0); 
                    System.out.println("Removido: " + removido);
                    
                    System.out.print("Fila atualizada: [");
                    for (int i = 0; i < fila.size(); i++) {
                        System.out.print(fila.get(i));
                        if (i < fila.size() - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                } else {
                    System.out.println("A fila já está vazia!");
                }

            } else if (opcao == 3) {
                System.out.print("Saindo do programa... Fila final: [");
                for (int i = 0; i < fila.size(); i++) {
                    System.out.print(fila.get(i));
                    if (i < fila.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
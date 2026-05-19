package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExemplo {

    public static void main(String[] args) {
        Scanner tkl = new Scanner(System.in);
        ArrayList<String> bandas = new ArrayList<String>();

        // Cadastro inicial de 5 bandas
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da banda: ");
            bandas.add(tkl.nextLine());
        }

        System.out.println("\n=== Bandas cadastradas ===");
        for (int i = 0; i < bandas.size(); i++) {
            System.out.println("- " + bandas.get(i));
        }

        System.out.println("Total de bandas: " + bandas.size());

        // Remover banda por índice
        System.out.println("Digite o indice para remover (0 a " + (bandas.size() - 1) + "): ");
        int indice = tkl.nextInt();
        if (indice >= 0 && indice < bandas.size()) {
            bandas.remove(indice);
        } else {
            System.out.println("Indice invalido!");
        }

        System.out.println("\n=== Lista atualizada ===");
        for (int i = 0; i < bandas.size(); i++) {
            System.out.println("- " + bandas.get(i));
        }

        // Adicionar banda em posição específica
        System.out.println("\n=== Adicionar item ===");
        System.out.println("Digite a posição (0 a " + bandas.size() + "): ");
        int num = tkl.nextInt();
        tkl.nextLine(); // limpa o buffer

        System.out.print("Digite o nome da banda a ser adicionado: ");
        String novaBanda = tkl.nextLine();

        if (num >= 0 && num <= bandas.size()) {
            bandas.add(num, novaBanda);
        } else {
            System.out.println("Posição inválida! Adicionando no final.");
            bandas.add(novaBanda);
        }

        System.out.println("\n=== Lista final ===");
        for (int i = 0; i < bandas.size(); i++) {
            System.out.println("- " + bandas.get(i));
        }

        // === Alterar nome de banda ===
        System.out.println("\n=== Alterar nome de banda ===");
        System.out.print("Digite o nome da banda que deseja alterar: ");
        String nomeAntigo = tkl.nextLine();

        boolean achou = false;

        for (int i = 0; i < bandas.size(); i++) {
            if (bandas.get(i).equalsIgnoreCase(nomeAntigo)) {
                System.out.print("Digite o novo nome: ");
                String nomeNovo = tkl.nextLine();
                bandas.set(i, nomeNovo);
                achou = true;
                System.out.println("Nome alterado com sucesso!");
                break;
            }
        }

        if (!achou) {
            System.out.println("Banda não encontrada!");
        }

        System.out.println("\n=== Lista final atualizada ===");
        for (int i = 0; i < bandas.size(); i++) {
            System.out.println("- " + bandas.get(i));
        }

        tkl.close();
    }
}
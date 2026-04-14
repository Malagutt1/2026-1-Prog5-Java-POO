package string;
import java.util.Scanner;

public class Ex_String {

    static Scanner tkl = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Exercício 1 (String)");
            System.out.println("2 - Exercício 2 (Substring)");
            System.out.println("3 - Exercício 3 (Iniciais)");
            System.out.println("4 - Exercício 4 (Replace)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = tkl.nextInt();
            tkl.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        tkl.close();
    }

    // ===== EXERCÍCIO 1 =====
    public static void exercicio1() {

        System.out.print("Digite uma String: ");
        String palavra = tkl.nextLine();

        System.out.println("Número de caracteres: " + palavra.length());
        System.out.println("Maiúsculas: " + palavra.toUpperCase());
        System.out.println("Minúsculas: " + palavra.toLowerCase());

        int vogais = 0;
        String lower = palavra.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            }
        }

        System.out.println("Número de vogais: " + vogais);

        System.out.println("Começa com 'Ins': " +
                (lower.startsWith("ins") ? "Sim" : "Não"));

        System.out.println("Termina com 'ões': " +
                (lower.endsWith("ões") ? "Sim" : "Não"));
    }

    // ===== EXERCÍCIO 2 =====
    public static void exercicio2() {

        String palavra = "Casa";

        for (int i = 1; i <= palavra.length(); i++) {
            System.out.println(palavra.substring(0, i));
        }

        for (int i = palavra.length() - 1; i > 0; i--) {
            System.out.println(palavra.substring(0, i));
        }
    }

    // ===== EXERCÍCIO 3 =====
    public static void exercicio3() {

        System.out.print("Digite o nome completo: ");
        String nome = tkl.nextLine();

        String[] ignorar = {"da", "de", "do", "das", "dos", "di", "du", "e"};
        String[] partes = nome.split(" ");
        String iniciais = "";

        for (String parte : partes) {

            String p = parte.toLowerCase();
            boolean ehConector = false;

            for (String ign : ignorar) {
                if (p.equals(ign)) {
                    ehConector = true;
                    break;
                }
            }

            if (!ehConector && !parte.isEmpty()) {
                iniciais += parte.substring(0, 1).toUpperCase();
            }
        }

        System.out.println("Iniciais: " + iniciais);
    }

    // ===== EXERCÍCIO 4 =====
    public static void exercicio4() {

        System.out.print("Digite uma frase: ");
        String frase = tkl.nextLine();

        System.out.print("Palavra a substituir: ");
        String antiga = tkl.nextLine();

        System.out.print("Nova palavra: ");
        String nova = tkl.nextLine();

        String resultado = frase.replace(antiga, nova);

        System.out.println("Resultado: " + resultado);
    }
}
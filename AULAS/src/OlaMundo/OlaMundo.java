package OlaMundo;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Minhas Primeiras Mensagens Em JAVA");
        
        char options = 'c';
        int i = 35;
        double f = 4.5;
        boolean b = true;
        
        System.out.println("O valor de options é: " + options);
        
        System.out.println("\n========== TIPOS DE DADOS ==========");
        System.out.println("Inteiro (int):      " + i);
        System.out.println("Decimal (double):   " + f);
        System.out.println("Booleano (boolean): " + b);
        System.out.println("=====================================\n");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Seu nome é: " + nome);
        
        teclado.close();
    }
}
package Circulo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double area, raio;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o raio: ");
        raio = teclado.nextDouble();
        
        // Validar se o raio é válido
        if (raio > 0) {
            area = Math.PI * Math.pow(raio, 2);
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Raio: " + raio);
            System.out.printf("Área: %.2f%n", area);
            System.out.println("==================");
        } else {
            System.out.println("Erro: O raio deve ser maior que zero!");
        }
        
        teclado.close();
    }
}
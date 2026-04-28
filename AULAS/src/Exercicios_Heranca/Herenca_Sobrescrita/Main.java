package Exercicios_Heranca.Herenca_Sobrescrita;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Quadrado quadrado = new Quadrado("Quadrado", 0);
        Triangulo triangulo = new Triangulo("Triângulo", 0, 0);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Definir Quadrado");
            System.out.println("2 - Definir Triângulo");
            System.out.println("3 - Mostrar dados do Quadrado");
            System.out.println("4 - Mostrar dados do Triângulo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = sc.nextDouble();
                quadrado = new Quadrado("Quadrado", lado);
            }

            else if (opcao == 2) {
                System.out.print("Digite a base do triângulo: ");
                double base = sc.nextDouble();

                System.out.print("Digite a altura do triângulo: ");
                double altura = sc.nextDouble();

                triangulo = new Triangulo("Triângulo", base, altura);
            }

            else if (opcao == 3) {
                System.out.println("\n--- Quadrado ---");
                System.out.println("Nome: " + quadrado.getNome());
                System.out.println("Área: " + quadrado.calculaArea());
            }

            else if (opcao == 4) {
                System.out.println("\n--- Triângulo ---");
                System.out.println("Nome: " + triangulo.getNome());
                System.out.println("Área: " + triangulo.calculaArea());
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
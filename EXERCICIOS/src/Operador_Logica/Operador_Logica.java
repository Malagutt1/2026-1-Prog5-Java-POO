package Operador_Logica;
import java.util.Scanner;

public class Operador_Logica {
	public static void main(String[] args) {
		ex1();
		//ex2();
		//ex3();
		//ex4();
		//ex5();
		//ex6();		
	}
	
	public static void ex1() {
		// TODO Auto-generated method stub
		int n1; 
		int n2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira um numero para N1:  ");
		n1 = teclado.nextInt();
		
		System.out.print("Insira um numero para N2:  ");
		n2 = teclado.nextInt();
		
		int soma = n1+n2;
		
		System.out.println("A soma de "+n1+" + "+n2+ " = " + soma);
		
		teclado.close();
	}
	
	public static void ex2() {
		int n1; 
		int n2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira um numero para N1:  ");
		n1 = teclado.nextInt();
		
		System.out.print("Insira um numero para N2:  ");
		n2 = teclado.nextInt();
		
		int media = (n1+n2)/2;
		
		System.out.println("A media de "+n1+" + "+n2+ " / 2 = " + media);
		
		teclado.close();
	}
	
	public static void ex3() {
	    // diametro, area, circunferencia 
	    Scanner teclado = new Scanner(System.in);
	    System.out.print("Informe o raio do circulo: ");
	    double raio = teclado.nextDouble();
	    double pi = 3.14159; 
	    
	    double diametro = 2 * raio;
	    double area = pi * raio * raio;
	    double circunferencia = 2 * pi * raio;

	    System.out.println("Diâmetro: " + diametro);
	    System.out.println("Área: " + area);
	    System.out.println("Circunferência: " + circunferencia);

	    teclado.close();
	}

	public static void ex4() {
		/*
		 * Crie um algoritmo que solicite e 
		 * imprima os valores da diagonal maior, 
		 * diagonal menor e calcule a área de um losango 
		*/
		
	   Scanner teclado = new Scanner(System.in);
	    
	   System.out.print("Informe a DIAGONAL MAIOR de um losango: ");
	   double D_maior = teclado.nextDouble();
	   
	   System.out.print("Informe a DIAGONAL MENOR de um losango:  ");
	   double D_menor = teclado.nextDouble();
	   
	   double area = (D_maior * D_menor) / 2;
	   
	   System.out.println("\n--- Resultados ---");
	   System.out.println("Diagonal Maior: " + D_maior);
	   System.out.println("Diagonal Menor: " + D_menor);
	   System.out.println("Área do Losango: " + area);  
	   teclado.close();
	}

	public static void ex5() {
		Scanner teclado = new Scanner(System.in);
		double PI = 3.14159;
	    
		System.out.print("Informe o raio da lata de óleo: ");
		double raio = teclado.nextDouble();
		
		System.out.print("Informe a altura da lata de óleo: ");
		double altura = teclado.nextDouble();
		
		
		double volume = PI * (raio*raio) * altura;
		
		System.out.println("\n--- Cálculo do Volume ---");
	    System.out.println("O volume da lata de óleo é: " + volume);
	    teclado.close();
		
	}
	
	public static void ex6() {
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Digite o seu nome: ");
	    String nome = teclado.nextLine();
	    
	    System.out.print("Informe sua altura (em metros, use vírgula): ");
	    double altura = teclado.nextDouble();
	    
	    System.out.print("Informe sua massa (em Kg, use vírgula): ");
	    double massa = teclado.nextDouble();

	    double densidade = massa / altura;
	    
	    System.out.println("\n--- Resultado ---");
	    System.out.println("Nome do usuário: " + nome);
	    System.out.println("Densidade corporal: " + densidade);
	    teclado.close();
		
	}
	
}

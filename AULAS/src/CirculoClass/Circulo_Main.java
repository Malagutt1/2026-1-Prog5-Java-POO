package CirculoClass;
import java.util.Scanner;

public class Circulo_Main {
	public static void main(String[] args) {
		/*
		 * Deve conter o atributo double raio
		 * um construtor vazio e outro com parametro
		 * métodos get e set
		 * Método para calculo de: area(), diametro() e circunferencia()
		 * 
		 * Na MAIN instancie dois circulos, um com parametro e outro sem.
		*/
		
		Scanner tkl = new Scanner(System.in);
		Circulo c1 = new Circulo();
		Circulo c2 = null;

		int op;
		do {

			System.out.println();
			System.out.println("=========== MENU ===========");
			System.out.println("1 - Calcular circulo");
			System.out.println("2 - Ver resultados");
			System.out.println("0 - Sair");
			System.out.println("============================");
			System.out.print("Escolha uma opção: ");

			op = tkl.nextInt();

			if (op == 1){
				System.out.print("Qual circulo deseja calcular? (1 ou 2): ");
				int esc = tkl.nextInt();

				System.out.print("Informe o raio: ");
				double raio = tkl.nextDouble();

				if(raio <= 0){
					System.out.println("Erro: o raio deve ser maior que zero!");
				}

				else if(esc == 1){
					c1.setRaio(raio);
					System.out.println("Raio do circulo 1 definido!");
				}
				
				/*########## CIRCULO 02 #############*/

				else if(esc == 2){
					c2 = new Circulo(raio);
					System.out.println("Raio do circulo 2 definido!");
				}

				else{
					System.out.println("Erro: escolha apenas 1 ou 2.");
				}

			}

			else if(op == 2){
				System.out.println();
				System.out.println("\n=== RESULTADO CIRCULO 1 ===");
				System.out.println("Area: " + String.format("%.2f", c1.area()));
				System.out.println("Diametro: " + String.format("%.2f", c1.diametro()));
				System.out.println("Circunferencia: " + String.format("%.2f", c1.circunferencia()));
				System.out.println("===========================");

				if(c2 != null){
					System.out.println();
					System.out.println("\n=== RESULTADO CIRCULO 2 ===");
					System.out.println("Area: " + String.format("%.2f", c2.area()));
					System.out.println("Diametro: " + String.format("%.2f", c2.diametro()));
					System.out.println("Circunferencia: " + String.format("%.2f", c2.circunferencia()));
					System.out.println("===========================");
					System.out.println();
				} else{
					System.out.println("Circulo 2 ainda não foi definido.");
					System.out.println();
				}
			}

			else if(op == 0) {
				System.out.println("Programa encerrado.");
			}
			else{
				System.out.println("Erro: opção inválida!");
			}

		}while (op != 0);

		tkl.close();
	}
}
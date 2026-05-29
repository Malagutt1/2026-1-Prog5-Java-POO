package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<String> Lista = new ArrayList<String>();
		Scanner tkl = new Scanner(System.in);
		
		int op;
		int index;
		String elemento;

		do {

			System.out.println("Menu Lista:");
			System.out.println("1 - Inserir:");
			System.out.println("2 - Remover:");
			System.out.println("3 - Sair:");
			System.out.print(">>  ");

			op = tkl.nextInt();
			tkl.nextLine();

			if (op == 1) {

				System.out.println("1.1 - Qual posição? De 0 à " + Lista.size());
				index = tkl.nextInt();
				tkl.nextLine();

				System.out.println("Insira o valor: ");
				elemento = tkl.nextLine();

				Lista.add(index, elemento);

			}

			else if (op == 2) {

				System.out.println("2.1 Qual índice remover? de 0 á " + (Lista.size()-1));
				index = tkl.nextInt();
				tkl.nextLine();
				Lista.remove(index);

			}

			else if (op == 3) {
				System.out.println("Apagando tudo!");
				Lista.clear();
				for (int i = 0; i < Lista.size(); i++) {
					System.out.println(i + " - " + Lista.get(i));
				}
			}

		} while (op != 4);

		tkl.close();
		}

}
package Disciplina;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Disciplina> lista = new ArrayList<>();
		Scanner tkl = new Scanner(System.in);
		int op;
		do {

			System.out.println("MENU");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Listar");
			System.out.println("3 - Busca");
			System.out.println("4 - Alteração");
			System.out.println("5 - Exclusão");
			System.out.println("6 - Finalizar");
			System.out.print(">> ");
			op = tkl.nextInt();
			tkl.nextLine();

			if (op == 1) {

				System.out.print("Nome da disciplina: ");
				String nome = tkl.nextLine();

				System.out.print("Carga horária: ");
				int carga = tkl.nextInt();
				tkl.nextLine();

				Disciplina d = new Disciplina(nome, carga);

				lista.add(d);

			}
			
			else if (op == 2) {

				if (lista.isEmpty()) {

					System.out.println("A lista está vazia. \n");

				} else {

					for (int i = 0; i < lista.size(); i++) {
						System.out.println(i + " - " + lista.get(i).mostrar());
					}

				}

			}

			else if (op == 3) {
				System.out.print("Buscar disciplina: ");
				String busca = tkl.nextLine();
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i).getNome().equalsIgnoreCase(busca)) {
						System.out.println(lista.get(i));
					}
				}

			}
			else if (op == 4) {
				for (int i = 0; i < lista.size(); i++) {
					System.out.println(i + " - " + lista.get(i));
				}
				System.out.print("Qual índice alterar? ");
				int index = tkl.nextInt();
				tkl.nextLine();

				System.out.print("Novo nome: ");
				String nome = tkl.nextLine();

				System.out.print("Nova carga horária: ");
				int carga = tkl.nextInt();
				tkl.nextLine();

				lista.get(index).setNome(nome);
				lista.get(index).setCargaHoraria(carga);
			}

			else if (op == 5) {
				if (lista.isEmpty()) {
					System.out.println("A lista está vazia. \n");
				} else {
					for (int i = 0; i < lista.size(); i++) {
						System.out.println(i + " - " + lista.get(i).mostrar());
					}
					System.out.print("Qual índice excluir? ");
					int index = tkl.nextInt();
					tkl.nextLine();

					lista.remove(index);
				}

			}

		} while (op != 6);

		tkl.close();

	}

}
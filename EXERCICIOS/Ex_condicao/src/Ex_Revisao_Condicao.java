import java.util.Scanner;

public class Ex_Revisao_Condicao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("====================================");
		System.out.println("   PROGRAMAÇÃO V - LISTA REVISÃO CONDI   ");
		System.out.println("====================================");
		System.out.println("Escolha o exercício que deseja executar:");
		System.out.println("1 - Exercício 1");
		System.out.println("2 - Exercício 2");
		System.out.println("3 - Exercício 3");
		System.out.println("4 - Exercício 4");
		System.out.println("5 - Exercício 5");
		System.out.println("6 - Exercício 6");
		System.out.println("7 - Exercício 7");
		System.out.println("8 - Exercício 8");
		System.out.println("9 - Exercício 9");
		System.out.println("10 - Exercício 10");
		System.out.println("====================================");
		System.out.print("Digite a opção: ");

		int opcao = teclado.nextInt();

		if (opcao == 1) {
			ex1(teclado);
		} else if (opcao == 2) {
			ex2(teclado);
		} else if (opcao == 3) {
			ex3(teclado);
		} else if (opcao == 4) {
			ex4(teclado);
		} else if (opcao == 5) {
			ex5(teclado);
		} else if (opcao == 6) {
			ex6(teclado);
		} else if (opcao == 7) {
			ex7(teclado);
		} else if (opcao == 8) {
			ex8(teclado);
		} else if (opcao == 9) {
			ex9(teclado);
		} else if (opcao == 10) {
			ex10(teclado);
		} else {
			System.out.println("Opção inválida! Tente novamente.");
		}
		teclado.close();
	}

	public static void ex1(Scanner teclado) {
		/*
		 * 1) Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
		 * número lido como sendo um valor positivo, ou seja, o programa deverá
		 * apresentar o módulo de um número fornecido. Lembre-se de verificar se o
		 * número fornecido é menor que zero, sendo multiplique-o por –1.
		 */

		System.out.print("Insira um Numero (+ ou -):	");
		int num = teclado.nextInt();
		if (num < 0) {
			num = num * -1;
		}

		System.out.println("O numero em Módulo será: " + num);
	}

	public static void ex2(Scanner teclado) {
		/*
		 * 2) Ler um valor inteiro e exibir a mensagem 'número negativo' quando o valor
		 * informado for menor que zero; 'zero' quando este for igual a zero; e 'número
		 * positivo' quando o valor for maior que zero.
		 */
		System.out.print("Informe um numero para analizar:	");
		int num = teclado.nextInt();

		if (num < 0) {
			System.out.println("Numero Negativo!");
		} else if (num > 0) {
			System.out.println("Numero Positivo");
		} else {
			System.out.println("ZERO");
		}
	}

	public static void ex3(Scanner teclado) {
		/*
		 * 3) Efetuar a leitura de dois números inteiros e apresentar a relação
		 * existente entre eles, ou seja, o primeiro é maior que o segundo, os números
		 * são iguais, ou ainda, o segundo e maior que o primeiro.
		 */

		System.out.print("Informe o primeiro numero: 	");
		int num1 = teclado.nextInt();
		System.out.print("Informe o segundo numero: 	");
		int num2 = teclado.nextInt();

		if (num1 > num2) {
			System.out.println("O primeiro numero (" + num1 + ") é MAIOR que o segundo (" + num2 + ").");
		} else if (num1 == num2) {
			System.out.println("Os dois numeros são IGUAIS: " + num1);
		} else {
			System.out.println("O segundo numero (" + num2 + ") é MAIOR que o primeiro (" + num1 + ").");
		}
	}

	public static void ex4(Scanner teclado) {
		/*
		 * 4) Ler dois valores numéricos e apresentar a diferença do maior pelo menor.
		 */
		System.out.print("Insira um primeiro numero: 	");
		int num1 = teclado.nextInt();
		System.out.print("Insira um  segundo numero: 	");
		int num2 = teclado.nextInt();

		if (num1 == num2) {
			System.out.println("Os numeros não tem diferença");
		} else {
			int result;
			if (num1 < num2) {
				result = num2 - num1;
			} else {
				result = num1 - num2;
			}
			System.out.println("Diferença    : " + result);
		}
	}

	public static void ex5(Scanner teclado) {
		/*
		 * 5) Escreva um programa que leia um número e verifique se ele se encontra no
		 * intervalo entre 5 e 20.
		 */

		System.out.println("Insira um numero aleatório: 	");
		int num = teclado.nextInt();

		if (num >= 5 && num <= 20) {
			System.out.println("Esse numero está entre 5 e 20.");
		} else {
			System.out.println("Esse numero está fora dos parametros (Entre 5 e 20)");
		}
	}

	public static void ex6(Scanner teclado) {
		/*
		 * 6) Faça um algoritmo que peça para entrar com um ano com 4 dígitos e
		 * determine se o mesmo é ou não bissexto
		 */

		System.out.print("Insira um ano:	");
		int ano = teclado.nextInt();

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano + " é BISSEXTO ");
		} else {
			System.out.println("O ano " + ano + " NÃO é bissexto");
		}
	}

	public static void ex7(Scanner teclado) {
		/*
		 * 7) Faça um algoritmo que leia 3 números e mostre o maior e o menor deles.
		 */
		System.out.print("Insira o primeiro numero: 	");
		int num1 = teclado.nextInt();
		System.out.print("Insira o segundo numero: 	");
		int num2 = teclado.nextInt();
		System.out.print("Insira o terceiro numero: 	");
		int num3 = teclado.nextInt();

		int maior = num1;
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}

		int menor = num1;
		if (num2 < menor) {
			menor = num2;
		}
		if (num3 < menor) {
			menor = num3;
		}

		System.out.println("Maior numero: " + maior);
		System.out.println("Menor numero: " + menor);
	}

	public static void ex8(Scanner teclado) {
		System.out.print("Insira o primeiro numero: ");
		int num1 = teclado.nextInt();
		System.out.print("Insira o segundo numero: ");
		int num2 = teclado.nextInt();
		System.out.print("Insira o terceiro numero: ");
		int num3 = teclado.nextInt();

		int meio = 0;

		if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
			meio = num1;
		} else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
			meio = num2;
		} else {
			meio = num3;
		}

		System.out.println("O valor do meio é: " + meio);
	}

	public static void ex9(Scanner teclado) {
		System.out.print("Digite um número (1 a 7): ");
		int dia = teclado.nextInt();

		if (dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("Segunda-feira");
		} else if (dia == 3) {
			System.out.println("Terça-feira");
		} else if (dia == 4) {
			System.out.println("Quarta-feira");
		} else if (dia == 5) {
			System.out.println("Quinta-feira");
		} else if (dia == 6) {
			System.out.println("Sexta-feira");
		} else if (dia == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Valor inválido!");
		}
	}

	public static void ex10(Scanner teclado) {
		/*
		 * 10) Faça um programa que seja capaz de concluir qual dentre os animais
		 * seguintes foi escolhido, através de perguntas e respostas. (CASO e SE)
		 * 
		 * Exemplo: É mamífero? SIM -> É quadrúpede? SIM -> É carnívoro? NÃO -> É
		 * herbívoro? SIM -> Então o animal escolhido foi: cavalo
		 * 
		 * Classificações: mamíferos -> quadrúpede -> carnívoro -> leão -> herbívoro ->
		 * cavalo -> bípede -> onívoro -> homem -> frutífero -> macaco
		 * 
		 * -> voadores --------------> morcego -> aquáticos --------------> baleia aves
		 * -> não voadoras -> tropical -> avestruz -> polar -> pinguim -> nadadoras
		 * --------------> pato -> de rapina --------------> águia
		 * 
		 * répteis -> com casco --------------> tartaruga -> carnívoros ------------->
		 * crocodilo -> sem patas --------------> cobra
		 */

		System.out.println("\n===================================");
		System.out.println("        JOGO DO ANIMAL             ");
		System.out.println("===================================");
		System.out.println("Responda as perguntas com 'S' ou 'N'.");
		System.out.println("Tente escolher um animal da lista: Leão, Cavalo, Homem, Macaco, Morcego, Baleia,");
		System.out.println("Avestruz, Pinguim, Pato, Águia, Tartaruga, Crocodilo e Cobra.");
		System.out.println("===================================\n");

		System.out.print("É um animal mamífero? [S/N]: ");
		String resp = teclado.next();

		if (resp.equalsIgnoreCase("S")) { // MAMÍFERO
			System.out.print("É quadrúpede? [S/N]: ");
			resp = teclado.next();

			if (resp.equalsIgnoreCase("S")) { // quadrúpede
				System.out.print("É carnívoro? [S/N]: ");
				resp = teclado.next();

				if (resp.equalsIgnoreCase("S")) {
					System.out.println("SEU ANIMAL É UM ======> LEÃO");
				} else {
					System.out.println("SEU ANIMAL É UM ======> CAVALO");
				}

			} else { // não quadrúpede
				System.out.print("É bípede? [S/N]: ");
				resp = teclado.next();

				if (resp.equalsIgnoreCase("S")) { // bípede
					System.out.print("É onívoro? [S/N]: ");
					resp = teclado.next();

					if (resp.equalsIgnoreCase("S")) {
						System.out.println("SEU ANIMAL É UM ======> HOMEM");
					} else {
						System.out.println("SEU ANIMAL É UM ======> MACACO");
					}

				} else { // não quadrúpede e não bípede → voadores ou aquáticos
					System.out.print("É voador? [S/N]: ");
					resp = teclado.next();

					if (resp.equalsIgnoreCase("S")) {
						System.out.println("SEU ANIMAL É UM ======> MORCEGO");
					} else {
						System.out.print("É aquático? [S/N]: ");
						resp = teclado.next();

						if (resp.equalsIgnoreCase("S")) {
							System.out.println("SEU ANIMAL É UMA ======> BALEIA");
						}
					}
				}
			}

		} else { // NÃO é mamífero → aves ou répteis
			System.out.print("É ave? [S/N]: ");
			resp = teclado.next();

			if (resp.equalsIgnoreCase("S")) { // aves
				System.out.print("Não voadora? [S/N]: ");
				resp = teclado.next();

				if (resp.equalsIgnoreCase("S")) { // não voadora
					System.out.print("Tropical? [S/N]: ");
					resp = teclado.next();

					if (resp.equalsIgnoreCase("S")) {
						System.out.println("SEU ANIMAL É UMA ======> AVESTRUZ");
					} else {
						System.out.println("SEU ANIMAL É UM ======> PINGUIM");
					}

				} else { // voadora
					System.out.print("Nadadora? [S/N]: ");
					resp = teclado.next();

					if (resp.equalsIgnoreCase("S")) {
						System.out.println("SEU ANIMAL É UM ======> PATO");
					} else {
						System.out.println("SEU ANIMAL É UMA ======> ÁGUIA");
					}
				}

			} else { // répteis
				System.out.println("\nEntão é reptil!");
				System.out.print("Com casco? [S/N]: ");
				resp = teclado.next();

				if (resp.equalsIgnoreCase("S")) {
					System.out.println("SEU ANIMAL É UMA ======> TARTARUGA");
				} else {
					System.out.print("Carnívoro? [S/N]: ");
					resp = teclado.next();

					if (resp.equalsIgnoreCase("S")) {
						System.out.println("SEU ANIMAL É UM ======> CROCODILO");
					} else {
						System.out.println("SEU ANIMAL É UMA ======> COBRA");
					}
				}
			}
		}
	}

}

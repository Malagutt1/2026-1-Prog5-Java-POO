import java.util.Scanner;

public class Ex_Revisao_Repeticao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   PROGRAMAÇÃO V - LISTA REVISÃO REP   ");
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
            ex1();
        } else if (opcao == 2) {
            ex2();
        } else if (opcao == 3) {
            ex3(teclado);
        } else if (opcao == 4) {
            ex4(teclado);
        } else if (opcao == 5) {
            ex5(teclado);
        } else if (opcao == 6) {
            ex6(teclado);
        } else if (opcao == 7) {
            ex7();
        } else if (opcao == 8) {
            ex8(teclado);
        } else if (opcao == 9) {
            ex9(teclado);
        } else if (opcao == 10) {
            ex10(teclado);
        } else {
            System.out.println("Opção inválida!");
        }
        
        teclado.close();
    }


    public static void ex1() {
        /*
        * 1. (While) Faça um programa, que mostre na tela os números de 0 a 100.
        */
        int i = 0;
        while (i <= 100) {
            System.out.println("Numero: " + i);
            i++;
        }
    }

    public static void ex2() {
        /*
         * 2. (While) Faça um programa que mostre apenas os números pares de 0 a 100.
         */
        int i = 0;
        while(i<=100){
            if(i%2 == 0){
                System.out.println("Numero: " + i);
            }
            i++;
        }
    }

    public static void ex3(Scanner teclado) {
        /*
         * 3. (Do-While) Faça um programa, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.
         */

        System.out.print("Informe um numero para o LOOP:    ");
        int num = teclado.nextInt();
        int i = 0;
        do {
            System.out.println("Numero: " + i);
            i++;
        } while (i <= num);
    }

    public static void ex4(Scanner teclado) {
        /*
         * 4. (For) Faça a tabuada de um número qualquer e mostre na tela. 
         * O programa deve solicitar o número desejado da tabuada.
         */
        System.out.print("Informe o numero da tabuada que deseja saber:     ");
        int numTab = teclado.nextInt();
        for(int i = 0; i<=10; i++){
            int multi = numTab * i;
            System.out.println(numTab +" X "+ i +" = "+ multi);
        }
    }
    

    public static void ex5(Scanner teclado) {
        /*
         * 5. (For) Faça um programa que repita 10 vezes a solicitação de números quaisquer para o usuário. 
         * E que conte a quantidades de pares e ímpares digitados e mostre na tela.
         */
        int par = 0;
        int impar = 0;

        for (int i = 1; i<=10; i++){
            System.out.print("Informe um numero:  ");
            int NumUser = teclado.nextInt();
            if(NumUser % 2 == 0){
                par++;
            }else {impar++; }
        }

        System.out.println("PAR:  "+ par);
        System.out.println("IMPAR:"+ impar);
    }

    public static void ex6(Scanner teclado) {
            /*
            * 6. Faça um algoritmo que identifique se um número digitado como entrada é primo ou não.
            */
            System.out.print("Digite um número para saber se é primo: ");
            int num = teclado.nextInt();
            int divisores = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(num + " é um número PRIMO.");
            } else {
                System.out.println(num + " NÃO é um número primo.");
            }
        }

        public static void ex7() {
                /*
                * 7. Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% 
                * e que a população do país B seja, aproximadamente, de 200.000 habitantes com uma taxa de crescimento anual de 1,5%. 
                * Fazer um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou 
                * iguale a população do país B, mantidas essas taxas de crescimento.
                */
                double popA = 80000;
                double popB = 200000;
                int anos = 0;

                // Enquanto A for menor que B, o laço continua
                while (popA < popB) {
                    popA = popA + (popA * 0.03); // Aumenta 3%
                    popB = popB + (popB * 0.015); // Aumenta 1,5%
                    anos++; // Passou um ano
                }

                System.out.println("Serão necessários " + anos + " anos para que a população de A ultrapasse ou iguale a de B.");
                System.out.printf("População A: %.0f habitantes\n", popA);
                System.out.printf("População B: %.0f habitantes\n", popB);
            }

        public static void ex8(Scanner teclado) {
                /*
                * 8 - A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
                * Faça um programa capaz de gerar a série de acordo com a quantidade de termos informada pelo usuário.
                */
                System.out.print("Quantos termos da sequência você quer ver? ");
                int termos = teclado.nextInt();

                int atual = 1;
                int anterior = 0;
                int proximo;

                System.out.println("Série de Fibonacci:");

                for (int i = 1; i <= termos; i++) {
                    System.out.print(atual + " ");

                    proximo = atual + anterior; 
                    anterior = atual;           
                    atual = proximo;            
                }
            }

        public static void ex9(Scanner teclado) {
            /*
            * 9 - Desenvolva um programa em linguagem ‘JAVA’ que imprima na tela a soma desta serie S= 1/1 + 2/3 + 3/5+ 4/7+5/9+..+10/19.(repita)
            */
            double soma = 0;
            double baixo = 1;

            for (double cima = 1; cima <= 10; cima++) {
                soma += (cima / baixo);
                baixo += 2;
            }
            System.out.println("Soma total da série: " + soma);
        }

    public static void ex10(Scanner teclado) {
        /*
         * 10 - Faça um programa para auxiliá-lo no orçamento para a construção de uma casa. O software deve calcular os orçamentos de 3 imóveis. 
         * Para cada orçamento (pisos, tijolos e mão-de-obra) o sistema deve calcular e mostrar o resultado:
         * a) Compra de pisos. Para isso peça as dimensões do piso (lado x lado) e a metragem (m2) necessária para a colocação do piso 
         * (inserir margem de segurança de 12% e solicitar o preço de cada piso);
         * b) Compras de tijolos. Para isso solicite as dimensões do tijolo (lado x lado) e a metragem total das paredes casa. 
         * (inserir margem de segurança de 15% e solicitar o preço de cada tijolo);
         * c) Orçamento da mão-de-obra. Para isso solicite o valor(R$) do metro quadrado da mão-de-obra e quantos metros quadrados tem a casa.
         * Ao final dos 3 orçamentos mostre também:
         * d) A média de preço de todos os orçamentos.
         * e) Quantos imóveis passaram 100 m2 de área construída e o custo de mão de obra foi maior que R$ 50.000.
         */
        double somaTotalOrçamentos = 0;
        int imoveisGrandesECaros = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- ORÇAMENTO DO IMÓVEL " + i + " ---");
            
            // a) PISOS
            System.out.print("Lado do piso (metros): ");
            double ladoPiso = teclado.nextDouble();
            double areaPiso = ladoPiso * ladoPiso;
            System.out.print("Metragem da área a cobrir (m2): ");
            double areaCasaPiso = teclado.nextDouble();
            System.out.print("Preço de cada piso: R$ ");
            double precoPiso = teclado.nextDouble();
            
            double qtdPisosNecessarios = (areaCasaPiso / areaPiso) * 1.12; // 1.12 já adiciona 12%
            double custoPisos = qtdPisosNecessarios * precoPiso;

            // b) TIJOLOS (Lógica idêntica ao piso, mas com 15% -> 1.15)
            // c) MÃO DE OBRA
            System.out.print("Valor do m2 da mão de obra: R$ ");
            double valorMaoObraM2 = teclado.nextDouble();
            System.out.print("Quantos m2 tem a casa? ");
            double m2Casa = teclado.nextDouble();
            double custoMaoObra = valorMaoObraM2 * m2Casa;

            double custoTotalImovel = custoPisos + custoMaoObra; // + custoTijolos quando você fizer
            somaTotalOrçamentos += custoTotalImovel;

            // e) Verificação especial
            if (m2Casa > 100 && custoMaoObra > 50000) {
                imoveisGrandesECaros++;
            }

            System.out.println("Custo total deste imóvel: R$ " + custoTotalImovel);
        }

        // d) Média
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Média dos orçamentos: R$ " + (somaTotalOrçamentos / 3));
        System.out.println("Imóveis > 100m2 e Mão de Obra > R$ 50k: " + imoveisGrandesECaros);
    }}
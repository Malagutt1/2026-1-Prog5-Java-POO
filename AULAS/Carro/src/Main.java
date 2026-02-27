import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in);
        Carro carroNovo = new Carro();

        System.out.print("Digite o nome do carro: ");
        carroNovo.setNome(tcd.next());

        System.out.print("Digite a marca do carro: ");
        carroNovo.setMarca(tcd.next());

        System.out.print("Digite a cor do carro: ");
        carroNovo.setCor(tcd.next());

        System.out.println("\n--- AÇÕES ---");
        int op;
        do {
            System.out.println("\nEscolha a opção:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Sair");

            op = tcd.nextInt();
            if (op == 1) {
                carroNovo.acelerar();
            } 
            else if (op == 2) {
                carroNovo.frear();
            } 
            else if (op == 3) {
                System.out.println("=== Programa finalizado ===");
            } 
            else {
                System.out.println("Opção inválida!");
            }

            carroNovo.estadoAtual();

        } while (op != 3);

        tcd.close();
    }
}

/*
 * 1 - O que é programação orientada a objeto (POO)?
 * R: É um paradigma de programação baseado em objetos, que unem dados (atributos) e comportamentos (métodos). 
 * 		Seu objetivo é organizar melhor o código, facilitando reutilização e manutenção.
 * 
 * 2 -  O que é o principio da abstração presente na POO, e quais 
 * 		os quatro pilares derivados do mesmo?
 * R: serve para Representar apenas as características essenciais de um objeto, escondendo detalhes desnecessários. Abstração, encapsulamento, herança e polimorfismo
 *
 * 3 - O que são objetos na POO? Disserte e exemplifique o que representam os atributos 
 * 		ou dados e métodos ou operações do mesmo.
 * R: Objetos são instâncias de classes que representam entidades do mundo real.
		Atributos = características do objeto (ex: cor, modelo).
		Métodos = ações que o objeto pode realizar (ex: acelerar, frear).
 * */

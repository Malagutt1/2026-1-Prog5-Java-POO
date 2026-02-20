import java.util.Scanner;
public class OlaMundo {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Minhas Primeiras Mensagens Em JAVA");
		
		char options;
		options = 'c';
		
		int i = 35;
		double f = 4.5;
		boolean b = true;
		
		System.out.println("O valor de options é: "+ options);
		
		Scanner teclado = new Scanner (System.in); // Criando um Scanner de teclado
		
		String nome = "Não faz diferença agora (Inicialização)";

		System.out.print("Digite seu nome:  ");
		nome = teclado.next();  // Pega o input do User de somente uma palavra
		
		//nome = teclado.nextLine();   Usado pra ler uma linha completa
		
		System.out.println("Seu nome é: "+nome);
		
		
		

	}

}

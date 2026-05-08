package AumentaFrase;

public class AumentaFrase {

	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		try{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) {
			// NullPointerException acontece quando o programa tenta acessar um objeto que está null,
			// ou seja, que não foi inicializado.
			// Exemplo: chamar um método ou atributo de uma variável que não aponta para nenhum objeto.
			
			// O "e" é a variável que representa a exceção capturada pelo catch,
			// permitindo acessar informações sobre o erro (mensagem, rastreamento, etc.).
			
			System.out.println("O frase inicial está nula, foi atribuido um valor default.");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		
		catch (Exception e) {
		    e.printStackTrace();
		}
		
		System.out.println("Frase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);

	}

}

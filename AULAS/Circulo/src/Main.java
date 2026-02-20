import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area, raio;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o raio:  ");
		raio = teclado.nextDouble();
		area = Math.PI * Math.pow(raio,2);
		System.out.print("A área é: " +area);
		teclado.close();
	}

}

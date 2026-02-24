import java.util.Scanner;
public class Main_Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno:  ");
		String nome = teclado.next();
		
		System.out.print("Digite a matricula:  ");
		int mat = teclado.nextInt();
		
		aluno.setNome(nome);
		aluno.setMatricula(mat);
		
		//print na tela
		System.out.println("Esse é o nome do aluno: " + aluno.getNome());
		System.out.println("Esse é a matricula do aluno: " + aluno.getMatricula());
	}

}

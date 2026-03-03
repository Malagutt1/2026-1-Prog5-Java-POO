package Aluno;
import java.util.Scanner;

public class Main_Aluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.next();
        
        System.out.print("Digite a matrícula: ");
        int mat = teclado.nextInt();
        
        aluno.setNome(nome);
        aluno.setMatricula(mat);
        
        System.out.println("Esse é o nome do aluno: " + aluno.getNome());
        System.out.println("Esse é a matrícula do aluno: " + aluno.getMatricula());
        
        teclado.close();
    }
}
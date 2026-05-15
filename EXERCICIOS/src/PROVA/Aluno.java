package PROVA;

public class Aluno {
    private String nome;
    private static int quantidadeAlunos = 0;

    public Aluno(String nome) {
        this.nome = nome;
        quantidadeAlunos++;
        System.out.println("Quantidade de alunos: " + quantidadeAlunos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
}
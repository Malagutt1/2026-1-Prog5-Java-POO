package Exercicios_Heranca.Sobrecarga;

public class Cachorro {
    private String nome;
    private int idade;
    private String raca;

    // Construtor 1 - nome
    public Cachorro(String nome) {
        this.nome = nome;
        System.out.println("Construtor 1 - Cadastro com nome");
    }

    // Construtor 2 -nome e idade
    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor 2 - Cadastro com nome e idade");
    }

    // Construtor  completo 3
    public Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        System.out.println("Construtor 3 - Cadastro completo");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }
}

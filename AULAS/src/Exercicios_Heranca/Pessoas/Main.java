package Exercicios_Heranca.Pessoas;

public class Main {
    public static void main(String[] args) {

        Bolsista bolsista = new Bolsista("Kauã", 12345, "Programação Orientada a Objetos", "PROGRAMAÇÃO 5");
        
        System.out.println("Nome: " + bolsista.getNome());
        System.out.println("Matrícula: " + bolsista.getMatricula());
        System.out.println("Projeto: " + bolsista.getProjeto());
        System.out.println("Disciplina: " + bolsista.getDisciplina());
    }
}
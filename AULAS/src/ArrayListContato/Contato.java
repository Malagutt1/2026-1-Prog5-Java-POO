package ArrayListContato;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private int idade;

    public Contato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        ArrayList<Contato> listaContatos = new ArrayList<>();
        
        Contato c1 = new Contato("João", 20);
        listaContatos.add(c1);
        
        Contato c2 = new Contato("Pedro", 10);
        listaContatos.add(c2);
        
        for (int i = 0; i < listaContatos.size(); i++) {
            System.out.println("Nome: " + listaContatos.get(i).getNome() + ", Idade: " + listaContatos.get(i).getIdade());
        }
    }
}
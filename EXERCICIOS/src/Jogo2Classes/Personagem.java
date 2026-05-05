package Jogo2Classes;

public class Personagem {
	private String nome;
	private int vida;
	
	public Personagem(String nome, int vida) {
		super();
		this.nome = nome;
		this.vida = vida;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }

}

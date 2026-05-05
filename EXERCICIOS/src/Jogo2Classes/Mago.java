package Jogo2Classes;

class Mago extends Personagem {
    private int mana; // "Energia acumulada"
    private String magia;

    public Mago(String nome, int vida, int mana, String magia) {
        super(nome, vida);
        this.mana = mana;
        this.magia = magia;
    }
    
    public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getMagia() {
		return magia;
	}

	public void setMagia(String magia) {
		this.magia = magia;
	}

	public void exibirStatusCompleto() {
        super.exibirStatus();
        System.out.println("Mana: " + mana);
        System.out.println("Magia: " + magia);
    }
}

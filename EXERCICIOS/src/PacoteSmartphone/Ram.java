package PacoteSmartphone;

/*
 * ==========================
 * ======= EXERCICIOS =======
 * ==========================
 * 
 * 1. O que é e para que serve o encapsulamento na programação orientada a objetos? Exemplifique
 * R: O encapsulamento serve para “esconder” ou “mostrar” os detalhes de uma classe, controlando o acesso aos seus dados. 
 * 		Atributos definidos como private não podem ser acessados diretamente, sendo necessário utilizar métodos como getters e setters
 * 
 * = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * 
 * 2. Desenvolva as classes da lista a seguir. O encapsulamento dos atributos devem ser private e dos métodos são a seu critério.
 
	CLASSE Ram
	• Atributos: tipo (DDR2, DDR3, DDR4) e capacidade (tamanho em Gigabytes da memória)
	• Métodos set e get
	• Construtor padrão (com valores padrões para tipo e capacidade) e sobrecarga de construtor que altere todos os atributos
	
	CLASSE Processador
	• Atributos: marca, modelo e velocidade;
	• Métodos set e get.
	• Construtor padrão e sobrecarga de construtor que altere todos os atributos.
	
	CLASSE Tela
	• Atributos: tamanho e resolução;
	• Métodos set e get.
	• Construtor padrão e sobrecarga de construtor que altere todos os atributos.
	
	CLASSE Bateria
	• Atributo: capacidade.
	• Métodos set e get
	• Construtor padrão e sobrecarga de construtor que altere todos os atributos
	
	CLASSE Camera
	• Atributo: resolução
	• Métodos set e get
	• Construtor padrão e sobrecarga de construtor que altere todos os atributos
 * 
 */
public class Ram {
    private String tipo;
    private int capacidade;


    public Ram() {
        this.tipo = "DDR4";
        this.capacidade = 8; // 8GB
    }

    public Ram(String tipo, int capacidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}

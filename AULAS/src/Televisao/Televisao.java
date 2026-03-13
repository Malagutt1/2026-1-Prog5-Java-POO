package Televisao;
/*
 * Crie uma classe Televisao em Java que possua os seguintes atributos e métodos:

- Atributos:

- marca

- volume: um inteiro que representa o volume atual da televisão

- canal: um inteiro que representa o canal atual da televisão

- ligada: um booleano que indica se a televisão está ligada ou desligada

 =========

Métodos:

- gets e sets

- ligar(): liga a televisão

- desligar(): desliga a televisão

- aumentarVolume(): aumenta o volume da televisão

- diminuirVolume(): diminui o volume da televisão

- passarCanal(): passa para o próximo canal

- voltarCanal(): volta para o canal anterior

- trocarCanal(int canal): troca para o canal especificado

- estadoAtual(): mostra todos os atributos atuais da TV
=======

Na main:
==> Crie uma TV com os parâmetros: marca:LG ; volume = 0; canal = 1; ligada = false

1 Ligue a TV
2 Aumente o Volume da TV
3 Troque de canal
4 Diminua o volume
5 Altere o marca da TV para Sony
6 Desligue a TV
7 Sair
8 LigaDesliga
*/
public class Televisao {
    private String marca;
    private int volume;
    private int canalTV;
    private boolean ligada;
    private int canalAnterior = 1;


    public Televisao(String marca, int volume, int canalTV, boolean ligada) {
        this.marca = marca;
        this.volume = volume;
        this.canalTV = canalTV;
        this.ligada = ligada;
    }
    public Televisao() {}

    public String getMarca() { 
    	return marca; }
    
    public void setMarca(String marca) { 
    	this.marca = marca; }
    
    public int getVolume() { 
    	return volume; }
    
    public void setVolume(int volume) { 
    	this.volume = volume; }
    
    public int getCanalTV() { 
    	return canalTV; }
    
    public void setCanalTV(int canalTV) { 
    	this.canalTV = canalTV; }
    
    public boolean isLigada() { 
    	return ligada; }
    
    public void setLigada(boolean ligada) { 
    	this.ligada = ligada; }

//===== Métodos ========
    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }
    
    public void ligaDesliga() {
        if (this.ligada == true) {
            this.ligada = false;
            System.out.println("A TV foi desligada.");
        } else {
            this.ligada = true;
            System.out.println("A TV foi ligada.");
        }
    }

    public void aumentarVolume() {
        if (ligada) {
            if (this.volume < 100) {
                this.volume++;
            } else {
                System.out.println("Volume máximo (100) atingido!");
            }
        } else {
            System.out.println("TV desligada! Ligue para alterar o volume.");
        }
    }


    public void diminuirVolume() {
        if (ligada && volume > 0) {
        	this.volume--;
        }
    }

    public void passarCanal() {
        if (ligada) {
            if (this.canalTV < 400) {
                this.canalAnterior = this.canalTV; // Salva o canal atual antes de passar!
                this.canalTV++;
            } else {
                System.out.println("Canal máximo (400) alcançado!");
            }
        } else {
            System.out.println("A TV está desligada!");
        }
    }

    public void voltarCanal() {
        if (ligada) {
            if (this.canalTV > 1) {
                this.canalAnterior = this.canalTV; // Salva o canal atual antes de voltar!
                this.canalTV--;
            } else {
                System.out.println("Canal mínimo (1) alcançado!");
            }
        } else {
            System.out.println("A TV está desligada!");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligada) {
            this.canalAnterior = this.canalTV;
            this.canalTV = novoCanal;
        }
    }
    
    public void retornarCanalAnterior() {
        if (ligada) {
            int canalTemporario = this.canalTV;
            this.canalTV = this.canalAnterior;
            this.canalAnterior = canalTemporario;
            
            System.out.println("Retornou para o canal: " + this.canalTV);
        } else {
            System.out.println("A TV está desligada!");
        }
    }

    public void estadoAtual() {
        System.out.println("--- Status da TV ---");
        System.out.println("Marca: " + marca);
        System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canalTV);
        System.out.println("--------------------");
    }
	public int getCanalAnterior() {
		return canalAnterior;
	}
	public void setCanalAnterior(int canalAnterior) {
		this.canalAnterior = canalAnterior;
	}
}

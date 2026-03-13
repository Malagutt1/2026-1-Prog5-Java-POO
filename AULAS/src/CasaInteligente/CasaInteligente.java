package CasaInteligente;

	/*
	 * Crie uma classe qualquer sobre qualquer objeto do mundo real
	 * crie essa classe com 4 atributos e crie seus get e ser
	 * tente pensar em um método sobre o comportamento dessa classe
	 * tipo: classe lampada
	 * metodos ligar e desligar
	 * instancie um objeto dessa classe e mostre na tela seus atributos
	*/

public class CasaInteligente {
    private String nomeMoradia;
    private boolean luzesLigadas;
    private int temperaturaAr;
    private boolean modoSeguranca;

    public CasaInteligente(String nomeMoradia) {
        this.nomeMoradia = nomeMoradia;
        this.luzesLigadas = false;
        this.temperaturaAr = 24;
        this.modoSeguranca = true;
    } public CasaInteligente() {}

    public String getNomeMoradia() { 
    	return nomeMoradia; }
    
    public void setNomeMoradia(String nomeMoradia) { 
    	this.nomeMoradia = nomeMoradia; }

    public boolean isLuzesLigadas() { 
    	return luzesLigadas; }
    
    public void setLuzesLigadas(boolean luzesLigadas) { 
    	this.luzesLigadas = luzesLigadas; }

    public int getTemperaturaAr() { 
    	return temperaturaAr; }
    
    public void setTemperaturaAr(int temperaturaAr) { 
    	this.temperaturaAr = temperaturaAr; }

    public boolean isModoSeguranca() { 
    	return modoSeguranca; }
    
    public void setModoSeguranca(boolean modoSeguranca) { 
    	this.modoSeguranca = modoSeguranca; }

    // ligar casa
    public void ligarCasa() {
        this.luzesLigadas = true;
        this.modoSeguranca = false;
        System.out.println("Bem-vindo de volta! Casa " + nomeMoradia + " configurada.");
    }

    // desligar casa
    public void desligarCasa() {
        this.luzesLigadas = false;
        this.temperaturaAr = 26;
        this.modoSeguranca = true;
        System.out.println("Saindo... Modo segurança ativado.");
    }

    // ligar todas as luzes
    public void ligarTodasLuzes() {
        this.luzesLigadas = true;
        System.out.println("Todas as luzes foram ligadas.");
    }

    // modo cinema
    public void ativarModoCinema() {
        if (luzesLigadas) {
            this.luzesLigadas = false;
            this.temperaturaAr = 21;
            System.out.println("Modo cinema ativado!");
        } 
        else {
            System.out.println("Ligue as luzes primeiro para ativar o modo cinema.");
        }
    }

    // mostrar status
    public void mostrarStatus() {

        System.out.println("\n------ STATUS DA CASA ------");
        System.out.println("Moradia: " + nomeMoradia);
        System.out.println("Luzes: " + (luzesLigadas ? "Ligadas" : "Desligadas"));
        System.out.println("Temperatura: " + temperaturaAr + "°C");
        System.out.println("Modo Segurança: " + (modoSeguranca ? "Ativo" : "Inativo"));
        System.out.println("-----------------------------");
    }

}

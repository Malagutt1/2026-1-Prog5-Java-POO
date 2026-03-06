package Computador;

public class Computador{
	private String modelo;
	private int memoria;
	private int disco;
	private String processador;
	
	
	public Computador(String modelo, int memoria, int disco, String processador) {
		super();
		this.modelo = modelo;
		this.memoria = memoria;
		this.disco = disco;
		this.processador = processador;
	}
	public Computador() {}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getMemoria() {
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}


	public int getDisco() {
		return disco;
	}


	public void setDisco(int disco) {
		this.disco = disco;
	}


	public String getProcessador() {
		return processador;
	}


	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public String toString() {
		return "Modelo: " + modelo + 
				"\nMemória RAM: " + memoria + " GB" +
				"\nDisco: " + disco + " GB" +
				"\nProcessador: " + processador;
	}	
}

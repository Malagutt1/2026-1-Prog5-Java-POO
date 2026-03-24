package Prova1_Motocicleta;

public class Motocicleta {
	private String marca;
	private int marchaAtual;
	private int velocidade;
	private boolean ligada;
	public Motocicleta(String marca, int marchaAtual, int velocidade, boolean ligada) {
		super();
		this.marca = marca;
		this.marchaAtual = marchaAtual;
		this.velocidade = velocidade;
		this.ligada = ligada;
	}
	
	public Motocicleta() {
		this.marca = "Honda";
		this.marchaAtual = 0;
		this.velocidade = 0;
		this.ligada=true;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMarchaAtual() {
		return marchaAtual;
	}

	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	// =========================== //
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void aumentaMarcha() {
	    if (this.marchaAtual < 6) {
	        this.marchaAtual++;
	        System.out.println("Marcha aumentada");
	    } else {
	        System.out.println("Você não pode aumentar de marcha!");
	    }
	}

	public void diminuiMarcha() {
	    if (this.marchaAtual > 0) {
	        this.marchaAtual--;
	        System.out.println("Marcha diminuída");
	    } else {
	        System.out.println("Você não pode diminuir de marcha!");
	    }
	}
	
	public void acelerar() {
	    if (ligada) {
	        this.velocidade += 10;
	    } else {
	        System.out.println("A moto está desligada!");
	    }
	}
	
	public void frear() {
	    if (this.velocidade >= 10) {
	        this.velocidade -= 10;
	    } else {
	        this.velocidade = 0;
	    }
	}
	
	public void status() {
	    System.out.println("===== STATUS DA MOTOCICLETA =====");
	    System.out.println("Marca: " + this.marca);
	    System.out.println("Marcha Atual: " + this.marchaAtual);
	    System.out.println("Velocidade: " + this.velocidade + " km/h");
	    System.out.println("Ligada: " + (this.ligada ? "Sim" : "Não"));
	}
	
}

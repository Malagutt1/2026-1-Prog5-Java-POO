package Moto_Piloto;

public class Motocicleta {
	private String marca;
	private int velocidade;
	private int marcha;
	private String placa;
	
	public Motocicleta(String marca, int velocidade, int marcha, String placa) {
		super();
		this.marca = marca;
		this.velocidade = velocidade;
		this.marcha = marcha;
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		if (velocidade >= 0) {
            this.velocidade = velocidade;
        }
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		if (marcha >= 0) {
            this.marcha = marcha;
        }
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	//============================//
	public void acelerar() {
	    if (this.velocidade < 200) {
	        this.velocidade += 10;
	        if (this.velocidade > 200) {
	            this.velocidade = 200;
	        }
	        System.out.println("Acelerando...");
	    } else {
	        System.out.println("Velocidade máxima atingida");
	    }
	}
	
	public void frear() {
		if (this.velocidade >= 10) {
            this.velocidade -= 10;
            System.out.println("Freando...");
        } else {
            this.velocidade = 0;
            System.out.println("Moto parada...");
        }
	}
	
	public void aumentarMarcha() {
	    if (this.marcha < 6) {
	        this.marcha++;
	        System.out.println("Marcha aumentada...");
	    } else {
	        System.out.println("Marcha máxima atingida!");
	    }
	}
	
	public void diminuirMarcha() {
	    if (this.marcha > 0) {
	        this.marcha--;
	        System.out.println("Marcha diminuída...");
	    } else {
	        System.out.println("Já está na menor marcha!");
	    }
	}
	//============================//
}

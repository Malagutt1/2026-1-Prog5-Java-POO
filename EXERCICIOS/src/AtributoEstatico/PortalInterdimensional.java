package AtributoEstatico;

public class PortalInterdimensional {
	public static int totalPortais = 0; //Atributo static
    private String destino;
    private boolean ativo;

	public PortalInterdimensional(String destino, boolean ativo) {
		super();
		this.destino = destino;
		this.ativo = ativo;
		totalPortais++;
	}
	
    public PortalInterdimensional(String destino) {
        this.destino = destino;
        this.ativo = false;
        totalPortais++;
    }

	public static int getTotalPortais() {
		return totalPortais;
	}

	public static void setTotalPortais(int totalPortais) {
		PortalInterdimensional.totalPortais = totalPortais;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
    
	public void ativarPortal() {
	    ativo = true;
	    System.out.println("Portal para " + destino + " ativado!");
	}
	
	public void desativaPortal() {
	    ativo = true;
	    System.out.println("Portal para " + destino + " desativado!");
	}

	public static void mostrarTotalPortais() { //Estático 
	    System.out.println("Total de portais criados: " + totalPortais);
	}


    
}
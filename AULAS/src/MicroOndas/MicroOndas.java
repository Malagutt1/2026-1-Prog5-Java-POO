package MicroOndas;

public class MicroOndas {
	private String marca;
	private int tempo;
	private String tipoAlimento;
	private boolean ligado;
	
        
	public MicroOndas(String marca, int tempo, String tipoAlimento, boolean ligado) {
		this.marca = marca;
		this.tempo = tempo;
		this.tipoAlimento = tipoAlimento;
		this.ligado = ligado;
	}
	
	public MicroOndas() {
		this.marca = "IFSC";
		this.tempo = 0;
		this.tipoAlimento = "gado";
		this.ligado = false;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public String getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
		
	public void limitaTempo() {
        if (tempo > 120) {
            tempo = 120;
            System.out.println("== TEMPO LIMITE ATINGIDO (120s) ==");
        }
    }
	
	public void mais30() {
	    if (!ligado) {
	        System.out.println("Ligue o micro-ondas primeiro para adicionar tempo!");
	        return;
	    }
	    this.tempo += 30;
	    limitaTempo();
	}
	
    public void tipoAlimento(String tipo) {
        this.tipoAlimento = tipo;
        System.out.println("Alimento selecionado: " + this.tipoAlimento);
    }
    
    public void insiraTempo(int tempo) {
        this.tempo = tempo;
        limitaTempo();
    }
    
    public void ligaDesliga() {
        ligado = !ligado;
        if (ligado) {
            System.out.println("Micro-ondas ligado.");
        } else {
            System.out.println("Micro-ondas desligado.");
        }
    }
    
    public void status() {
        System.out.println("========== STATUS DO MICRO-ONDAS ==========");
        System.out.println("Marca: " + getMarca());
        System.out.println("Tempo: " + getTempo() + "s");
        System.out.println("Alimento: " + getTipoAlimento());
        System.out.println("Ligado: " + (isLigado() ? "Sim" : "Não"));
        System.out.println("===========================================\n");
    }
}
package StaticContas;

public class contaCorrente {
    private static int totalDeContas = 0;
    private int conta;
    private int agencia;
    
    public contaCorrente(int conta, int agencia) {
        super();
        this.conta = conta;
        this.agencia = agencia;
        contaCorrente.totalDeContas++;
        System.out.println(contaCorrente.totalDeContas);
    }

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public static void setTotalDeContas(int totalDeContas) {
		contaCorrente.totalDeContas = totalDeContas;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
    

}
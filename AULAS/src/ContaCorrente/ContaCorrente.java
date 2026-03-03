package ContaCorrente;
public class ContaCorrente {
    private int agencia;
    private int contaCorrente;
    private int saldo;


    public ContaCorrente() {
        this.saldo = 0;
    }

    // Getters e Setters
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado! Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(int valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
    
    public void transferir(ContaCorrente c, float transf) {
        if (transf > 0 && saldo >= transf) {
            this.saldo -= (int) transf;
            c.saldo += (int) transf;
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else if (transf <= 0) {
            System.out.println("Valor inválido! A transferência deve ser maior que zero.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência!");
        }
    }

    public void status() {
        System.out.println("\n--- STATUS DA CONTA ---");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta Corrente: " + contaCorrente);
        System.out.println("Saldo: " + saldo);
    }
}
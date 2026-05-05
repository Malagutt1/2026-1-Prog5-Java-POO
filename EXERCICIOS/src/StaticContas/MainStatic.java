package StaticContas;

public class MainStatic {
    public static void main(String[] args) {
        System.out.println("Criando contas...\n");
        contaCorrente c1 = new contaCorrente(101, 1);
        contaCorrente c2 = new contaCorrente(102, 1);
        contaCorrente c3 = new contaCorrente(103, 2);

        System.out.println("\n--- Dados das Contas ---");
        System.out.println("Conta c1: " + c1.getConta() + " | Agência: " + c1.getAgencia());
        System.out.println("Conta c2: " + c2.getConta() + " | Agência: " + c2.getAgencia());
        System.out.println("Conta c3: " + c3.getConta() + " | Agência: " + c3.getAgencia());

        System.out.println("\n--- Testando variável static ---");
        System.out.println("Total de contas (pela classe): " + contaCorrente.getTotalDeContas());
    }
}
package PROVA;

public class TryCatch {

    public static void main(String[] args) {
        int numerador = 10;
        try {
            int resultado = numerador / 0; //Isso aqui gera erro
            System.out.println("Resultado: " + resultado);
        } 
        catch (ArithmeticException e) {
            System.out.println("Erro: O numero não pode ser dividido por zero!");
        }

        System.out.println("Programa não fecha e continua rodando");
    }
}
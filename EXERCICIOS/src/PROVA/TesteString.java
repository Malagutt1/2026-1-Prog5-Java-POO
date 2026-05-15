package PROVA;

public class TesteString {
    public static void main(String[] args) {
        String texto = "Programação Orientada";

        // 1) Tamanho da String
        System.out.println("Tamanho: " + texto.length());

        // 2) String em maiúsculo
        System.out.println("Maiúsculo: " + texto.toUpperCase());

        // 3) Substituir "Orientada" por "Estruturada"
        String novoTexto = texto.replace("Orientada", "Estruturada");
        System.out.println("Substituição: " + novoTexto);
    }
}
package Prova1_Motocicleta;
import java.util.Scanner;

public class Motocicleta_Main {

    public static void main(String[] args) {
        
        Scanner tkl = new Scanner(System.in);
        
        // Dois objetos com construtores diferentes
        Motocicleta mt1 = new Motocicleta();
        Motocicleta mt2 = new Motocicleta("Yamaha", 1, 20, true);
        
        int op;
        
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Definir dados da Moto 1");
            System.out.println("2 - Acelerar Moto 1");
            System.out.println("3 - Frear Moto 1");
            System.out.println("4 - Aumentar marcha Moto 1");
            System.out.println("5 - Diminuir marcha Moto 1");
            System.out.println("6 - Mostrar status Moto 1");
            System.out.println("7 - Mostrar status Moto 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            op = tkl.nextInt();
            tkl.nextLine(); // limpar buffer
            
            if (op == 1) {
                System.out.print("Marca: ");
                mt1.setMarca(tkl.nextLine());
                
                System.out.print("Marcha atual: ");
                mt1.setMarchaAtual(tkl.nextInt());
                
                System.out.print("Velocidade: ");
                mt1.setVelocidade(tkl.nextInt());
                
                System.out.print("Está ligada? (sim/nao): ");
                String resp = tkl.nextLine();

                if (resp.equalsIgnoreCase("sim")) {
                    mt1.setLigada(true);
                } 
                else if (resp.equalsIgnoreCase("nao")) {
                    mt1.setLigada(false);
                } 
                else {
                    System.out.println("Valor inválido! Considerando como desligada.");
                    mt1.setLigada(false);
                }
            }
            
            else if (op == 2) {
                mt1.acelerar();
            }
            
            else if (op == 3) {
                mt1.frear();
            }
            
            else if (op == 4) {
                mt1.aumentaMarcha();
            }
            
            else if (op == 5) {
                mt1.diminuiMarcha();
            }
            
            else if (op == 6) {
                mt1.status();
            }
            
            else if (op == 7) {
                mt2.status();
            }
            
            else if (op == 0) {
                System.out.println("Saindo...");
            }
            
            else {
                System.out.println("Opção inválida!");
            }
            
        } while (op != 0);
        
        tkl.close();
    }
}
package Computador;
import java.util.Scanner;
public class Computador_Main {

	public static void main(String[] args) {
		Computador pc1 = new Computador();
		Computador pc2 = null;
		Scanner tcd = new Scanner(System.in);
		int op;
		
		do {
			System.out.println();
			System.out.println("===============================");
			System.out.println("1 - Montar novo Computador");
			System.out.println("2 - Ver computadores montados");
			System.out.println("===============================");
			System.out.println();
			
			op = tcd.nextInt();
			tcd.nextLine();
            if (op == 1) {
            	
            	System.out.print ("Escolha configurar computador 1 ou 2:");
            	int escPc = tcd.nextInt();
            	tcd.nextLine();
            	if (escPc == 1) {
            		System.out.println();
            		System.out.println("===== Configurando COMPUTADOR 1 =====");
            		System.out.print("Informe o modelo do seu computador! ");
            		pc1.setModelo(tcd.nextLine()); 

            		System.out.print("Informe a quantidade de memória RAM do " + pc1.getModelo() + "! ");
            		pc1.setMemoria(tcd.nextInt());
            		tcd.nextLine();

            		System.out.print("Informe a quantidade de armazenamento (disco) do " + pc1.getModelo() + "! ");
            		pc1.setDisco(tcd.nextInt());
            		tcd.nextLine();

            		System.out.print("Informe o modelo do seu processador! ");
            		pc1.setProcessador(tcd.nextLine());            		
            		
            		
            	}
            	else if(escPc == 2){
            		System.out.println();
            		System.out.println("===== Configurando COMPUTADOR 2 =====");
            		System.out.print("Informe o modelo do PC 2: ");
            		String modeloPC = tcd.nextLine();

            		System.out.print("Informe a quantidade de memória RAM do PC 2: ");
            		int memoriaPC = tcd.nextInt();
            		tcd.nextLine();

            		System.out.print("Informe a quantidade de armazenamento do PC 2: ");
            		int discoPC = tcd.nextInt();
            		tcd.nextLine();

            		System.out.print("Informe o processador do PC 2: ");
            		String procPC = tcd.nextLine();

            		pc2 = new Computador(modeloPC, memoriaPC, discoPC, procPC);
            		
            	}
            	else {
            		System.out.println("=== Informação Invalida ===");
            	}
            } 
                        
            else if (op == 2) {
            	System.out.println();
            	System.out.println("===== COMPUTADOR 1 =====");
            	System.out.println(pc1.toString());
            	System.out.println("========================");
            	if (pc2 != null) {
            		System.out.println(pc2.toString());
                	System.out.println("========================");            		
            	}
            	
            	
            }
            else if (op == 3) {
                System.out.println("=== Programa finalizado ===");
            } 
            else {
                System.out.println("Opção inválida!");
            }
			
		}
		while(op != 3);
		
		tcd.close();
	}

}
package Televisao;
import java.util.Scanner;

public class Televisao_Main {
	public static void main(String[] args) {
		Scanner tkl = new Scanner(System.in);
		
		Televisao minhaTV = new Televisao("LG", 0, 1, false);
										// Marca | Volume | Canal | Ligada
		
		int op;
		do {
			System.out.println("========== MENU ==========");
			System.out.println("1 - Ligar Televisão");
			System.out.println("2 - Desligar Televisão");
			System.out.println("3 - Liga-Desliga Televisão");
			System.out.println("4 - Aumentar Volume");
			System.out.println("5 - Diminuir Volume");
			System.out.println("6 - Aumentar Canal");
			System.out.println("7 - Diminuir Canal");
			System.out.println("8 - Trocar Canal");
			System.out.println("9 - Canal Anterior");
			System.out.println("10 - Alterar Marca");
			System.out.println("11 - Sair");
			System.out.println("==========================");
			System.out.print("Digite a opção escolhida: ");
			op = tkl.nextInt();
			
			if(op == 1) {
				if (!minhaTV.isLigada()) {
	                minhaTV.ligar();
	                System.out.println("");
	                System.out.println("Televisão " + minhaTV.getMarca() + " ligou!");
	            } else {
	                System.out.println("A televisão já está ligada!");
	            }
				System.out.println("");
	            minhaTV.estadoAtual();
			}
			
			if(op == 2) {
	        	if (minhaTV.isLigada()) {
	                minhaTV.desligar();
	                System.out.println("");
	                System.out.println("Televisão " + minhaTV.getMarca() + " desligou!");
	            } else {
	                System.out.println("A televisão já está desligada!");
	            }
				System.out.println("");
	            minhaTV.estadoAtual();
	        }
			
			if(op == 3) {
	        	minhaTV.ligaDesliga();
	        }
			
			if(op == 4) {
			    if (minhaTV.isLigada()) {
			        if (minhaTV.getVolume() < 100) {
			            minhaTV.aumentarVolume();
			            System.out.println("Volume atual: " + minhaTV.getVolume());
			        } else {
			            System.out.println("Aviso: Volume já está no máximo!");
			        }
			    } else {
			        System.out.println("Erro: A televisão precisa estar ligada para aumentar o volume!");
			    }
			}
			
	        if(op == 5) {	        	
	        	if (minhaTV.isLigada()) {
			        if (minhaTV.getVolume() > 0) {
			            minhaTV.diminuirVolume();
			            System.out.println("Volume atual: " + minhaTV.getVolume());
			        } else {
			            System.out.println("Aviso: Volume já está no minimo!");
			        }
			    } else {
			        System.out.println("Erro: A televisão precisa estar ligada para diminuir o volume!");
			    };
	        }
	        
	        if(op == 6) {
	        	minhaTV.passarCanal();
	        	System.out.println("Canal atual: " + minhaTV.getCanalTV());
	        }
	        
	        if(op == 7) {
	        	minhaTV.voltarCanal();
	        	System.out.println("Canal atual: " + minhaTV.getCanalTV());
	        }
	        
	        if(op == 8) {
	            System.out.print("Digite o número do canal: ");
	            int novoCanal = tkl.nextInt();
	            minhaTV.trocarCanal(novoCanal);
	            minhaTV.estadoAtual();
	        }
	        
	        if(op == 9) {
	        	minhaTV.retornarCanalAnterior();
	        }
	        
	        if(op == 10) {
	            System.out.print("Digite a nova marca: ");
	            tkl.nextLine();
	            String novaMarca = tkl.nextLine();
	            minhaTV.setMarca(novaMarca);
	        }
			
		}while(op != 11);
		
		
		tkl.close();
	}
}
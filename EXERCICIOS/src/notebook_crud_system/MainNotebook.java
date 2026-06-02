package notebook_crud_system;

import java.util.ArrayList;
import java.util.Scanner;

public class MainNotebook {
    public static void main(String[] args) {
        Scanner tkl = new Scanner(System.in);
        ArrayList<Notebook> estoque = new ArrayList<>();        
        int op;
        do {
            System.out.println("\n===== SISTEMA DE ESTOQUE NOTEBOOKS =====");
            System.out.println("1 - Cadastrar Notebook");
            System.out.println("2 - Listar Estoque");
            System.out.println("3 - Atualizar Preço");
            System.out.println("4 - Remover Notebook");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            op = tkl.nextInt();
            tkl.nextLine(); // Limpa o buffer após ler o número da opção

            if (op == 1) { // CREATE - Cadastrar
                System.out.println("\n--- Cadastrar Novo Notebook ---");
                System.out.print("Marca: ");
                String marca = tkl.nextLine();
                System.out.print("Modelo: ");
                String modelo = tkl.nextLine();
                System.out.print("Tipo (Gamer/Normal): ");
                String tipo = tkl.nextLine();
                System.out.print("Preço (R$): ");
                double preco = tkl.nextDouble();
                tkl.nextLine(); // Limpa buffer

                // Coleta dados do Processador
                System.out.print("Nome do Processador (ex: i7-14650HX): ");
                String nomeCpu = tkl.nextLine();
                System.out.print("Consumo do Processador (ex: 55W): ");
                String wattsCpu = tkl.nextLine();
                Processador cpu = new Processador(nomeCpu, wattsCpu);

                // Coleta dados da Placa de Vídeo
                System.out.print("Modelo da Placa de Vídeo (ex: RTX 4060): ");
                String modeloGpu = tkl.nextLine();
                System.out.print("Tipo da Placa (Dedicada/Integrada): ");
                String tipoGpu = tkl.nextLine();
                System.out.print("Quantidade de VRAM em GB (0 se integrada): ");
                int vram = tkl.nextInt();
                tkl.nextLine(); // Limpa buffer
                PlacaVideo gpu = new PlacaVideo(modeloGpu, tipoGpu, vram);

                // Coleta dados restantes do hardware interno
                System.out.print("Quantidade de Memória RAM (GB): ");
                int ram = tkl.nextInt();
                System.out.print("Armazenamento SSD (GB): ");
                int ssd = tkl.nextInt();
                tkl.nextLine(); // Limpa buffer

                // Coleta dados da Tela
                System.out.print("Tipo de Painel da Tela (IPS/OLED/TN): ");
                String painel = tkl.nextLine();
                System.out.print("Taxa de Atualização (Hz): ");
                int hz = tkl.nextInt();
                System.out.print("Brilho da Tela (Nits): ");
                int nits = tkl.nextInt();
                tkl.nextLine(); // Limpa buffer
                Tela tela = new Tela(painel, hz, nits);

                // Cria o objeto composto final e insere no ArrayList
                Notebook novoNotebook = new Notebook(marca, modelo, tipo, preco, cpu, gpu, ram, ssd, tela);
                estoque.add(novoNotebook);
                System.out.println(">> Notebook cadastrado com sucesso!");
                
            } else if (op == 2) { // READ - Listar
                System.out.println("\n--- Estoque Atual ---");
                if (estoque.isEmpty()) {
                    System.out.println(">> O estoque está vazio.");
                } else {
                    for (int i = 0; i < estoque.size(); i++) {
                        System.out.println("ID [" + i + "]");
                        System.out.println(estoque.get(i)); 
                    }
                }
                
            } else if (op == 3) { // UPDATE - Atualizar Preço
                System.out.println("\n--- Atualizar Preço ---");
                if (estoque.isEmpty()) {
                    System.out.println(">> Nenhum notebook disponível para atualizar.");
                } else {
                    System.out.println(">> Itens disponíveis para atualização:");
                    for (int i = 0; i < estoque.size(); i++) {
                        // Lista os itens de forma resumida
                        System.out.println("ID [" + i + "] - " + estoque.get(i).getMarca() + " " + estoque.get(i).getModelo() + " | Preço atual: R$ " + estoque.get(i).getPreco());
                    }
                    
                    System.out.print("\nDigite o ID do notebook que deseja atualizar: ");
                    int idAtualizar = tkl.nextInt();

                    if (idAtualizar >= 0 && idAtualizar < estoque.size()) {
                        System.out.print("Digite o novo preço para o " + estoque.get(idAtualizar).getModelo() + ": R$ ");
                        double novoPreco = tkl.nextDouble();
                        tkl.nextLine(); // Limpa buffer
                        
                        estoque.get(idAtualizar).setPreco(novoPreco);
                        System.out.println(">> Preço atualizado com sucesso!");
                    } else {
                        System.out.println(">> ERRO: ID inválido!");
                    }
                }
                
            } else if (op == 4) { // DELETE - Remover
                System.out.println("\n--- Remover Notebook do Estoque ---");
                if (estoque.isEmpty()) {
                    System.out.println(">> Nenhum notebook cadastrado para remover.");
                } else {
                    System.out.println(">> Itens disponíveis para remoção:");
                    for (int i = 0; i < estoque.size(); i++) {
                        // Lista os itens de forma resumida
                        System.out.println("ID [" + i + "] - " + estoque.get(i).getMarca() + " " + estoque.get(i).getModelo());
                    }

                    System.out.print("\nDigite o ID do notebook que deseja remover: ");
                    int idRemover = tkl.nextInt();

                    if (idRemover >= 0 && idRemover < estoque.size()) {
                        Notebook removido = estoque.remove(idRemover);
                        System.out.println(">> O notebook '" + removido.getModelo() + "' foi removido com sucesso!");
                    } else {
                        System.out.println(">> ERRO: ID inválido!");
                    }
                }
                
            } else if (op == 5) { // Opção de saída
                System.out.println(">> Encerrando o sistema de estoque... Até logo!");
                
            } else { // Tratamento de erro (equivalente ao default)
                System.out.println(">> ERRO: Opção inválida! Selecione um número de 1 a 5.");
            }
            
        } while (op != 5);
        
        tkl.close();
    }
}
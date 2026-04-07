package TesteLogin;

import java.util.Scanner;

public class Main {
    static Login[] logins = new Login[100];
    static int totalLogins = 0;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();   // limpa o buffer
            
            if(opcao == 1) {
                // ==================== CRIAR NOVO LOGIN ====================
                System.out.println("\n═══ CRIAR NOVO LOGIN ═══");
                
                System.out.print("Digite o nome de usuário: ");
                String nome = scanner.nextLine();
                
                System.out.print("Digite a página (instagram, google, twitter, etc): ");
                String nomePagina = scanner.nextLine();
                
                String senha;
                boolean senhaValida = false;
                
                while(senhaValida == false) {
                    System.out.print("Digite a senha (deve conter exatamente 4 dígitos): ");
                    senha = scanner.nextLine();
                    
                    if(senha.length() == 4) {
                        boolean todosDigitos = true;
                        for(int i = 0; i < senha.length(); i++) {
                            if(senha.charAt(i) < '0' || senha.charAt(i) > '9') {
                                todosDigitos = false;
                                break;
                            }
                        }
                        
                        if(todosDigitos) {
                            logins[totalLogins] = new Login(nome, senha, nomePagina);
                            totalLogins++;
                            senhaValida = true;
                        } else {
                            System.out.println("✗ A senha deve conter apenas dígitos (0-9).");
                        }
                    } else {
                        System.out.println("✗ A senha deve ter exatamente 4 dígitos. Você digitou: " + senha.length());
                    }
                }
                
            } 
            else if(opcao == 2) {
                // ==================== LISTAR LOGINS ====================
                if(totalLogins == 0) {
                    System.out.println("\n✗ Nenhum login cadastrado ainda.");
                } else {
                    System.out.println("\n═══ LOGINS CADASTRADOS ═══");
                    System.out.println("╔════════════════════════════════════════════════╗");
                    
                    for(int i = 0; i < totalLogins; i++) {
                        System.out.println("║ ID: " + (i + 1));
                        System.out.println("║ Usuário: " + logins[i].getNome());
                        System.out.println("║ Página: " + logins[i].nomePagina);
                        System.out.println("║ Senha: ****");
                        System.out.println("╠════════════════════════════════════════════════╣");
                    }
                    
                    System.out.println("║ Total de logins: " + totalLogins);
                    System.out.println("╚════════════════════════════════════════════════╝");
                }
            } 
            else if(opcao == 3) {
                // ==================== EDITAR LOGIN ====================
                if(totalLogins == 0) {
                    System.out.println("\n✗ Nenhum login para editar.");
                } else {
                    // Lista os logins primeiro
                    System.out.println("\n═══ LOGINS CADASTRADOS ═══");
                    for(int i = 0; i < totalLogins; i++) {
                        System.out.println("ID: " + (i + 1) + " | Usuário: " + logins[i].getNome() + " | Página: " + logins[i].nomePagina);
                    }
                    
                    System.out.print("\nDigite o ID do login a editar (1 a " + totalLogins + "): ");
                    int id = scanner.nextInt() - 1;
                    scanner.nextLine();
                    
                    if(id < 0 || id >= totalLogins) {
                        System.out.println("✗ ID inválido!");
                    } else {
                        System.out.println("\n═══ EDITAR LOGIN ═══");
                        
                        System.out.print("Novo nome de usuário (atual: " + logins[id].getNome() + "): ");
                        String novoNome = scanner.nextLine();
                        if(novoNome.length() > 0) {
                            logins[id].setNome(novoNome);
                        }
                        
                        System.out.print("Nova página (atual: " + logins[id].nomePagina + "): ");
                        String novaPagina = scanner.nextLine();
                        if(novaPagina.length() > 0) {
                            logins[id].nomePagina = novaPagina;
                        }
                        
                        System.out.print("Nova senha (4 dígitos - Enter para não alterar): ");
                        String novaSenha = scanner.nextLine();
                        
                        if(novaSenha.length() > 0) {
                            if(novaSenha.length() == 4) {
                                boolean todosDigitos = true;
                                for(int i = 0; i < novaSenha.length(); i++) {
                                    if(novaSenha.charAt(i) < '0' || novaSenha.charAt(i) > '9') {
                                        todosDigitos = false;
                                        break;
                                    }
                                }
                                if(todosDigitos) {
                                    logins[id].setSenha(novaSenha);
                                    System.out.println("✓ Login atualizado com sucesso!");
                                } else {
                                    System.out.println("✗ A senha deve conter apenas dígitos.");
                                }
                            } else {
                                System.out.println("✗ A senha deve ter exatamente 4 dígitos.");
                            }
                        }
                    }
                }
            } 
            else if(opcao == 4) {
                // ==================== DELETAR LOGIN ====================
                if(totalLogins == 0) {
                    System.out.println("\n✗ Nenhum login para deletar.");
                } else {
                    // Lista os logins primeiro
                    System.out.println("\n═══ LOGINS CADASTRADOS ═══");
                    for(int i = 0; i < totalLogins; i++) {
                        System.out.println("ID: " + (i + 1) + " | Usuário: " + logins[i].getNome());
                    }
                    
                    System.out.print("\nDigite o ID do login a deletar (1 a " + totalLogins + "): ");
                    int id = scanner.nextInt() - 1;
                    scanner.nextLine();
                    
                    if(id < 0 || id >= totalLogins) {
                        System.out.println("✗ ID inválido!");
                    } else {
                        String nomeRemovido = logins[id].getNome();
                        
                        for(int i = id; i < totalLogins - 1; i++) {
                            logins[i] = logins[i + 1];
                        }
                        
                        totalLogins--;
                        System.out.println("✓ Login de '" + nomeRemovido + "' deletado com sucesso!");
                    }
                }
            } 
            else if(opcao == 5) {
                System.out.println("\n✓ Programa encerrado. Até logo!");
            } 
            else {
                System.out.println("\n✗ Opção inválida! Tente novamente.");
            }
            
        } while(opcao != 5);
        
        scanner.close();
    }
    
    static void exibirMenu() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║      SISTEMA DE GERENCIAMENTO      ║");
        System.out.println("║          DE LOGINS                 ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. Criar novo login                ║");
        System.out.println("║ 2. Listar todos os logins          ║");
        System.out.println("║ 3. Editar login                    ║");
        System.out.println("║ 4. Deletar login                   ║");
        System.out.println("║ 5. Sair                            ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.print("Escolha uma opção: ");
    }
}
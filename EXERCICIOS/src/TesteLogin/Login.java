package TesteLogin;

public class Login {
    private String nome;
    private String senha;

    public String nomePagina;

    public Login() {
        this.nome = "";
        this.senha = "";
        this.nomePagina = "";
    }
    
    public Login(String nome, String senha, String nomePagina) {
        this.nome = nome;
        this.nomePagina = nomePagina;
        this.senha = senha;
        validaLogin(); // chama a validação
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    private boolean validaLogin() {
        if (senha != null && senha.length() == 4) {
            System.out.println("Sucesso!");
            return true;
        } else {
            System.out.println("Falha de Login, verifique sua senha!");
            return false;
        }
    }
}
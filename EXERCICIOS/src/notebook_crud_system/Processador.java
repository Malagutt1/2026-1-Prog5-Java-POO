package notebook_crud_system;

public class Processador {
    private String nome;
    private String watts; // Ex:"15W"

    public Processador(String nome, String watts) {
        this.nome = nome;
        this.watts = watts;
    }

    @Override
    public String toString() {
        return nome + " (" + watts + ")";
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getWatts() { return watts; }
    public void setWatts(String watts) { this.watts = watts; }
}
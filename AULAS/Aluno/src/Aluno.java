// Crie a classe alguno com
// nome e matricula
public class Aluno {
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {	//Construtor do aluno
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Aluno() {	//Construtor do aluno Vazio
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}

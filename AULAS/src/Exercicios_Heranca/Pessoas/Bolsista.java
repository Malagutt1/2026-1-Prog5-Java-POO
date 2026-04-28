package Exercicios_Heranca.Pessoas;

public class Bolsista extends Aluno{
	private String Projeto;
	private String Disciplina;
	public Bolsista(String nome, int matricula, String projeto, String disciplina) {
		super(nome, matricula);
		Projeto = projeto;
		Disciplina = disciplina;
	}
	public String getProjeto() {
		return Projeto;
	}
	public void setProjeto(String projeto) {
		Projeto = projeto;
	}
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	
	

}

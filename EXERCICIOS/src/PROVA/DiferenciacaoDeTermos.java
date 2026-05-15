package PROVA;

public class DiferenciacaoDeTermos {
    
    /* Método Abstrato
        1 pt) Qual a diferença entre: método abstrato X método concreto (normal) | Explique de forma objetiva.
        R: O método abstrato cria algo incompleto, que será implementado na classe filha, diferente do método normal,
           que já é criado e possui implementação na própria classe.

        1 pt) Cite uma diferença entre: interface X classe abstrata
        R: Interface define quais métodos devem existir => IMPLEMENTS e pode implementar várias interfaces separadas por vírgula.
           Classe abstrata é incompleta e pode ter métodos concretos ou abstratos => EXTENDS, e só pode ser uma por classe.

        1 pt) Explique para que serve a palavra-chave super em Java.
        R: A palavra-chave super é usada para acessar membros ou construtores da superclasse a partir da subclasse.

        1 pt) Dê um pequeno exemplo.
        class Pessoa {
    		private String nome;
    		public Pessoa(String nome) {
        		this.nome = nome;
    		}
		}
		class Aluno extends Pessoa {
		    private String curso;		
		    public Aluno(String nome, String curso) {
		        super(nome);
		        this.curso = curso;
		    }
		}

*/
}



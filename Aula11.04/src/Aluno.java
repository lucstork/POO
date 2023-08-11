public class Aluno {
	private String nome; // só a class Aluno tem acesso!!
	private String curso; // só a class Aluno tem acesso!!
	private int matricula; // só a class Aluno tem acesso!!
	
	public Aluno(String nome, String curso, int matricula) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}
	public Aluno() {
		
	}
	
	// Como resolver??
	
	public String getNome() { // get mostra;
		return nome;
	}
	public void setNome(String nome) { // set altera;
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}

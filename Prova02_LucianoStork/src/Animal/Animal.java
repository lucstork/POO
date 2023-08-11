package Animal;

public abstract class Animal {
	private String nome;
	private String raça;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public abstract String falar();

}

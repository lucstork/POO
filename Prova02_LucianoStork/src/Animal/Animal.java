package Animal;

public abstract class Animal {
	private String nome;
	private String ra�a;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa�a() {
		return ra�a;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	
	public abstract String falar();

}

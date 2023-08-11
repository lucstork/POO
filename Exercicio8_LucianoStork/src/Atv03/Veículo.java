package Atv03;

public abstract class Veículo {
	private String nome;
	private String anoFabricaçao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAnoFabricaçao() {
		return anoFabricaçao;
	}
	public void setAnoFabricaçao(String anoFabricaçao) {
		this.anoFabricaçao = anoFabricaçao;
	}
	
	public abstract String todosDados();
}

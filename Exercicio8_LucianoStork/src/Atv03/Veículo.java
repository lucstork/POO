package Atv03;

public abstract class Ve�culo {
	private String nome;
	private String anoFabrica�ao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAnoFabrica�ao() {
		return anoFabrica�ao;
	}
	public void setAnoFabrica�ao(String anoFabrica�ao) {
		this.anoFabrica�ao = anoFabrica�ao;
	}
	
	public abstract String todosDados();
}

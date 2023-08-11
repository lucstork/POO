package Questao06_ListaRone;

public abstract class Veiculo {
	private String placa;
	private String cor;
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public abstract void insereDados(); 
	
	public abstract String todosDados();
		
}

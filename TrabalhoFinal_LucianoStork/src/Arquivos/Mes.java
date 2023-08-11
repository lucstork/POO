package Arquivos;

public abstract class Mes {
	private String nome;
	private String dataInicio;
	private String dataFechamento;
	private double saldoInicial;
	private double gastos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	
	public double getGastos() {
		return gastos;
	}
	public void setGastos(double gastos) {
		this.gastos = gastos;
	}
	
	public abstract String todosDados();
	
}
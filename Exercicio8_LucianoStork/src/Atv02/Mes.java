package Atv02;

public class Mes {
	private String nome;
	private double salario, gastos, impostos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getGastos() {
		return gastos;
	}
	public void setGastos(double gastos) {
		this.gastos = gastos;
	}
	
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
	public double saldo() {
		double saldo = getSalario() - (getGastos() + getImpostos());
		return saldo;
	}
	
}

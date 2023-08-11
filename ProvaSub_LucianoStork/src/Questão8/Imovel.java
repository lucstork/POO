package Questão8;

public class Imovel {
	private String endereço;
	private double preço;

	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String imprimeDados() {
		return "Endereço: " + getEndereço() + "\nPreço: R$" + getPreço() + "\n\n";
	}
	
	public void setAdicional(double i) {}
	public void setDesconto(double i) {};

}

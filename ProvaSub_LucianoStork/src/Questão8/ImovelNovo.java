package Questão8;

public class ImovelNovo extends Imovel {
	private double adicional; 
	
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public String imprimeDados() {
		return "Imóvel Novo: \nEndereço: " + super.getEndereço() + "\nPreço: R$" + super.getPreço() + "\nAdicional: R$ " + this.getAdicional() + "\nPreço final: R$" + (super.getPreço() + this.getAdicional()) + "\n\n" ;
	}

}

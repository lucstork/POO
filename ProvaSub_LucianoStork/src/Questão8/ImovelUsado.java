package Questão8;

public class ImovelUsado extends Imovel{
	private double desconto;

	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public String imprimeDados() {
		return "Imóvel Usado: \nEndereço: " + super.getEndereço() + "\nPreço: R$" + super.getPreço() + "\nDesconto: R$ " + this.getDesconto() + "\nPreço final: R$" + (super.getPreço() - this.getDesconto()) + "\n\n" ;
	}

}

package Quest�o8;

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
		return "Im�vel Usado: \nEndere�o: " + super.getEndere�o() + "\nPre�o: R$" + super.getPre�o() + "\nDesconto: R$ " + this.getDesconto() + "\nPre�o final: R$" + (super.getPre�o() - this.getDesconto()) + "\n\n" ;
	}

}

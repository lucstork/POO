package Quest�o8;

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
		return "Im�vel Novo: \nEndere�o: " + super.getEndere�o() + "\nPre�o: R$" + super.getPre�o() + "\nAdicional: R$ " + this.getAdicional() + "\nPre�o final: R$" + (super.getPre�o() + this.getAdicional()) + "\n\n" ;
	}

}

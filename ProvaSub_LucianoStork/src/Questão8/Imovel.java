package Quest�o8;

public class Imovel {
	private String endere�o;
	private double pre�o;

	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public String imprimeDados() {
		return "Endere�o: " + getEndere�o() + "\nPre�o: R$" + getPre�o() + "\n\n";
	}
	
	public void setAdicional(double i) {}
	public void setDesconto(double i) {};

}

package Atv04;

public abstract class Moto extends Veiculo{
	private Integer cilindrada;

	public Integer getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	public abstract String todosDados();

}

package Atv04;

public abstract class Carro extends Veiculo {
	private long chassi;

	public long getChassi() {
		return chassi;
	}
	public void setChassi(long chassi) {
		this.chassi = chassi;
	}

	public abstract String todosDados();
}

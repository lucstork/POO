package Questao06_ListaRone;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {
	private long chassi;

	public long getChassi() {
		return chassi;
	}

	public void setChassi(long chassi) {
		this.chassi = chassi;
	}

	@Override
	public void insereDados() {
		super.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do carro: "));
		super.setCor(JOptionPane.showInputDialog(null, "Digite a cor do carro: "));
		String chassi = (JOptionPane.showInputDialog(null, "Digite o chassi do veículo: "));
		this.setChassi(Long.parseLong(chassi));
	}

	@Override
	public String todosDados() {
		String dados = "Veiculo: Carro.";
		dados += "\nPlaca: " + super.getPlaca();
		dados += "\nCor: " + super.getCor();
		dados += "\nChassi: " + this.getChassi();
		return dados;
	}
}

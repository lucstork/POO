package Questao06_ListaRone;

import javax.swing.JOptionPane;

public class Moto extends Veiculo{
	private Integer cilindrada;

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void insereDados() {
		super.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa da moto: "));
		super.setCor(JOptionPane.showInputDialog(null, "Digite a cor da moto: "));
		String cilindrada = (JOptionPane.showInputDialog(null, "Digite a cilindrada da moto "));
		this.setCilindrada(Integer.parseInt(cilindrada));
	}
	
	@Override
	public String todosDados() {
		String dados = "Veiculo: Moto.";
		dados += "\nPlaca: " + super.getPlaca();
		dados += "\nCor: " + super.getCor();
		dados += "\nCilindrada: " + this.getCilindrada();
		return dados;
	}
	
}

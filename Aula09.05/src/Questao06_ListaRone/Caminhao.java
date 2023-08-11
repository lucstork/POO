package Questao06_ListaRone;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{
	private Integer num_eixos;
	private double carga;
	
	public Integer getNum_eixos() {
		return num_eixos;
	}
	public void setNum_eixos(Integer num_eixos) {
		this.num_eixos = num_eixos;
	}
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	@Override
	public void insereDados() {
		super.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do caminhão: "));
		super.setCor(JOptionPane.showInputDialog(null, "Digite a cor do caminhão: "));
		String numEixos = (JOptionPane.showInputDialog(null, "Digite o número de eixos do caminhão: "));
		this.setNum_eixos(Integer.parseInt(numEixos));
		String cargaS = (JOptionPane.showInputDialog(null, "Digite a carga do caminhão: "));
		this.setCarga(Double.parseDouble(cargaS));
	}
	
	@Override
	public String todosDados() {
		String dados = "Veiculo: Caminhão.";
		dados += "\nPlaca: " + super.getPlaca();
		dados += "\nCor: " + super.getCor();
		dados += "\nNúmero de eixos: " + this.getNum_eixos();
		dados += "\nCarga: " + this.getCarga();
		return dados;
	}
	
}

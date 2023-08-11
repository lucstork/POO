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
		super.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do caminh�o: "));
		super.setCor(JOptionPane.showInputDialog(null, "Digite a cor do caminh�o: "));
		String numEixos = (JOptionPane.showInputDialog(null, "Digite o n�mero de eixos do caminh�o: "));
		this.setNum_eixos(Integer.parseInt(numEixos));
		String cargaS = (JOptionPane.showInputDialog(null, "Digite a carga do caminh�o: "));
		this.setCarga(Double.parseDouble(cargaS));
	}
	
	@Override
	public String todosDados() {
		String dados = "Veiculo: Caminh�o.";
		dados += "\nPlaca: " + super.getPlaca();
		dados += "\nCor: " + super.getCor();
		dados += "\nN�mero de eixos: " + this.getNum_eixos();
		dados += "\nCarga: " + this.getCarga();
		return dados;
	}
	
}

package Atv04;

public class CadastraCaminhao extends Caminhao{
	public String todosDados(){
		return "Veículo: Caminhão" + "\nPlaca: " + getPlaca() + "\nCor: " + getCor() + "\nChassi: " + getNum_eixos() +  "\nCarga: " + getCarga() + "\n";
	}
}
package Atv04;

public class CadastraCarro extends Carro{
	public String todosDados(){
		return "Veículo: Carro" + "\nPlaca: " + getPlaca() + "\nCor: "+ getCor() + "\nChassi: " + getChassi() + "\n";
	}
}
package Atv04;

public class CadastraCarro extends Carro{
	public String todosDados(){
		return "Ve�culo: Carro" + "\nPlaca: " + getPlaca() + "\nCor: "+ getCor() + "\nChassi: " + getChassi() + "\n";
	}
}
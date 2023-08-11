package Atv04;

public class CadastraMoto extends Moto{
	public String todosDados(){
		return "Veículo: Moto" + "\nPlaca: " + getPlaca() + "\nCor: "+ getCor() + "\nCilindradas: " + getCilindrada() + "\n";
	}
}
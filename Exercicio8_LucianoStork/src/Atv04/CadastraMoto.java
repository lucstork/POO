package Atv04;

public class CadastraMoto extends Moto{
	public String todosDados(){
		return "Ve�culo: Moto" + "\nPlaca: " + getPlaca() + "\nCor: "+ getCor() + "\nCilindradas: " + getCilindrada() + "\n";
	}
}
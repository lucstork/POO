package Atv04;

public class CadastraCaminhao extends Caminhao{
	public String todosDados(){
		return "Ve�culo: Caminh�o" + "\nPlaca: " + getPlaca() + "\nCor: " + getCor() + "\nChassi: " + getNum_eixos() +  "\nCarga: " + getCarga() + "\n";
	}
}
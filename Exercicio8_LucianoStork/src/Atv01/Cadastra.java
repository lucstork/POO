package Atv01;

public class Cadastra extends Ret�ngulo{
		public String area(){
			double calculaArea = getAltura()*getLargura();
			return "�rea: " + String.valueOf(calculaArea);
		}
}

package Atv01;

public class Cadastra extends Retângulo{
		public String area(){
			double calculaArea = getAltura()*getLargura();
			return "Área: " + String.valueOf(calculaArea);
		}
}

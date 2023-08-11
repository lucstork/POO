package Atv03;

public class Cadastra extends Veículo{
	public String todosDados(){
		return "Nome: " + getNome() + "; Ano de Fabricação: "+ getAnoFabricaçao();
	}
}

package Arquivos;

public class CadastraMes extends Mes{
	public String todosDados(){
		return "M�s: " + getNome() + "\nData de In�cio: " + getDataInicio() + "\nData de Fechamento: "+ getDataFechamento() + "\nSaldo Inicial: R$" + getSaldoInicial() + "\nGastos: R$" + getGastos() + "\nSaldo Restante: R$" + (getSaldoInicial()-getGastos()) + "\n\n";
	}
}
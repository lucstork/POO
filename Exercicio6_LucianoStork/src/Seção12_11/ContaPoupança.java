package Se��o12_11;

public class ContaPoupan�a extends Conta{
	@Override
	public String recuperaDadosParaImpressao() {
		String dados = "\nIdentificador: " + this.getIdentificador();
		dados +="\nTipo de Conta: Conta Poupan�a";
		dados +="\nTitular: " + this.getTitular();
		dados += "\nN�mero da Conta: " + this.getNumero();
		dados += "\nAg�ncia: " + this.getAgencia();
		dados += "\nSaldo atual: R$" + this.getSaldo();
		return dados;
	}

	@Override
	public void saca (double valor) {
		super.setSaldo(getSaldo() - (valor));
	}

}

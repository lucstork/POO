package Seção9_7;

public class ContaCorrente extends Conta {
	
	
	@Override
	public String recuperaDadosParaImpressao() {
		String dados = "\nIdentificador: " + this.getIdentificador();
		dados +="\nTipo de Conta: Conta Corrente";
		dados +="\nTitular: " + this.getTitular();
		dados += "\nNúmero da Conta: " + this.getNumero();
		dados += "\nAgência: " + this.getAgencia();
		dados += "\nSaldo atual: R$" + this.getSaldo();
		return dados;
	}
	
	@Override
	public void saca (double valor) {
		super.setSaldo(getSaldo() - (valor + 0.10));
	}

}

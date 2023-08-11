package Seção12_11;

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
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo.");
		} else 
			super.setSaldo(getSaldo() - (valor + 0.10));
	}

}

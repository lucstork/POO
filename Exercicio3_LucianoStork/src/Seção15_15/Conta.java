package Seção15_15;

import javax.swing.JOptionPane;

class Conta {
	String titular;
	String agencia;
	int numero;
	double saldo;
	Data dataDeAbertura;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void insereDados () {
		this.titular = JOptionPane.showInputDialog(null, "Por favor, digite o nome do titular: ");
		this.agencia = JOptionPane.showInputDialog(null, "Agora, informe a agência: ");
		String numeroConta = JOptionPane.showInputDialog(null, "Agora, informe o número da conta: ");
		this.numero = Integer.parseInt(numeroConta); // Conversão;
		String saldoConta = JOptionPane.showInputDialog(null, "Informe o saldo da conta: ");
		this.saldo = Double.valueOf(saldoConta).doubleValue(); // Conversão;
		this.dataDeAbertura = new Data();
		String diaAbertura = JOptionPane.showInputDialog(null, "Informe o dia de abertura da conta: ");
		String mesAbertura = JOptionPane.showInputDialog(null, "Informe o mês de abertura da conta: ");
		String anoAbertura = JOptionPane.showInputDialog(null, "Informe o ano de abertura da conta: ");
		this.dataDeAbertura.preencheData(diaAbertura, mesAbertura, anoAbertura);
	}

	void saca (double valor) {
		this.saldo -= valor;
	}

	void deposita (double valor) {
		this.saldo += valor;
	}

	double calculaRendimento() {
		return this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nAgência: " + this.agencia;
		dados += "\nNúmero da Conta: " + this.numero;
		dados += "\nSaldo atual: R$" + this.saldo;
		dados += "\nData de abertura: " + this.dataDeAbertura.formataData();
		return dados;
	}
}
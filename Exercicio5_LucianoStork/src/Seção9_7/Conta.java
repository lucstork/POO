package Seção9_7;

import javax.swing.JOptionPane;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;

	private int identificador;
	private static int proximoIdentificador;

	public Conta() {}
	public Conta(String titular) {
		this.titular = titular;
		this.identificador = proximoIdentificador++;
	}
	public int getIdentificador() {
		return this.identificador;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saca (double valor) {
		this.saldo -= valor;
	}

	public void deposita (double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public void insereDados() {
		this.setTitular(JOptionPane.showInputDialog(null,"Digite o nome do titular: "));
		String num = (JOptionPane.showInputDialog(null, "Digite o número da conta: "));
		this.setNumero(Integer.parseInt(num));
		this.setAgencia(JOptionPane.showInputDialog(null,"Digite a agência: "));
		String saldo = (JOptionPane.showInputDialog(null,"Digite o saldo: "));
		this.setSaldo(Double.valueOf(saldo).doubleValue());
	}


	public String recuperaDadosParaImpressao() {
		String dados = "\nIdentificador: " + this.getIdentificador();
		dados +="\nTitular: " + this.getTitular();
		dados += "\nNúmero da Conta: " + this.getNumero();
		dados += "\nAgência: " + this.getAgencia();
		dados += "\nSaldo atual: R$" + this.getSaldo();
		return dados;
	}

}

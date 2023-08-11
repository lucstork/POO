package Seção5_8;

class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;

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

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
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

	public String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.getTitular();
		dados+="\nIdentificador: " + this.getIdentificador();
		dados += "\nAgência: " + this.getAgencia();
		dados += "\nNúmero da Conta: " + this.getNumero();
		dados += "\nSaldo atual: R$" + this.getSaldo();
		dados += "\nData de abertura: " + getDataDeAbertura().formataData();
		return dados;
	}
}

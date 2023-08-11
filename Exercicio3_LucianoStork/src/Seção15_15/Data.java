package Seção15_15;

class Data {
	int dia;
	int mes;
	int ano;

	void preencheData (String dia, String mes, String ano) {
		this.dia = Integer.parseInt(dia);
		this.mes = Integer.parseInt(mes);
		this.ano = Integer.parseInt(ano);
	}

	String formataData() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}           
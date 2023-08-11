package Seção5_8;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1= new Conta("Luciano");
		c1.setAgencia("0970");
		c1.setNumero(20849);
		c1.setSaldo(150);
		c1.setDataDeAbertura(new Data (25,07,2001));
		System.out.println(c1.recuperaDadosParaImpressao());

		Conta c2= new Conta("Stork");
		c2.setAgencia("0790");
		c2.setNumero(94802);
		c2.setSaldo(100);
		c2.setDataDeAbertura(new Data (07,12,1892));
		System.out.println(c2.recuperaDadosParaImpressao());
		
		Conta c3= new Conta("Fred");
		c3.setAgencia("0990");
		c3.setNumero(99992);
		c3.setSaldo(100000);
		c3.setDataDeAbertura(new Data (14,2,1892));
		System.out.println(c3.recuperaDadosParaImpressao());
	}

}
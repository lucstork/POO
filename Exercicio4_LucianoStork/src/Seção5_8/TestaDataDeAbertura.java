package Seção5_8;

public class TestaDataDeAbertura {
	public static void main(String[] args) {
		Conta c1= new Conta("Luciano Stork");
		c1.setAgencia("0880");
		c1.setNumero(20405); 
		c1.deposita(500);
		c1.deposita(100);
		c1.setDataDeAbertura(new Data(8,7,2010)); 
		System.out.println(c1.recuperaDadosParaImpressao());
		
		Conta c2= new Conta("Fábio");
		c2.setAgencia("0110");
		c2.setNumero(101001);
		c2.setSaldo(590);
		c2.setDataDeAbertura(new Data (12,12,2012));
		System.out.println(c2.recuperaDadosParaImpressao());
		
		Conta c3= new Conta("Fred");
		c3.setAgencia("0990");
		c3.setNumero(99992);
		c3.setSaldo(100000);
		c3.setDataDeAbertura(new Data (14,2,1892));
		System.out.println(c3.recuperaDadosParaImpressao());
		
	}
}


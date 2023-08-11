package Seção12_11;

import javax.swing.JOptionPane;

public class TestaContas {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.saca(-10);
		//c1.deposita(-5);// Aqui, temos o desconto adicional de R$00,10.
		JOptionPane.showMessageDialog(null, c1.recuperaDadosParaImpressao());
	}

}

package Seção9_7;

import javax.swing.JOptionPane;

public class TestaContas {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.insereDados();
		c1.saca(150); // Aqui, temos o desconto adicional de R$00,10.
		JOptionPane.showMessageDialog(null, c1.recuperaDadosParaImpressao());

		Conta c2 = new ContaPoupança();
		c2.insereDados();
		c2.saca(150); //Aqui, temos somente o desconto do saque propriamente dito.
		JOptionPane.showMessageDialog(null, c2.recuperaDadosParaImpressao());

	}

}

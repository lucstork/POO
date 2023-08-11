package Se��o4_12;
import javax.swing.JOptionPane;

public class TestaConta {

	public static void main(String[] args) {

		Conta c1 = new Conta(); // Bloco de Cadastro de Titular;
		
		c1.insereDados();
		
		JOptionPane.showMessageDialog(null, "Conferindo..." + c1.recuperaDadosParaImpressao()); // Confirma��o  dos Dados (Iniciais);

		// In�cio - Bloco de Opera��es na Conta;
		
		String valorSacar = JOptionPane.showInputDialog(null, "Deseja fazer algum saque?\nCaso queira, digite o valor:  "); // Bloco Saque;
		int saque = Integer.parseInt(valorSacar);
		c1.saca(saque);
		
		String valorDepositar = JOptionPane.showInputDialog(null, "Deseja fazer algum dep�sito?\nCaso queira, digite o valor:  "); // Bloco Dep�sito;
		int deposito = Integer.parseInt(valorDepositar);
		c1.deposita(deposito);
		
		c1.calculaRendimento();
		
		JOptionPane.showMessageDialog(null, "Feitas as devidas altera��es...\nSaldo atual: R$" +c1.saldo + "\n" + c1.titular +", com R$" + c1.saldo + ", seu rendimento mensal � de R$" + c1.calculaRendimento()); // Apresenta��o dos Dados Processados;
	}
}

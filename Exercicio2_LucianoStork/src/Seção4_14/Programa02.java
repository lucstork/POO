package Se��o4_14;

import javax.swing.JOptionPane;

public class Programa02 {
	
	public static void main(String[] args) {
		int dec = 0;
		
			Porta p1 = new Porta(); // Criando a porta pela primeira vez;

			p1.inserirDadosPorta(); // Inserindo seus dados originais;

			p1.mostra(); // Mostra os dados originais;
			
			do {

			p1.comando(); // Comandos iniciais (primeira rodagem;

			p1.mostra();

			String decisao = JOptionPane.showInputDialog(null, "Deseja fazer alguma outra altera��o?\n(1) - Sim.\n(2) - N�o.");
			dec = Integer.parseInt(decisao);
		} while (dec == 1);
		JOptionPane.showMessageDialog(null, "Programa finalizado pelo usu�rio!");

	}
}
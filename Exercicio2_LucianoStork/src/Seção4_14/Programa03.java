package Se��o4_14;

import javax.swing.JOptionPane;


public class Programa03 {
	public static void main(String[] args) {
		int dec = 0;

		Casa casa = new Casa();
		casa.inserirDadosCasa();
		casa.mostra();
		
		do {
			casa.comando(); 

			casa.mostra();

			String decisao = JOptionPane.showInputDialog(null, "Deseja fazer alguma outra altera��o?\n(1) - Sim.\n(2) - N�o.");
			dec = Integer.parseInt(decisao);
		} while (dec == 1);
		JOptionPane.showMessageDialog(null, "Programa finalizado pelo usu�rio!");
	}
}
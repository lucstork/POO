package Se��o4_14;

import javax.swing.JOptionPane;
public class Programa01 {
	public static void main(String[] args) {
		String aniversario;
		int idInicial, aniver, idFinal = 0;

		Pessoa dadosPessoa;
		dadosPessoa = new Pessoa();
		dadosPessoa.nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		dadosPessoa.idadeInicial = JOptionPane.showInputDialog(null, "Digite sua idade: ");
		idInicial = Integer.parseInt(dadosPessoa.idadeInicial); // Convers�o para soma de anivers�rios;
		aniversario = JOptionPane.showInputDialog(null, "Digite a quantidade de anivers�rio(s) desejada: ");
		aniver = Integer.parseInt(aniversario); // Convers�o para soma com a idadeInicial; 

		for (int i = 0; i <= aniver; i++) {
			idFinal = idInicial + i;
		}

		JOptionPane.showMessageDialog(null, dadosPessoa.nome + ", voc� tem " + dadosPessoa.idadeInicial + " anos! \n" + "No entanto, depois de " + aniver + " anivers�rio(s), voc� ter� " + idFinal  + " anos!");
	}
}

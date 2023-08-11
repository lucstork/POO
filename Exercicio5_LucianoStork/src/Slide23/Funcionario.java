package Slide23;

import javax.swing.JOptionPane;

class Funcionario extends Usuario{
	
	@Override
	public void imprimeDados() {
		String dados = "\nNome: " + super.getNome();
		dados += "\nSenha: " + super.getSenha();
		JOptionPane.showMessageDialog(null, "Funcionário:" + dados);
	}
	
	public void vendaDeProdutos() {
		 JOptionPane.showMessageDialog(null,super.getNome() + " vendeu um produto! Esse funcionário é digno de algum elogio à altura.");
	}
}

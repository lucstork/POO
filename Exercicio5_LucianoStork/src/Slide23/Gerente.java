package Slide23;

import javax.swing.JOptionPane;

class Gerente extends Funcionario{
	
	@Override
	public void imprimeDados() {
		String dados = "\nNome: " + super.getNome();
		dados += "\nSenha: " + super.getSenha();
		JOptionPane.showMessageDialog(null, "Gerente:" + dados);
	}
	
	@Override
	public void vendaDeProdutos() {
		JOptionPane.showMessageDialog(null, "Produto vendido! O gerente " + super.getNome() + " merece ganhar comissão.");
	}
	
	public void fechamentoDoCaixa() {
		JOptionPane.showMessageDialog(null, "Caixa fechado! O gerente " + super.getNome() + " cumpriu seu papel.");
	}
}

package Slide23;

import javax.swing.JOptionPane;

class Cliente extends  Usuario {
	private String email;
	private String enderešo;
	private String telefone;
	private String cpf;
	
	@Override
	public void preencheDados() {
		super.setNome(JOptionPane.showInputDialog(null, "Digite o nome: "));
		super.setSenha(JOptionPane.showInputDialog(null, "Digite a senha: "));
		email = (JOptionPane.showInputDialog(null, "Digite o email: "));
		enderešo = (JOptionPane.showInputDialog(null, "Digite o enderešo: "));
		telefone = (JOptionPane.showInputDialog(null, "Digite o telefone: "));
		cpf = (JOptionPane.showInputDialog(null, "Digite o CPF: "));
	}
	@Override
	public void imprimeDados() {
		String dados = "\nNome: " + super.getNome();
		dados += "\nSenha: " + super.getSenha();;
		dados += "\nEnderešo: " + enderešo;
		dados += "\nTelefone: " + telefone;
		dados += "\nEmail: " + email;
		dados += "\nCPF: " + cpf;
		JOptionPane.showMessageDialog(null, "Cliente:" + dados);
	}
	
}
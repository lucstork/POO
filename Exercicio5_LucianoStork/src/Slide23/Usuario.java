package Slide23;

import javax.swing.JOptionPane;

public abstract class Usuario {
	private String nome;
	private String senha;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void preencheDados() {
		setNome(JOptionPane.showInputDialog(null, "Digite o nome: "));
		setSenha(JOptionPane.showInputDialog(null, "Digite a senha: "));
	}

	public void imprimeDados() {
		String dados = "\nNome: " + getNome();
		dados += "\nSenha: " + getSenha();
		JOptionPane.showMessageDialog(null, dados);
	}

	public void vendaDeProdutos() {
	}

	public void fechamentoDoCaixa() {
	}
}


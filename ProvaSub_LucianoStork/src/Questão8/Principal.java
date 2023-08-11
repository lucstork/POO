package Questão8;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		Imovel novo = new ImovelNovo();
		Imovel usado = new ImovelUsado();
		
		novo.setEndereço("Rua de Cima, Centro; nº50");
		novo.setPreço(200000);
		novo.setAdicional(50000);
		
		usado.setEndereço("Rua de Baixo, Centro; nº125");
		usado.setPreço(200000);
		usado.setDesconto(50000);
	
	JOptionPane.showMessageDialog(null, novo.imprimeDados() + usado.imprimeDados());
	
	}
}

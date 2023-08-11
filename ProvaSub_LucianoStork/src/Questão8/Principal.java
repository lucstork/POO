package Quest�o8;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		Imovel novo = new ImovelNovo();
		Imovel usado = new ImovelUsado();
		
		novo.setEndere�o("Rua de Cima, Centro; n�50");
		novo.setPre�o(200000);
		novo.setAdicional(50000);
		
		usado.setEndere�o("Rua de Baixo, Centro; n�125");
		usado.setPre�o(200000);
		usado.setDesconto(50000);
	
	JOptionPane.showMessageDialog(null, novo.imprimeDados() + usado.imprimeDados());
	
	}
}

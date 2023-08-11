package Seção4_14;

import javax.swing.JOptionPane;

public class Porta{
	
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	void abre(){
		aberta = true;
		JOptionPane.showMessageDialog(null, "Abrindo a porta...");
	}
	
	void fecha(){
		aberta = false;
		JOptionPane.showMessageDialog(null, "Fechando a porta...");
	}
	
	void pinta(String s){
		this.cor = s;
	}
	
	void estaAberta(){
		if(aberta == true){
			JOptionPane.showMessageDialog(null, "A porta está aberta!");
		}else {
			JOptionPane.showMessageDialog(null, "A porta está fechada!");
		}
	}
	
	void mostra(){
		JOptionPane.showMessageDialog(null,"A cor da porta é: "+this.cor + "\nA dimensão X é: "+this.dimensaoX + "\nA dimensão Y é: "+this.dimensaoY + "\nA dimensão Z é: "+this.dimensaoZ);
	}
	
	String inserirDadosPorta() {
		this.cor = JOptionPane.showInputDialog(null, "Qual a cor da porta?");
		
		String dimX = JOptionPane.showInputDialog(null, "Qual o tamanho em X da porta?");
		this.dimensaoX = Double.valueOf(dimX).doubleValue();
		
		String dimY = JOptionPane.showInputDialog(null, "Qual o tamanho em Y da porta?");
		this.dimensaoY = Double.valueOf(dimY).doubleValue();
		
		String dimZ = JOptionPane.showInputDialog(null, "Qual o tamanho em Z da porta?");
		this.dimensaoZ = Double.valueOf(dimZ).doubleValue();
		
		String dados = this.cor + this.dimensaoX + this.dimensaoY + this.dimensaoZ; 
		return dados;
	}
	
	void comando() {
		String resposta = JOptionPane.showInputDialog(null, "O que você deseja fazer?\n(1) - Abrir Porta.\n(2) - Fechar Porta.\n(3) - Checar se está aberta ou fechada.\n(4) - Alterar cor.\n(5) - Alterar dimensões. ");
		int comando = Integer.parseInt(resposta);
		
		if (comando == 1) {
			this.abre();
		} 
		if (comando == 2){
			this.fecha();
		}
		if (comando == 3) {
			this.estaAberta();
		}
		if (comando == 4) {
			String cor = JOptionPane.showInputDialog(null, "Escolha uma nova cor para a porta: ");
			this.pinta(cor);
		}
		if (comando == 5) {
			this.alteraDadosPorta();
		}
	}

	String alteraDadosPorta() {
	
		String dimX = JOptionPane.showInputDialog(null, "Qual o tamanho em X da porta?");
		this.dimensaoX = Double.valueOf(dimX).doubleValue();
		
		String dimY = JOptionPane.showInputDialog(null, "Qual o tamanho em Y da porta?");
		this.dimensaoY = Double.valueOf(dimY).doubleValue();
		
		String dimZ = JOptionPane.showInputDialog(null, "Qual o tamanho em Z da porta?");
		this.dimensaoZ = Double.valueOf(dimZ).doubleValue();
		
		String dados = this.cor + this.dimensaoX + this.dimensaoY + this.dimensaoZ; 
		return dados;
	}
}
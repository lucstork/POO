package Se��o4_14;

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
			JOptionPane.showMessageDialog(null, "A porta est� aberta!");
		}else {
			JOptionPane.showMessageDialog(null, "A porta est� fechada!");
		}
	}
	
	void mostra(){
		JOptionPane.showMessageDialog(null,"A cor da porta �: "+this.cor + "\nA dimens�o X �: "+this.dimensaoX + "\nA dimens�o Y �: "+this.dimensaoY + "\nA dimens�o Z �: "+this.dimensaoZ);
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
		String resposta = JOptionPane.showInputDialog(null, "O que voc� deseja fazer?\n(1) - Abrir Porta.\n(2) - Fechar Porta.\n(3) - Checar se est� aberta ou fechada.\n(4) - Alterar cor.\n(5) - Alterar dimens�es. ");
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
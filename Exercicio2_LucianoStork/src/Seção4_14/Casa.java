package Seção4_14;

import javax.swing.JOptionPane;

public class Casa{
	String cor;
	Porta p1 = new Porta();
	Porta p2 = new Porta();
	Porta p3 = new Porta();


	void pintaCasa(String s) {
		this.cor =s;
	}

	void abreP1(){
		p1.aberta = true;
		JOptionPane.showMessageDialog(null, "Abrindo a porta 1...");
	}

	void abreP2(){
		p2.aberta = true;
		JOptionPane.showMessageDialog(null, "Abrindo a porta 2...");
	}

	void abreP3(){
		p3.aberta = true;
		JOptionPane.showMessageDialog(null, "Abrindo a porta 3...");
	}

	void fechaP1(){
		p1.aberta = false;
		JOptionPane.showMessageDialog(null, "Fechando a porta 1...");
	}

	void fechaP2(){
		p2.aberta = false;
		JOptionPane.showMessageDialog(null, "Fechando a porta 2...");
	}

	void fechaP3(){
		p3.aberta= false;
		JOptionPane.showMessageDialog(null, "Fechando a porta 3...");
	}

	void mostra(){
		JOptionPane.showMessageDialog(null,"A cor da casa é: "+this.cor + "\nNúmero de portas abertas: "+this.quantasPortasEstaoAbertas());
	}

	String inserirDadosCasa() {
		this.cor = JOptionPane.showInputDialog(null, "Qual a cor da Casa?");
		String dados = this.cor; 
		return dados;
	}


	int quantasPortasEstaoAbertas(){
		int i = 0;
		
		if(this.p1.aberta == true){
			i += 1;
		}
		if(this.p2.aberta== true){
			i += 1;
		}
		if(this.p3.aberta== true){
			i += 1;
		}
		return i;
	}
	

	void comando() {
		String resposta = JOptionPane.showInputDialog(null, "O que você deseja fazer?\n(1) - Abrir Porta 1.\n(2) - Fechar Porta 1.\n(3) - Abrir Porta 2.\n(4) - Fechar Porta 2.\n(5) - Abrir Porta 3.\n(6) - Fechar Porta 3.\n(7) - Alterar a cor da casa. ");
		int comando = Integer.parseInt(resposta);

		if (comando == 1) {
			this.abreP1();
		} 
		if (comando == 2){
			this.fechaP1();
		}
		if (comando == 3) {
			this.abreP2();
		} 
		if (comando == 4){
			this.fechaP2();
		}
		if (comando == 5) {
			this.abreP3();
		} 
		if (comando == 6){
			this.fechaP3();
		}
		if (comando == 7) {
			String cor = JOptionPane.showInputDialog(null, "Escolha uma nova cor para a casa: ");
			this.pintaCasa(cor);
			}
		}
}


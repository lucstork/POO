package TestesProgramas;

import javax.swing.*;
public class ComFigura extends JFrame {
	Icon fig;
	JLabel lbl;
	public ComFigura(){
		getContentPane().setLayout(null);
		fig = new ImageIcon("Teste_InserindoImagem.png");
		lbl = new JLabel();
		lbl.setIcon(fig);
		lbl.setBounds(40,40,200,200);
		add(lbl);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main (String args[]){
		ComFigura aplicacao = new ComFigura();
	}
}
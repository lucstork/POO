package TestesProgramas;

import javax.swing.*;
public class Aplicativo extends JFrame{
	public Aplicativo(){
		getContentPane().setLayout(null);
		setBounds(10,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Aplicativo window = new Aplicativo();
	}
}

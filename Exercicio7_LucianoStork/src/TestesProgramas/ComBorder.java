package TestesProgramas;

import java.awt.*;
import javax.swing.*;
public class ComBorder extends JFrame{
	JTextField jtfNome,jtfTelefone;
	JButton jtfOk;
	public ComBorder(){
		getContentPane().setLayout(new BorderLayout());
		jtfNome = new JTextField(10);
		add(jtfNome,BorderLayout.SOUTH);
		jtfTelefone = new JTextField(15);
		add(jtfTelefone,BorderLayout.NORTH);
		jtfOk = new JButton("Botão OK");
		add(jtfOk,BorderLayout.LINE_END);
		setVisible(true);
		setSize(300,300);
	}
	public static void main(String args[]){
		new ComBorder();
	}
}
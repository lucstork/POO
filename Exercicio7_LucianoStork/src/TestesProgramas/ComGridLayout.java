package TestesProgramas;

import java.awt.*;
import javax.swing.*;
public class ComGridLayout extends JFrame{
	JTextField jtfNome,jtfTelefone;
	JButton jtfOk;
	public ComGridLayout (){
		getContentPane().setLayout(new GridLayout(0,2,30,30));
		jtfNome = new JTextField(10);
		add(jtfNome);
		jtfTelefone = new JTextField(15);
		add(jtfTelefone);
		jtfOk = new JButton("Bot�o OK");
		add(jtfOk);
		setVisible(true);
		setSize(300,300);
	}
	public static void main(String args[]){
		new ComGridLayout();
	}
}
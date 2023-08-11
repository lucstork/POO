package TestesProgramas;

import java.awt.*;
import javax.swing.*;
public class TesteLayout extends JFrame{
	JTextField jtfNome,jtfTelefone;
	JButton jtfOk;
	public TesteLayout(){
		getContentPane().setLayout(new FlowLayout());
		jtfNome = new JTextField(10);
		add(jtfNome);
		jtfTelefone = new JTextField(15);
		add(jtfTelefone);
		jtfOk = new JButton("Botão OK");
		add(jtfOk);
		setVisible(true);
		setSize(300,300);
	}
	public static void main(String args[]){
		new TesteLayout();
	}
}
package TestesProgramas;

import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class ComEvento extends JFrame{
	JButton botao;
	JTextField caixatexto;
	public ComEvento(){
		getContentPane().setLayout(null);
		Handler objetolistener = new Handler();
		caixatexto = new JTextField();
		caixatexto.setText("Texto de dentro");
		caixatexto.setBounds(10,10,150,30);
		add(caixatexto);
		botao = new JButton();
		botao.setText("OK");
		botao.addActionListener(objetolistener);
		botao.setBounds(45,50,70,30);
		add(botao);
		setSize(200,130);
		setVisible(true);
	}
	public static void main(String args[]){
		ComEvento janela = new ComEvento();
	}
	public class Handler implements ActionListener{
		public void actionPerformed (ActionEvent event){
			if (event.getSource() == botao)
				JOptionPane.showMessageDialog(null,caixatexto.getText());
		}
	}
}
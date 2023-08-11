package TestesProgramas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PrincipalCor extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton jbtSair, jbtOutra;
	private String cor = "Default";
	MudaCor tela = new MudaCor(this);
	public PrincipalCor(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();
		jbtOutra = new JButton("Outra");
		jbtOutra.setBounds(10,10,100,30);
		jbtOutra.addActionListener(obj);
		add(jbtOutra);
		jbtSair = new JButton("Sair");
		jbtSair.setBounds(130,10,100,30);
		jbtSair.addActionListener(obj);
		add(jbtSair);
		setBounds(10,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jbtSair)
				System.exit(0);
			if(e.getSource()==jbtOutra)
				tela.setVisible(true);
		}
	}
	public void mudaCor(String color){
		cor = color;
		if(color.equals("Azul"))
			getContentPane().setBackground(Color.BLUE);
		if(color.equals("Amarelo"))
			getContentPane().setBackground(Color.YELLOW);
	}
	public String getCor(){
		return cor;
	}
	public void showPrincipal(){
		tela.setVisible(false);
	}
	public static void main(String[] args) {
		new PrincipalCor();
	}
}
package Atv02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class TelaPrincipal extends JFrame {
	JButton jbtCadastrar, jbtExibe;
	Vector <Mes> mes = new Vector<Mes>();
	DadosMes dm = new DadosMes(this); 
	public TelaPrincipal(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();

		jbtCadastrar = new JButton("Cadastrar");
		jbtCadastrar.setBounds(65,80,150,30);
		jbtCadastrar.addActionListener(obj);
		add(jbtCadastrar);
		
		
		jbtExibe = new JButton("Exibir");
		jbtExibe.setBounds(65,120,150,30);
		jbtExibe.addActionListener(obj);
		add(jbtExibe);

		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cadastra(Mes m){
		mes.add(m);
	}
	public void showPrincipal(){
		dm.setVisible(false);
	}
	
	public void showCadastraMes(){
		dm.setVisible(true);
	}
	
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jbtCadastrar){
				showCadastraMes();
			}
			
			if(e.getSource()==jbtExibe){
				new Exibe(mes);
			}
		}
	}
	public static void main(String[] args) {
		new TelaPrincipal();

	}
}
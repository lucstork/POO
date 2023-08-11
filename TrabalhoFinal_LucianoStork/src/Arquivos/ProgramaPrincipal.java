package Arquivos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Vector;

import javax.swing.*;

public class ProgramaPrincipal extends JFrame {
	JButton jbtCadastra, jbtExibe;
	Vector <Mes> meses = new Vector<Mes>();
	DadosMes dm = new DadosMes(this);
	public ProgramaPrincipal(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();

		jbtCadastra = new JButton("Cadastra Mês");
		jbtCadastra.setBounds(65,65,150,30);
		jbtCadastra.addActionListener(obj);
		add(jbtCadastra);
		
		jbtExibe = new JButton("Exibir");
		jbtExibe.setBounds(65,125,150,30);
		jbtExibe.addActionListener(obj);
		add(jbtExibe);
		
		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void cadastra(Mes m){
		meses.add(m);
	}
	
	public void showPrincipal(){
		dm.setVisible(false);
	}
	
	public void showCadastraMes(){
		dm.setVisible(true);
	}
	
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jbtCadastra){
				showCadastraMes();
			}
			
			
			if(e.getSource()==jbtExibe){
				new Exibe(meses);
			}
		}
	}
	public static void main(String[] args) {
		new ProgramaPrincipal();
	}
}
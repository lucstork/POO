package Atv03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class TelaPrincipal extends JFrame {
	JButton jbtCadastra, jbtExibe;
	Vector <Veículo> veiculos = new Vector<Veículo>();
	CadastraVeiculo tp = new CadastraVeiculo(this);
	public TelaPrincipal(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();

		jbtCadastra = new JButton("Inserir dados");
		jbtCadastra.setBounds(65,55,150,30);
		jbtCadastra.addActionListener(obj);
		add(jbtCadastra);

		jbtExibe = new JButton("Exibir");
		jbtExibe.setBounds(65,105,150,30);
		jbtExibe.addActionListener(obj);
		add(jbtExibe);

		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cadastra(Veículo v){
		veiculos.add(v);
	}
	public void showPrincipal(){
		tp.setVisible(false);
	}
	
	public void showCadastra(){
		tp.setVisible(true);
		
	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jbtCadastra){
				showCadastra();
			}
			
			if(e.getSource()==jbtExibe){
				new Exibe(veiculos);
			}
		}
	}
	public static void main(String[] args) {
		new TelaPrincipal();

	}
}
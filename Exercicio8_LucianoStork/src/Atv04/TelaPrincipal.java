package Atv04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class TelaPrincipal extends JFrame {
	JButton jbtCarro, jbtMoto, jbtCaminhao, jbtExibe;
	Vector <Veiculo> veiculos = new Vector<Veiculo>();
	DadosCarro ca = new DadosCarro(this);
	DadosMoto cm = new DadosMoto(this);
	DadosCaminhao cc = new DadosCaminhao(this);
	public TelaPrincipal(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();

		jbtCarro = new JButton("Carro");
		jbtCarro.setBounds(65,10,150,30);
		jbtCarro.addActionListener(obj);
		add(jbtCarro);
		
		jbtMoto = new JButton("Moto");
		jbtMoto.setBounds(65,60,150,30);
		jbtMoto.addActionListener(obj);
		add(jbtMoto);
		
		jbtCaminhao = new JButton("Caminhão");
		jbtCaminhao.setBounds(65,110,150,30);
		jbtCaminhao.addActionListener(obj);
		add(jbtCaminhao);

		jbtExibe = new JButton("Exibir");
		jbtExibe.setBounds(65,160,150,30);
		jbtExibe.addActionListener(obj);
		add(jbtExibe);

		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cadastra(Veiculo v){
		veiculos.add(v);
	}
	public void showPrincipal(){
		ca.setVisible(false);
		cm.setVisible(false);
		cc.setVisible(false);
	}
	
	public void showCadastraCarro(){
		ca.setVisible(true);
		cm.setVisible(false);
		cc.setVisible(false);
	}
	
	public void showCadastraMoto(){
		ca.setVisible(false);
		cm.setVisible(true);
	}
	
	public void showCadastraCaminhao(){
		ca.setVisible(false);
		cm.setVisible(false);
		cc.setVisible(true);
	}
	
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jbtCarro){
				showCadastraCarro();
			}
			
			if(e.getSource()==jbtMoto){
				showCadastraMoto();
			}
			
			if(e.getSource()==jbtCaminhao){
				showCadastraCaminhao();
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
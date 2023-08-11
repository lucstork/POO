package Atv01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class TelaPrincipal extends JFrame {
	JButton jbtCadastra, jbtExibe;
	Vector <Retângulo> retangulos = new Vector<Retângulo>();
	CadastraRetângulo tp = new CadastraRetângulo(this);
	public TelaPrincipal(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();

		jbtCadastra = new JButton("Inserir dados - Retângulo");
		jbtCadastra.setBounds(65,35,150,30);
		jbtCadastra.addActionListener(obj);
		add(jbtCadastra);

		jbtExibe = new JButton("Calcular área - Retângulo");
		jbtExibe.setBounds(65,155,150,30);
		jbtExibe.addActionListener(obj);
		add(jbtExibe);

		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cadastra(Retângulo r){
		retangulos.add(r);
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
				new Exibe(retangulos);
			}
		}
	}
	public static void main(String[] args) {
		new TelaPrincipal();

	}
}
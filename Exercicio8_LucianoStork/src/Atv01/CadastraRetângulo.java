package Atv01;

import javax.swing.*;
import java.awt.event.*;

public class CadastraRetângulo extends JFrame {

	JButton jbtCadastrar, jbtFechar;
	JTextField jtfAltura, jtfLargura;
	TelaPrincipal tp;
	public CadastraRetângulo(TelaPrincipal tp){
		this.tp = tp;
		getContentPane().setLayout(null);
		setTitle("Cadastra - Retângulo:");
		Handler obj = new Handler();

		jbtCadastrar = new JButton("Cadastrar");
		jbtCadastrar.setBounds(65,110,150,30);
		jbtCadastrar.addActionListener(obj);
		add(jbtCadastrar);

		jbtFechar = new JButton("Fechar");
		jbtFechar.setBounds(65,160,150,30);
		jbtFechar.addActionListener(obj);
		add(jbtFechar);

		jtfAltura = new JTextField("Digite a altura:");
		jtfAltura.setBounds(65,10,150,30);
		jtfAltura.addActionListener(obj);
		add(jtfAltura);

		jtfLargura = new JTextField("Digite a largura:");
		jtfLargura.setBounds(65,60,150,30);
		jtfLargura.addActionListener(obj);
		add(jtfLargura);

		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtCadastrar){
				Cadastra aux = new Cadastra();
				aux.setAltura(Double.parseDouble(jtfAltura.getText()));
				aux.setLargura(Double.parseDouble(jtfLargura.getText()));
				tp.cadastra(aux);
				jtfAltura.setText(" ");
				jtfLargura.setText(" ");
			}
			if(e.getSource() == jbtFechar){
				tp.showPrincipal();
			}
		}
	}
}


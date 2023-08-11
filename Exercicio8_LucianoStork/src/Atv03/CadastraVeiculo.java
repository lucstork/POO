package Atv03;

import javax.swing.*;
import java.awt.event.*;

public class CadastraVeiculo extends JFrame {
		JButton jbtCadastrar, jbtFechar;
		JTextField jtfNome, jtfAnoFab;
		TelaPrincipal tp;
		public CadastraVeiculo(TelaPrincipal tp){
			this.tp = tp;
			getContentPane().setLayout(null);
			setTitle("Cadastra - Veículo:");
			Handler obj = new Handler();

			jbtCadastrar = new JButton("Cadastrar");
			jbtCadastrar.setBounds(65,110,150,30);
			jbtCadastrar.addActionListener(obj);
			add(jbtCadastrar);

			jbtFechar = new JButton("Fechar");
			jbtFechar.setBounds(65,160,150,30);
			jbtFechar.addActionListener(obj);
			add(jbtFechar);

			jtfNome = new JTextField("Digite o nome:");
			jtfNome.setBounds(65,10,150,30);
			jtfNome.addActionListener(obj);
			add(jtfNome);

			jtfAnoFab = new JTextField("Digite o ano de fabricação:");
			jtfAnoFab.setBounds(65,60,150,30);
			jtfAnoFab.addActionListener(obj);
			add(jtfAnoFab);

			setBounds(110,10,300,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		public class Handler implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == jbtCadastrar){
					Cadastra aux = new Cadastra();
					aux.setNome(jtfNome.getText());
					aux.setAnoFabricaçao(jtfAnoFab.getText());
					tp.cadastra(aux);
					jtfNome.setText("");
					jtfAnoFab.setText("");
				}
				if(e.getSource() == jbtFechar){
					tp.showPrincipal();
				}
			}
		}
}

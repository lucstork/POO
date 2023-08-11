package Atv04;

import javax.swing.*;
import java.awt.event.*;

public class DadosCarro extends JFrame {
		JButton jbtCadastrar, jbtFechar;
		JTextField jtfPlaca, jtfCor, jtfChassi;
		TelaPrincipal tp;
		public DadosCarro(TelaPrincipal tp){
			this.tp = tp;
			getContentPane().setLayout(null);
			setTitle("Cadastra - Veículo:");
			Handler obj = new Handler();

			jbtCadastrar = new JButton("Cadastrar");
			jbtCadastrar.setBounds(65,160,150,30);
			jbtCadastrar.addActionListener(obj);
			add(jbtCadastrar);

			jbtFechar = new JButton("Fechar");
			jbtFechar.setBounds(65,210,150,30);
			jbtFechar.addActionListener(obj);
			add(jbtFechar);

			jtfPlaca = new JTextField("Digite a placa:");
			jtfPlaca.setBounds(65,10,150,30);
			jtfPlaca.addActionListener(obj);
			add(jtfPlaca);

			jtfCor = new JTextField("Digite a cor:");
			jtfCor.setBounds(65,60,150,30);
			jtfCor.addActionListener(obj);
			add(jtfCor);
			
			jtfChassi = new JTextField("Digite o chassi:");
			jtfChassi.setBounds(65,110,150,30);
			jtfChassi.addActionListener(obj);
			add(jtfChassi);

			setBounds(110,10,300,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		public class Handler implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == jbtCadastrar){
					CadastraCarro aux = new CadastraCarro();
					aux.setPlaca(jtfPlaca.getText());
					aux.setCor(jtfCor.getText());
					aux.setChassi(Long.parseLong(jtfChassi.getText()));
					tp.cadastra(aux);
					jtfPlaca.setText("");
					jtfCor.setText("");
					jtfChassi.setText("");
				}
				if(e.getSource() == jbtFechar){
					tp.showPrincipal();
				}
			}
		}
}

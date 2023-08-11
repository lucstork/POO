package Arquivos;

import javax.swing.*;
import java.awt.event.*;

public class DadosMes extends JFrame {
		JButton jbtCadastrar, jbtFechar;
		JTextField jtfNome, jtfDataInicio, jtfDataFechamento, jtfSaldoInicial, jtfGastos;
		ProgramaPrincipal pp;
		public DadosMes(ProgramaPrincipal pp){
			this.pp = pp;
			getContentPane().setLayout(null);
			setTitle("Cadastra - Mês:");
			Handler obj = new Handler();

			jtfNome = new JTextField("Digite o mês:");
			jtfNome.setBounds(65,5,150,30);
			jtfNome.addActionListener(obj);
			add(jtfNome);

			jtfDataInicio = new JTextField("Digite a data de abertura:");
			jtfDataInicio.setBounds(65,45,150,30);
			jtfDataInicio.addActionListener(obj);
			add(jtfDataInicio);
			
			jtfDataFechamento = new JTextField("Digite a data de fechamento:");
			jtfDataFechamento.setBounds(65,85,150,30);
			jtfDataFechamento.addActionListener(obj);
			add(jtfDataFechamento);
			
			jtfSaldoInicial = new JTextField("Digite o saldo inicial:");
			jtfSaldoInicial.setBounds(65,125,150,30);
			jtfSaldoInicial.addActionListener(obj);
			add(jtfSaldoInicial);
			
			jtfGastos = new JTextField("Digite o valor dos gastos:");
			jtfGastos.setBounds(65,165,150,30);
			jtfGastos.addActionListener(obj);
			add(jtfGastos);
			
			jbtCadastrar = new JButton("Cadastrar");
			jbtCadastrar.setBounds(15,205,100,30);
			jbtCadastrar.addActionListener(obj);
			add(jbtCadastrar);

			jbtFechar = new JButton("Fechar");
			jbtFechar.setBounds(165,205,100,30);
			jbtFechar.addActionListener(obj);
			add(jbtFechar);

			setBounds(110,10,300,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		public class Handler implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == jbtCadastrar){
					CadastraMes aux = new CadastraMes();
					aux.setNome(jtfNome.getText());
					aux.setDataInicio(jtfDataInicio.getText());
					aux.setDataFechamento(jtfDataFechamento.getText());
					aux.setSaldoInicial(Double.parseDouble(jtfSaldoInicial.getText()));
					aux.setGastos(Double.parseDouble(jtfGastos.getText()));
					pp.cadastra(aux);
					jtfNome.setText("");
					jtfDataInicio.setText("");
					jtfDataFechamento.setText("");
					jtfSaldoInicial.setText("");
					jtfGastos.setText("");
				}
				if(e.getSource() == jbtFechar){
					pp.showPrincipal();
				}
			}
		}
}

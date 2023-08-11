package Atv02;

import javax.swing.*;
import java.awt.event.*;

public class DadosMes extends JFrame {
	JButton jbtCadastrar, jbtFechar;
	JTextField jtfNome, jtfSalario, jtfGastos, jtfImpostos;
	TelaPrincipal tp;
	public DadosMes(TelaPrincipal tp){
		this.tp = tp;
		getContentPane().setLayout(null);
		setTitle("Cadastra - Mês:");
		Handler obj = new Handler();

		jbtCadastrar = new JButton("Cadastrar");
		jbtCadastrar.setBounds(65,165,150,30);
		jbtCadastrar.addActionListener(obj);
		add(jbtCadastrar);

		jbtFechar = new JButton("Fechar");
		jbtFechar.setBounds(65,215,150,30);
		jbtFechar.addActionListener(obj);
		add(jbtFechar);

		jtfNome = new JTextField("Digite o mês:");
		jtfNome.setBounds(65,5,150,30);
		jtfNome.addActionListener(obj);
		add(jtfNome);

		jtfSalario = new JTextField("Digite o salário:");
		jtfSalario.setBounds(65,45,150,30);
		jtfSalario.addActionListener(obj);
		add(jtfSalario);

		jtfGastos = new JTextField("Digite os gastos:");
		jtfGastos.setBounds(65,85,150,30);
		jtfGastos.addActionListener(obj);
		add(jtfGastos);
		
		jtfImpostos = new JTextField("Digite os impostos:");
		jtfImpostos.setBounds(65,125,150,30);
		jtfImpostos.addActionListener(obj);
		add(jtfImpostos);

		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtCadastrar){
				CadastraMes aux = new CadastraMes();
				aux.setNome(jtfNome.getText());
				aux.setSalario(Double.parseDouble(jtfSalario.getText()));
				aux.setGastos(Double.parseDouble(jtfGastos.getText()));
				aux.setImpostos(Double.parseDouble(jtfImpostos.getText()));
				tp.cadastra(aux);
				jtfNome.setText("");
				jtfSalario.setText("");
				jtfGastos.setText("");
				jtfImpostos.setText("");
			}
			if(e.getSource() == jbtFechar){
				tp.showPrincipal();
			}
		}
	}
}

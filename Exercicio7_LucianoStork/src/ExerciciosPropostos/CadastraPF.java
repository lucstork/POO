package ExerciciosPropostos;

import javax.swing.*;

import ExerciciosPropostos.PrincipalClientes.Handler;

import java.awt.event.*;

public class CadastraPF extends JFrame{
	JButton jbtCadastrar, jbtFechar;
	JTextField jtfCodigo, jtfCpf;
	PrincipalClientes pc;
	public CadastraPF(PrincipalClientes pc){
		this.pc = pc;
		getContentPane().setLayout(null);
		setTitle("Cadastra - Pessoa Física:");
		Handler obj = new Handler();
		
		jbtCadastrar = new JButton("Cadastrar");
		jbtCadastrar.setBounds(65,110,150,30);
		jbtCadastrar.addActionListener(obj);
		add(jbtCadastrar);
		
		jbtFechar = new JButton("Fechar");
		jbtFechar.setBounds(65,160,150,30);
		jbtFechar.addActionListener(obj);
		add(jbtFechar);
		
		jtfCodigo = new JTextField("Digite o código:");
		jtfCodigo.setBounds(65,10,150,30);
		jtfCodigo.addActionListener(obj);
		add(jtfCodigo);
		
		jtfCpf = new JTextField("Digite o CPF:");
		jtfCpf.setBounds(65,60,150,30);
		jtfCpf.addActionListener(obj);
		add(jtfCpf);
		
		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtCadastrar){
				PessoaFisica aux = new PessoaFisica();
				aux.setCodigo(Long.parseLong(jtfCodigo.getText()));
				aux.setCpf(jtfCpf.getText());
				pc.cadastra(aux);
				jtfCodigo.setText("");
				jtfCpf.setText("");
			}
			if(e.getSource() == jbtFechar){
				pc.showPrincipal();
			}
		}
	}
}
package Questao07_LucianoStork;

import javax.swing.*;
import java.awt.event.*;

public class DadosAluno extends JFrame {
		JButton jbtSalvar, jbtFechar;
		JTextField jtfNome, jtfCurso, jtfMatricula;
		TelaPrincipal tp;
		public DadosAluno(TelaPrincipal tp){
			this.tp = tp;
			getContentPane().setLayout(null);
			setTitle("Cadastra - Aluno:");
			Handler obj = new Handler();

			jbtSalvar = new JButton("Salvar");
			jbtSalvar.setBounds(65,160,150,30);
			jbtSalvar.addActionListener(obj);
			add(jbtSalvar);

			jbtFechar = new JButton("Fechar");
			jbtFechar.setBounds(65,210,150,30);
			jbtFechar.addActionListener(obj);
			add(jbtFechar);

			jtfNome = new JTextField("Digite o nome:");
			jtfNome.setBounds(65,10,150,30);
			jtfNome.addActionListener(obj);
			add(jtfNome);

			jtfCurso = new JTextField("Digite o curso:");
			jtfCurso.setBounds(65,60,150,30);
			jtfCurso.addActionListener(obj);
			add(jtfCurso);
			
			jtfMatricula = new JTextField("Digite a matricula:");
			jtfMatricula.setBounds(65,110,150,30);
			jtfMatricula.addActionListener(obj);
			add(jtfMatricula);

			setBounds(110,10,300,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		public class Handler implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == jbtSalvar){
					CadastraAluno aux = new CadastraAluno();
					aux.setNome(jtfNome.getText());
					aux.setCurso(jtfCurso.getText());
					aux.setMatricula(jtfMatricula.getText());
					tp.cadastra(aux);
					jtfNome.setText("");
					jtfCurso.setText("");
					jtfMatricula.setText("");
				}
				if(e.getSource() == jbtFechar){
					tp.showPrincipal();
				}
			}
		}
}

package Questao07_LucianoStork;

import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Exibe extends JDialog {
	JTextArea jtaDados;
	JButton jbtFechar;
	Vector<Usuario> alunos;
	public Exibe(Vector<Usuario>u){
		alunos = u;
		getContentPane().setLayout(null);
		setTitle("Exibe - Lista Alunos:");
		Handler obj = new Handler();
		jbtFechar = new JButton("Fechar");
		jbtFechar.setBounds(80,270,100,30);
		jbtFechar.addActionListener(obj);
		add(jbtFechar);
		jtaDados = new JTextArea();
		jtaDados.setBounds(10,10,250,250);
		jtaDados.setText(todosDados());
		add(jtaDados);
		setBounds(100,100,300,300);
		setVisible(true);
		setModal(true);
	}

	public String todosDados(){
		String s = "";
		for(int i=0;i< alunos.size();i++){
			s = s + alunos.get(i).todosDados();
		}
		return s;
	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtFechar){
				setVisible(false);
			}
		}
	}
}


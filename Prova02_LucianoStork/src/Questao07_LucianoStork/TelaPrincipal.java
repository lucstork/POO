package Questao07_LucianoStork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class TelaPrincipal extends JFrame {
	JButton jbtCadastra, jbtExibe;
	Vector <Usuario> alunos = new Vector<Usuario>();
	DadosAluno da = new DadosAluno(this);
	
	public TelaPrincipal(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();

		jbtCadastra = new JButton("Cadastrar Aluno");
		jbtCadastra.setBounds(65,50,150,30);
		jbtCadastra.addActionListener(obj);
		add(jbtCadastra);

		jbtExibe = new JButton("Exibir");
		jbtExibe.setBounds(65,130,150,30);
		jbtExibe.addActionListener(obj);
		add(jbtExibe);

		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cadastra(Usuario a){
		alunos.add(a);
	}
	public void showPrincipal(){
		da.setVisible(false);
	}
	
	public void showCadastraAluno(){
		da.setVisible(true);
	}
	
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jbtCadastra){
				showCadastraAluno();
			}
			
			if(e.getSource()==jbtExibe){
				new Exibe(alunos);
			}
		}
	}
	public static void main(String[] args) {
		new TelaPrincipal();

	}
}
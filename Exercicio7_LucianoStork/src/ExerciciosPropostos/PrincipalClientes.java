package ExerciciosPropostos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class PrincipalClientes extends JFrame {
	JButton jbtPF, jbtPJ, jbtExibe;
	Vector <Cliente> meusclientes = new Vector<Cliente>();
	CadastraPF pf = new CadastraPF(this);
	CadastraPJ pj = new CadastraPJ(this);
	public PrincipalClientes(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();
		
		jbtPF = new JButton("Pessoa Fisica");
		jbtPF.setBounds(65,35,150,30);
		jbtPF.addActionListener(obj);
		add(jbtPF);
		
		jbtPJ = new JButton("Pessoa Jurídica");
		jbtPJ.setBounds(65,95,150,30);
		jbtPJ.addActionListener(obj);
		add(jbtPJ);
		
		jbtExibe = new JButton("Exibe");
		jbtExibe.setBounds(65,155,150,30);
		jbtExibe.addActionListener(obj);
		add(jbtExibe);
		
		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cadastra(Cliente c){
		meusclientes.add(c);
	}
	public void showPrincipal(){
		pf.setVisible(false);
		pj.setVisible(false);
	}
	public void showCadastraPJ(){
		pf.setVisible(false);
		pj.setVisible(true);
	}
	public void showCadastraPF(){
		pf.setVisible(true);
		pj.setVisible(false);
	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jbtPF){
				showCadastraPF();
			}
			if(e.getSource()==jbtPJ){
				showCadastraPJ();
			}
			if(e.getSource()==jbtExibe){
				new ExibeDados(meusclientes);
			}
		}
	}
	public static void main(String[] args) {
		new PrincipalClientes();
	
	}
}
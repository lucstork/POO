package Atv02;

import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Exibe extends JDialog {
	JTextArea jtaDados;
	JButton jbtFechar;
	Vector<Mes> mes;
	public Exibe(Vector<Mes>m){
		mes = m;
		getContentPane().setLayout(null);
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
		for(int i=0;i< mes.size();i++){
			s = s + "\nSaldo: R$" + mes.get(i).saldo();
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


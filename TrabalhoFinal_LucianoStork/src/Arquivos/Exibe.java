package Arquivos;

import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.*;

public class Exibe extends JDialog {
	JTextArea jtaDados;
	JButton jbtFechar;
	Vector<Mes> meses;
	public Exibe(Vector<Mes>m){
		meses = m;
		getContentPane().setLayout(null);
		setTitle("Exibe - Meses");
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
		for(int i=0;i< meses.size();i++){
			s = s + meses.get(i).todosDados();
			try {
				FileOutputStream arquivo = new FileOutputStream("teste_atv10.txt");
				PrintWriter pr = new PrintWriter(arquivo);
				pr.println(s);

				pr.close();
				arquivo.close();
			}
			catch(Exception e){
				System.out.println("Erro ao escrever no arquivo.");
			}
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


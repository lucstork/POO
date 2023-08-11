package Atv04;

import javax.swing.*;
import java.awt.event.*;

public class DadosCaminhao extends JFrame {
	JButton jbtCadastrar, jbtFechar;
	JTextField jtfPlaca, jtfCor, jtfNumEixos, jtfCarga;
	TelaPrincipal tp;
	public DadosCaminhao(TelaPrincipal tp){
		this.tp = tp;
		getContentPane().setLayout(null);
		setTitle("Cadastra - Caminhão:");
		Handler obj = new Handler();

		jbtCadastrar = new JButton("Cadastrar");
		jbtCadastrar.setBounds(65,180,150,30);
		jbtCadastrar.addActionListener(obj);
		add(jbtCadastrar);

		jbtFechar = new JButton("Fechar");
		jbtFechar.setBounds(65,220,150,30);
		jbtFechar.addActionListener(obj);
		add(jbtFechar);

		jtfPlaca = new JTextField("Digite a placa:");
		jtfPlaca.setBounds(65,5,150,30);
		jtfPlaca.addActionListener(obj);
		add(jtfPlaca);

		jtfCor = new JTextField("Digite a cor:");
		jtfCor.setBounds(65,50,150,30);
		jtfCor.addActionListener(obj);
		add(jtfCor);

		jtfNumEixos = new JTextField("Digite o nº de eixos:");
		jtfNumEixos.setBounds(65,95,150,30);
		jtfNumEixos.addActionListener(obj);
		add(jtfNumEixos);
		
		jtfCarga = new JTextField("Digite a carga:");
		jtfCarga .setBounds(65,135,150,30);
		jtfCarga .addActionListener(obj);
		add(jtfCarga );

		setBounds(110,10,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtCadastrar){
				CadastraCaminhao aux = new CadastraCaminhao();
				aux.setPlaca(jtfPlaca.getText());
				aux.setCor(jtfCor.getText());
				aux.setNum_eixos(Integer.parseInt(jtfNumEixos.getText()));
				aux.setCarga(Double.parseDouble(jtfCarga.getText()));
				tp.cadastra(aux);
				jtfPlaca.setText("");
				jtfCor.setText("");
				jtfNumEixos.setText("");
				jtfCarga.setText("");
			}
			if(e.getSource() == jbtFechar){
				tp.showPrincipal();
			}
		}
	}
}

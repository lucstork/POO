package TestesProgramas;

import javax.swing.*;
import java.awt.*;
public class ContainerAplicativo extends JFrame{
	JButton botao; //variavel para um bot�o
	JTextField caixatexto; //variavel para uma caixa de texto
	public ContainerAplicativo(){
		getContentPane().setLayout(null); //configura o Container
		botao = new JButton(); // cria��o do objeto
		botao.setText("OK"); // configura��o do objeto
		botao.setBounds(60,50,80,30);
		add(botao); //adicionando o objeto ao container
		caixatexto = new JTextField(); // cria��o do objeto
		caixatexto.setText("Texto de dentro"); // configura��o do objeto
		caixatexto.setBounds(25,10,150,30);
		add(caixatexto); //adicionando o objeto ao container
		setBounds(20,20, 200,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		ContainerAplicativo janela = new ContainerAplicativo();
	}
}

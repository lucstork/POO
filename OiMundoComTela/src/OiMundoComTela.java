import javax.swing.*;
public class OiMundoComTela{
	public static void main( String args [] ){

		String resp;
		int resposta;
		JOptionPane.showMessageDialog(null, "Início do programa: ");
		do {
			String firstnumber, secondnumber; // Declaração das variáveis de entrada do usuário.
			int number1, number2, sum; // Declaração das variáveis para conversão da entrada de dados.

			firstnumber = JOptionPane.showInputDialog("Entre com o primeiro número:"); // Entrada 1.
			secondnumber = JOptionPane.showInputDialog("Entre com o segundo número:"); // Entrada 2.

			number1 = Integer.parseInt(firstnumber); // Conversão.
			number2 = Integer.parseInt(secondnumber); // Conversão.

			sum = number1 + number2; // Operação do programa.

			JOptionPane.showMessageDialog(null,"A soma entre " + number1 + " + " + number2 + " = " + sum); // Retorno do resultado da operação.
			resp = JOptionPane.showInputDialog("Deseja rodar o código novamente? Digite '1' para SIM ou '-1' para NÃO.");
			resposta = Integer.parseInt(resp);
		} while (resposta !=-1);
			JOptionPane.showMessageDialog(null,  "Programa finalizado pelo usuário! \n Obrigado pela experiência!");

		System.exit(0);
	}
};
import javax.swing.*;
public class OiMundoComTela{
	public static void main( String args [] ){

		String resp;
		int resposta;
		JOptionPane.showMessageDialog(null, "In�cio do programa: ");
		do {
			String firstnumber, secondnumber; // Declara��o das vari�veis de entrada do usu�rio.
			int number1, number2, sum; // Declara��o das vari�veis para convers�o da entrada de dados.

			firstnumber = JOptionPane.showInputDialog("Entre com o primeiro n�mero:"); // Entrada 1.
			secondnumber = JOptionPane.showInputDialog("Entre com o segundo n�mero:"); // Entrada 2.

			number1 = Integer.parseInt(firstnumber); // Convers�o.
			number2 = Integer.parseInt(secondnumber); // Convers�o.

			sum = number1 + number2; // Opera��o do programa.

			JOptionPane.showMessageDialog(null,"A soma entre " + number1 + " + " + number2 + " = " + sum); // Retorno do resultado da opera��o.
			resp = JOptionPane.showInputDialog("Deseja rodar o c�digo novamente? Digite '1' para SIM ou '-1' para N�O.");
			resposta = Integer.parseInt(resp);
		} while (resposta !=-1);
			JOptionPane.showMessageDialog(null,  "Programa finalizado pelo usu�rio! \n Obrigado pela experi�ncia!");

		System.exit(0);
	}
};
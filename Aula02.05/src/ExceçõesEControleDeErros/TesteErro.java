package ExceçõesEControleDeErros;

import javax.swing.JOptionPane;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("Início Main Program.");
		//Object x = null;
		//x.toString();
		//int i = 1/0;
		//System.out.println(i);
		try {metodo1();
		} catch(ArrayIndexOutOfBoundsException a ) {
			System.out.println("Desculpe, ocorreu um erro do tipo: " + a);
			//a.printStackTrace();
		}finally {
			System.out.println("Passei no finally.");
	
		}
		System.out.println("Fim Main Program.");
	}
	static void metodo1() {
		System.out.println("Início Método 1.");
		metodo2();
		System.out.println("Fim Método 1.");

	}
	static void metodo2() {
		System.out.println("Início Método 2.");
		int[] vet = {1,2,3,4,5};
		String valor = JOptionPane.showInputDialog(null,"Digite a quantidade desejada de valores impressos no vetor: ");
		int intVal = Integer.parseInt(valor);
		for(int i=0; i<intVal; i++) {
			System.out.println(vet[i]);
		}
		System.out.println("Fim Método 2.");
	}
}

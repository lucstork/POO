package Se��o5_9;

class Teste {
	int x = 37;
	static int y = 38;
	public static void main(String [] args) {
		// System.out.println("x = " + x); //-> Falta declarar a vari�vel "x" como static, assim como no m�todo main. 
		// Do jeito que est�, n�o h� garantia de termos um objeto do tipo Teste, por isso n�o conseguimos garantir que o "x" sequer existir� dentro do main .

		///////////////////////////////////////////////////////////

		System.out.println("y = " + y); // -> Como a vari�vel "y" foi declarada como static, o programa rodar� perfeitamente, uma vez que ele n�o � do objeto, � da classe.! 
	}
}
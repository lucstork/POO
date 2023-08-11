package Seção5_9;

class Teste {
	int x = 37;
	static int y = 38;
	public static void main(String [] args) {
		// System.out.println("x = " + x); //-> Falta declarar a variável "x" como static, assim como no método main. 
		// Do jeito que está, não há garantia de termos um objeto do tipo Teste, por isso não conseguimos garantir que o "x" sequer existirá dentro do main .

		///////////////////////////////////////////////////////////

		System.out.println("y = " + y); // -> Como a variável "y" foi declarada como static, o programa rodará perfeitamente, uma vez que ele não é do objeto, é da classe.! 
	}
}
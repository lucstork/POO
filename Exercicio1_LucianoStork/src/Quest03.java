import java.util.Scanner; 

public class Quest03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int a, b;
		System.out.printf("Questão 3 - Lista 1: \n");
		System.out.printf("Informe o primeiro valor inteiro: ");
		a = ler.nextInt(); 

		System.out.printf("Informe o segundo valor inteiro: ");
		b = ler.nextInt(); 

		if( a == b) {
			System.out.printf("\nOs valores informados são iguais! ");
		} else if( a > b) {
			System.out.printf("\nO maior é " + a + ".");
		} else {
			System.out.printf("\nO maior é " + b + ".");
		}
		ler.close();
	}
}
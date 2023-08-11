import java.util.Scanner; 

public class Quest02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		double a, b;
		System.out.printf("Questão 2 - Lista 1: \n");
		System.out.printf("Informe o primeiro número: ");
		a = ler.nextInt(); 

		System.out.printf("Informe o segundo número: ");
		b = ler.nextInt(); 

		System.out.printf("\nResultados:\n");
		System.out.printf(a + " + " + b + " = " + (a+b) + "\n");
		System.out.printf(a + " - " + b + " = " + (a-b) + "\n");
		System.out.printf(a + " / " + b + " = " + (a/b) + "\n");
		System.out.printf(a + " * " + b + " = " + (a*b) + "\n");
		ler.close();
	}

}
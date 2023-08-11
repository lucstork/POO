import java.util.Scanner; 

public class Quest10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		System.out.printf("Questão 10 - Lista 1: \n");

		int a, b, c;
		System.out.printf("Informe a: ");
		a = ler.nextInt(); 
		System.out.printf("Informe b: ");
		b = ler.nextInt();
		System.out.printf("Informe c: ");
		c = ler.nextInt();

		System.out.printf("\nConferindo:\n");
		System.out.printf("a = " + a + "\n");
		System.out.printf("b = " + b + "\n");
		System.out.printf("c = " + c + "\n");

		ler.close();

		double  x1, x2, delta;
		delta = (b*b)-(4*a*c);
		x1 = (- b + Math.sqrt(delta))/2*a; 
		x2 = (- b - Math.sqrt(delta))/2*a;

		System.out.printf("\nResultado:\n");
		System.out.printf("delta = " + delta + "\n");
		System.out.printf("x1 = " + x1 + "\n");
		System.out.printf("x2 = " + x2 + "\n");
	}
}

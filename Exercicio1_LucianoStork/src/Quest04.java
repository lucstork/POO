import java.util.Scanner; 

public class Quest04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int num, quad;
		System.out.printf("Questão 4 - Lista 1: \n");
		System.out.printf("Informe o valor limite: ");
		num = ler.nextInt(); 

		System.out.printf("\nSequência dos quadrados até o valor limite:\n");
		for (int i = 1; i <= num; i++) {
			quad = i*i;
			System.out.printf(i + " elevado ao quadrado = " + quad) ;
			System.out.printf("\n");
		}
		ler.close();
	}

}
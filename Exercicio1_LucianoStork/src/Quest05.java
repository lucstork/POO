import java.util.Scanner; 

public class Quest05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 

		int num;
		int sum = 0;

		System.out.printf("Quest�o 5 - Lista 1: \n");
		System.out.printf("Informe o valor limite para o somat�rio: ");
		num = ler.nextInt(); 

		System.out.printf("\nResultado:\n");

		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("O somat�rio de " + num + " � " + sum + ".");
		ler.close();
	}
}
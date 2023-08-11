import java.util.Scanner;
public class Quest09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Questão 9 - Lista 1: \n");
		
		float km, litros;
		int resp = 0;
		
		do{  
			System.out.printf("Informe a quilometragem percorrida: ");
			km = ler.nextInt(); 
			System.out.printf("Informe a quantidade de litros gasta: ");
			litros = ler.nextInt();

			System.out.printf("\nConferindo...\n");
			System.out.printf("Quilômetro(s) percorrido(s) = " + km + "\n");
			System.out.printf("Litro(s) de combustível gasto(s) = " + litros + "\n");

			float  consumo;
			consumo = km/litros;

			System.out.printf("--------------------------------- \n");
			System.out.printf("Resultado:\n");
			System.out.printf("O consumo do seu automóvel foi de " + consumo + " km/l. \n");
			System.out.printf("--------------------------------- \n");

			System.out.println("\nDeseja realizar uma outra consulta? \n");
			System.out.println("Caso queira, digite '1'.\n");
			System.out.println("Caso deseje encerrar o programa, digite '-1'. \n");
			resp = ler.nextInt();
			
		} while (resp != -1); 
		System.out.println("\n***********************************"); 
		System.out.println("Programa finalizado pelo usuário! "); 
		System.out.println("*********************************** \n"); 
		ler.close();
	}

}

import java.util.Scanner; 

public class Quest08 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 

		System.out.printf("Quest�o 8 - Lista 1: \n");
		
		int salario;
		float media = 0;
		float total = 0;
		int NumFuncionarios = 0;
		int sair = 0;

		do {
			NumFuncionarios++;
			System.out.printf("Informe o sal�rio ou digite '-1' para finalizar: \n");
			salario = ler.nextInt(); 
			if (salario > 0) {
				total = total + salario;
				media = total/NumFuncionarios;
			} sair = salario;
		} while (sair != -1);
		System.out.printf("\n---------------------------------------------------- \n" );
		System.out.printf("Resultado: \n" );
		System.out.printf("A m�dia de sal�rios informados � de: R$" + media);
		ler.close();
	}
}
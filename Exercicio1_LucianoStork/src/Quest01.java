import java.util.Scanner; 

public class Quest01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		int idade;

		System.out.printf("Questão 1 - Lista 1: \n");
		System.out.printf("Informe seu nome: ");
		nome = ler.nextLine();

		System.out.printf("Informe sua idade: ");
		idade = ler.nextInt(); 

		System.out.printf("-----------------------------\n");
		System.out.printf(nome + ", sua idade é: " + idade);
		ler.close();
	}

}
public class Quest06 {
	public static void main(String[] args) {
		int linhas = 6;
		int colunas = 6;

		System.out.println("Resultado: \n");
		for (int i = 0; i < colunas; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < linhas - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < colunas - 2; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		for (int i = 0; i < colunas; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
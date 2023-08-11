public class Quest07 {
	public static void main(String[] args) {

		System.out.printf("Questão 7 - Lista 1: \n \n");

		int linha = 0;
		int coluna = 6;

		for (int NumLinha = 6; NumLinha > linha; NumLinha--) {  
			for (int NumColuna = NumLinha; NumColuna <= coluna; NumColuna++) {  
				System.out.print("*");   
			}
			System.out.println("");  
		}
	}
}

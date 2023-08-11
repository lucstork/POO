package InputStream_Exemplo;

//   Leu o arquivo Completo!!!!

import java.io.*;
public class Teste {
	public static void main(String[] args)
			throws IOException {
		InputStream is = new FileInputStream("java.txt");
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}
}
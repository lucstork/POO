package BufferedWriter_Exemplo;

// Escreve no arquivo !!!

import java.io.*;
public class Teste {
	public static void main(String[] args)
			throws IOException {
		OutputStream os = new FileOutputStream("java.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("Projeto em Java de Escrita");
		bw.close();
	}
}
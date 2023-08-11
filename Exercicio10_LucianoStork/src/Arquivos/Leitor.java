package Arquivos;

import java.io.*;

public class Leitor {

	public static void main(String[] args) {
		try {
			FileInputStream arquivo = new FileInputStream("teste_atv10.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br = new BufferedReader(input); 

			String linha;

			do {
				linha = br.readLine();
				if(linha != null) {
					 String[] palavras = linha.split(";");
				
					System.out.println("---------------Nova linha-------------------");
					for(int i=0; i<palavras.length; i++) {
						System.out.println("Palavra lida = " + palavras[i]);
					}
				}
					
			} while(linha != null);
		}
		
		catch(Exception e) {
			System.out.println("Erro ao ler o arquivo.");
		}
		
		
	}

}

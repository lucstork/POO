package Arquivos;

import java.io.*;

public class Escritor {

	public static void main(String[] args) {
		try {
			FileOutputStream arquivo = new FileOutputStream("teste_atv10.txt");
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println("Linha1 Coluna1 ; Linha1 Coluna2 ; Linha1 Coluna3");
			pr.println("Linha2 Coluna1 ; Linha2 Coluna2 ; Linha2 Coluna3");
			pr.println("Linha3 Coluna1 ; Linha3 Coluna2 ; Linha3 Coluna3");
			
			pr.close();
			arquivo.close();
		}
		catch(Exception e){
			System.out.println("Erro ao escrever no arquivo.");
		}
	}

}

package Seção15_15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		
		Collection<Integer> teste1 = new ArrayList<>();
		long inicio1 = System.currentTimeMillis();
		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste1.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste1.contains(i);
		}

		long fim1 = System.currentTimeMillis();
		long tempo1 = fim1 - inicio1;
		System.out.println("Tempo gasto com o ArrayList: " + tempo1);
		
		///////////////////////////////////////////////////////////////////////
		
		Collection<Integer>	teste2	=	new	HashSet<>();
		long inicio2 = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
			teste2.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste2.contains(i);
		}
		
		long fim2 = System.currentTimeMillis();
		long tempo2 = fim2 - inicio2;
		System.out.println("Tempo gasto com o HashSet: " + tempo2);
	}
}
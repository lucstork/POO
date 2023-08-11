package Questao06_ListaRone;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,  "Liste os veículos da sua concessionária: ");
		
		Veiculo vet[] = new Veiculo[3];
		vet[0] = new Carro();
		vet[0].insereDados();
		
		vet[1] = new Moto();
		vet[1].insereDados();
		
		vet[2] = new Caminhao();
		vet[2].insereDados();
		
		JOptionPane.showMessageDialog(null,  "Acompanhe a sequência de veículos na sua concessionária: ");
		
		for(int i=0; i< vet.length; i++) {
			JOptionPane.showMessageDialog(null, vet[i].todosDados());
		}
	}

}

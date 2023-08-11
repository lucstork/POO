import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemaAcademicoUFSJ {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "In�cio - Sistema Acad�mico UFSJ:"); // Apresenta��o do programa;
		
		Aluno a = new Aluno("Luciano", "Engenharia de Telecomunica��es", 204300018); // Criou um aluno dentro da Classe.
		
		Aluno b = new Aluno();
		b.setNome("Artur");
		b.setCurso("Engenharia Mecatr�nica");
		b.setMatricula(193200007);
		
				

		ArrayList<Aluno> lista = new ArrayList <Aluno>(); // Cria��o de uma lista;
		lista.add(a); // Adicionou a;
		lista.add(b); // Adicionou b;
		for(int i=0; i<lista.size(); i++) {
			apresentaAluno(lista.get(i));
		}
	}
	
	private static void apresentaAluno(Aluno a) {
		JOptionPane.showMessageDialog(null, "Nome: " + a.getNome() + "\nCurso: " +a.getCurso() + "\nMatr�cula: " + a.getMatricula()); // Apresenta��o dos dados;
	}


}

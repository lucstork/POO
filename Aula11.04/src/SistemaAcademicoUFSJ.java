import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemaAcademicoUFSJ {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Início - Sistema Acadêmico UFSJ:"); // Apresentação do programa;
		
		Aluno a = new Aluno("Luciano", "Engenharia de Telecomunicações", 204300018); // Criou um aluno dentro da Classe.
		
		Aluno b = new Aluno();
		b.setNome("Artur");
		b.setCurso("Engenharia Mecatrônica");
		b.setMatricula(193200007);
		
				

		ArrayList<Aluno> lista = new ArrayList <Aluno>(); // Criação de uma lista;
		lista.add(a); // Adicionou a;
		lista.add(b); // Adicionou b;
		for(int i=0; i<lista.size(); i++) {
			apresentaAluno(lista.get(i));
		}
	}
	
	private static void apresentaAluno(Aluno a) {
		JOptionPane.showMessageDialog(null, "Nome: " + a.getNome() + "\nCurso: " +a.getCurso() + "\nMatrícula: " + a.getMatricula()); // Apresentação dos dados;
	}


}

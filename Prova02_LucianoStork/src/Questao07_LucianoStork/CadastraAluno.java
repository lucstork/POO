package Questao07_LucianoStork;

public class CadastraAluno extends Usuario{
	public String todosDados(){
		return "Nome: " + getNome() +  "\nCurso: " + getCurso() + "\nMatr�cula: "+ getMatricula() + "\n\n";
	}
}
package Questao07_LucianoStork;

public class CadastraAluno extends Usuario{
	public String todosDados(){
		return "Nome: " + getNome() +  "\nCurso: " + getCurso() + "\nMatrícula: "+ getMatricula() + "\n\n";
	}
}
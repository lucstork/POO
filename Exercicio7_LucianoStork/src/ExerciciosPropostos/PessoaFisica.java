package ExerciciosPropostos;

public class PessoaFisica extends Cliente{
	private String cpf;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String todosDados(){
		return "C�digo:"+getCodigo() + " CPF:" + getCpf();
	}
}


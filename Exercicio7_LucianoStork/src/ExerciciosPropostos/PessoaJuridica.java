package ExerciciosPropostos;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String todosDados(){
		return "C�digo: "+getCodigo() + " CNPJ: " +getCnpj();
	}
}

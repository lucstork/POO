package ExerciciosPropostos;

public abstract class Cliente {
	private long codigo;
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public abstract String todosDados();
}


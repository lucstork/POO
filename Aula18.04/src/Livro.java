public class Livro extends Produto { // Usar herança para automatizar as trocas de informações!!! !!!!!!NOVIDADE!!!!!! (é um).
	private String autor; //-
	private int paginas; //-

	public Livro(String nome, double preco, String autor, int paginas) {
		super(nome, preco); // Herança !!!!!!NOVIDADE!!!!!!
		this.autor = autor; // Informações exclusivas;
		this.paginas = paginas; // Informações exclusivas;
	}

	public boolean ehGrande() {
		return this.paginas > 200;
	}
}
 // A classe Produto é uma mãe da classe Livro.
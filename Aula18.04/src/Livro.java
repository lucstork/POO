public class Livro extends Produto { // Usar heran�a para automatizar as trocas de informa��es!!! !!!!!!NOVIDADE!!!!!! (� um).
	private String autor; //-
	private int paginas; //-

	public Livro(String nome, double preco, String autor, int paginas) {
		super(nome, preco); // Heran�a !!!!!!NOVIDADE!!!!!!
		this.autor = autor; // Informa��es exclusivas;
		this.paginas = paginas; // Informa��es exclusivas;
	}

	public boolean ehGrande() {
		return this.paginas > 200;
	}
}
 // A classe Produto � uma m�e da classe Livro.
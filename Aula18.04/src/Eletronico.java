public class Eletronico extends Produto{
	
	// Aqui n�o temos informa��es exclusivas;

	public Eletronico(String nome, double preco) { // construtor
		super(nome, preco);
	}

	@Override // Altera��o da classe m�e (mas altera s� aqui)!! -> Evita bugs de sobrecarga!!!
	public boolean ehCaro() {
		return (preco>1000);
	}
}

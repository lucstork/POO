public class Eletronico extends Produto{
	
	// Aqui não temos informações exclusivas;

	public Eletronico(String nome, double preco) { // construtor
		super(nome, preco);
	}

	@Override // Alteração da classe mãe (mas altera só aqui)!! -> Evita bugs de sobrecarga!!!
	public boolean ehCaro() {
		return (preco>1000);
	}
}

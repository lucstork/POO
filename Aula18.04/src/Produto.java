class Produto {
	protected String nome; //~
	protected double preco; //~


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Produto(String nome, double preco) { // construct
		this.nome = nome;
		this.preco = preco;
	}

	public boolean ehCaro() {
		if(this.preco > 100) {
			return true;
		} else {
			return false;
		}
	}
}

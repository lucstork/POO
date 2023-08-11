package Slide23;

public class ClassePrincipal {

	public static void main(String[] args) {
		Usuario c = new Cliente();
		c.preencheDados();
		
		Usuario f = new Funcionario();
		f.preencheDados();
		
		Usuario g = new Gerente();
		g.preencheDados();
		
		c.imprimeDados();
		
		f.imprimeDados();
		f.vendaDeProdutos();
		
		g.imprimeDados();
		g.vendaDeProdutos();
		g.fechamentoDoCaixa();
	}

}

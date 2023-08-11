// Herança e Polimorfismo;

import javax.swing.JOptionPane;
import java.util.Vector;

public class Loja {

	public static void main(String[] args) {
		Livro l = new Livro("Linguagem de Programação ", 150.00, "Luciano Stork", 250);
		//JOptionPane.showMessageDialog(null,l.ehCaro());
		//JOptionPane.showMessageDialog(null,l.ehGrande());

		Eletronico e = new Eletronico("TV 40 pol ", 1500.00);
		//JOptionPane.showMessageDialog(null,e.ehCaro());

		Vector<Produto> carrinho = new Vector<Produto>(); // Produto = Livro e Eletrônico (POLIMORFISMO);
		carrinho.add(l);
		carrinho.add(e);
		Produto p = carrinho.get(0);
		Produto q = carrinho.get(1);
		JOptionPane.showMessageDialog(null, p.getNome() + p.ehCaro());
		JOptionPane.showMessageDialog(null, q.getNome() + q.ehCaro());
	}

}

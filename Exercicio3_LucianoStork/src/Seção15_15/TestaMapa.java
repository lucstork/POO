package Seção15_15;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa	{
	public	static	void	main(String[]	args) {
		Conta	c1	=	new	Conta();
		c1.deposita(10000);
		Conta	c2	=	new	Conta();
		c2.deposita(3000);
		
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor",	c1);
		mapaDeContas.put("gerente",	c2);
		
		Conta	contaDoDiretor	=	(Conta)	mapaDeContas.get("diretor");
		System.out.println("Saldo do diretor: R$" + contaDoDiretor.getSaldo());
		
		Conta contaDoGerente = (Conta) mapaDeContas.get("gerente");
		System.out.println("Saldo do gerente: R$" + contaDoGerente.getSaldo());
	}
}

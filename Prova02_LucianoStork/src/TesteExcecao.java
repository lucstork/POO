
public class TesteExcecao {
	public static void teste() throws MinhaExcecao {
		throw new MinhaExcecao();
	}

	public static void main(String[] args) {
		MinhaExcecao me = null;
		try {
			System.out.println("try ");
                        teste();
		} catch (MinhaExcecao e) {
			System.out.println("catch ");
			me = e;
		} finally {
			System.out.println("finally ");			
		}

		System.out.println("fim");
	}
}

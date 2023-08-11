package Seção9_6;

public class RespostasDasQuestoes {

	// Pergunta:
	// Se não	houvesse	herança	em	Java,	como	você	poderia	reaproveitar	o	código	de	outra	classe?

	// Resposta: 
	// Caso não houvesse herença em Java, uma possível saída para o reaproveitamento do código poderia ser por meio da utilização da composição que, inclusive, é tida como uma melhor opçãp em termos de escrita do código.
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Pergunta:
	// Uma	 discussão	 muito	 atual	 é	 sobre	 o	 abuso	 no	 uso	 da	 herança.	 Algumas	 pessoas	 usam	 herança apenas	 para	 reaproveitar	 o	 código,	 quando	 poderiam	 ter	 feito	 uma	 composição.	 Procure	 sobreherança	versus	composição.

	// Resposta: 
	// Na herança, temos o conceito de uma Classe Pai ou Superclasse, que é a classe que foi herdada pelas subclasses. A Classe Filha ou Subclasse é a classe que herda da classe Pai. Outros dois conceitos que temos na Herança é a Generalização onde se obtém similaridades entre classes e dessa forma define-se novas classes. As classes mais genéricas são as classes Pai. E a Especialização é onde Identifica-se atributos e métodos não correspondentes entre classes distintas colocando-os na classe filha. Ou seja, quando se tem similaridades entre as classes procura-se generalizá-las levando suas similaridades para a classe pai onde as classes filhas irão herdar essa similaridade.
	// Um dos benefícios da Herança é que ela captura o que é comum e o isola daquilo que é diferente, além de ser vista diretamente no código até mesmo devido a sua natureza estática.
	// Entre os problemas da Herança está o fraco encapsulamento entre classes e subclasses e o forte acoplamento entre elas.

	// A composição, por sua vez, estende uma classe pela delegação de trabalho para outro objeto. Na composição, ao invés de codificarmos um comportamento estaticamente (como é feito com o uso de herança) definimos pequenos comportamentos padrão e usamos composição para definir comportamentos mais complexos. Na composição, agora, podemos mudar a associação entre classes em tempo de execução, assim um objeto pode assumir mais de um comportamento.
	// A grande vantagem da Composição é que o comportamento pode ser escolhido em tempo de execução em vez de estar amarrado em tempo de compilação. Além disso, os objetos que foram instanciados e estão contidos na classe que os instanciou são acessados somente através de sua interface seguindo assim o princípio de programar para uma interface e não para uma implementação. 
	// A grande desvantagem é que um software muito dinâmico e parametrizado é mais difícil de entender do que software mais estático.
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Pergunta: 
	// Mesmo depois	de	reescrever	um	método	da	classe	mãe, a	classe	filha	ainda	pode acessar o	método antigo. Isso	é feito	 por meio da palavra-chave super.método(). Algo	parecido ocorre entre os construtores das classes, o quê?

	// Resposta: 
	// Se em um construtor for invocado o super(), estará sendo, de maneira análoga ao que ocorre em um método, invocado o construtor da classe mãe.

}


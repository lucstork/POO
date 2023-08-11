package Se��o9_6;

public class RespostasDasQuestoes {

	// Pergunta:
	// Se n�o	houvesse	heran�a	em	Java,	como	voc�	poderia	reaproveitar	o	c�digo	de	outra	classe?

	// Resposta: 
	// Caso n�o houvesse heren�a em Java, uma poss�vel sa�da para o reaproveitamento do c�digo poderia ser por meio da utiliza��o da composi��o que, inclusive, � tida como uma melhor op��p em termos de escrita do c�digo.
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Pergunta:
	// Uma	 discuss�o	 muito	 atual	 �	 sobre	 o	 abuso	 no	 uso	 da	 heran�a.	 Algumas	 pessoas	 usam	 heran�a apenas	 para	 reaproveitar	 o	 c�digo,	 quando	 poderiam	 ter	 feito	 uma	 composi��o.	 Procure	 sobreheran�a	versus	composi��o.

	// Resposta: 
	// Na heran�a, temos o conceito de uma Classe Pai ou Superclasse, que � a classe que foi herdada pelas subclasses. A Classe Filha ou Subclasse � a classe que herda da classe Pai. Outros dois conceitos que temos na Heran�a � a Generaliza��o onde se obt�m similaridades entre classes e dessa forma define-se novas classes. As classes mais gen�ricas s�o as classes Pai. E a Especializa��o � onde Identifica-se atributos e m�todos n�o correspondentes entre classes distintas colocando-os na classe filha. Ou seja, quando se tem similaridades entre as classes procura-se generaliz�-las levando suas similaridades para a classe pai onde as classes filhas ir�o herdar essa similaridade.
	// Um dos benef�cios da Heran�a � que ela captura o que � comum e o isola daquilo que � diferente, al�m de ser vista diretamente no c�digo at� mesmo devido a sua natureza est�tica.
	// Entre os problemas da Heran�a est� o fraco encapsulamento entre classes e subclasses e o forte acoplamento entre elas.

	// A composi��o, por sua vez, estende uma classe pela delega��o de trabalho para outro objeto. Na composi��o, ao inv�s de codificarmos um comportamento estaticamente (como � feito com o uso de heran�a) definimos pequenos comportamentos padr�o e usamos composi��o para definir comportamentos mais complexos. Na composi��o, agora, podemos mudar a associa��o entre classes em tempo de execu��o, assim um objeto pode assumir mais de um comportamento.
	// A grande vantagem da Composi��o � que o comportamento pode ser escolhido em tempo de execu��o em vez de estar amarrado em tempo de compila��o. Al�m disso, os objetos que foram instanciados e est�o contidos na classe que os instanciou s�o acessados somente atrav�s de sua interface seguindo assim o princ�pio de programar para uma interface e n�o para uma implementa��o. 
	// A grande desvantagem � que um software muito din�mico e parametrizado � mais dif�cil de entender do que software mais est�tico.
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Pergunta: 
	// Mesmo depois	de	reescrever	um	m�todo	da	classe	m�e, a	classe	filha	ainda	pode acessar o	m�todo antigo. Isso	� feito	 por meio da palavra-chave super.m�todo(). Algo	parecido ocorre entre os construtores das classes, o qu�?

	// Resposta: 
	// Se em um construtor for invocado o super(), estar� sendo, de maneira an�loga ao que ocorre em um m�todo, invocado o construtor da classe m�e.

}


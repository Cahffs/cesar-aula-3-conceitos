package aula3;

/* Sobrecarga de Métodos:
A sobrecarga de métodos é o recurso da orientação a objetos que permite criar dois ou mais métodos com a mesma assinatura (mesmo tipo de retorno e 
mesmo identificador) dentro de uma mesma classe. 
Os parâmetros de entrada devem ser distintos, podendo ser o tipo e a sequência dos parâmetros. 
O que diferencia um método sobrecarregado de outro são os parâmetros de entrada.
*/

	public class PessoaSobrecargaMetodos {
		private String nome;
		private int idade;

	public PessoaSobrecargaMetodos () {
		idade = 0;
}

	public PessoaSobrecargaMetodos (String nome) {
		this.nome = nome;
}

	public PessoaSobrecargaMetodos (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
}
}
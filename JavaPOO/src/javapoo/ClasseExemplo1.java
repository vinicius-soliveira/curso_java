package javapoo;

/*
 Um objeto � tudo que pode ser descrito por meio de caracteristicas, comportamentos e 
estado atual.

Classe e Objeto - A classe � um molde em que os objetos s�o as aplica��es finas geradas
a partir deste molde. A classe � uma estrutura que define quais s�o os atributos e comportamentos
de uma s�rie de objetos, estes objetos ser�o diferenciados pelos valores atribuidos a 
cada um. Um objeto � modulo que guarda duas informa��es: atributos e m�todos, estes s�o os
membros do objeto.
 */

public class ClasseExemplo1 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.ponta = 0.7;
		c1.status();
		c1.escrever();

		Caneta c2 = new Caneta();
		c2.modelo = "Compactor";
		c2.cor = "Preta";
		c2.ponta = 0.5;
		c2.tampada = true;
		c2.status();
		c2.escrever();
		
	}

}

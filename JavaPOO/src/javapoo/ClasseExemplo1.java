package javapoo;

/*
 Um objeto é tudo que pode ser descrito por meio de caracteristicas, comportamentos e 
estado atual.

Classe e Objeto - A classe é um molde em que os objetos são as aplicações finas geradas
a partir deste molde. A classe é uma estrutura que define quais são os atributos e comportamentos
de uma série de objetos, estes objetos serão diferenciados pelos valores atribuidos a 
cada um. Um objeto é modulo que guarda duas informações: atributos e métodos, estes são os
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

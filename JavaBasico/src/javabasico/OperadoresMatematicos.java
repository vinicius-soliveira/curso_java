package javabasico;
import java.math.*;


public class OperadoresMatematicos {

	public static void main(String[] args) {
		
	//Operadores Aritm�ticos:
		
		int n1 = 9;
		int n2 = 23;
		int soma = n1 + n2; // 32 
		int subtracao = n1-n2; // -14
		int multiplicacao = n1*n2; // 207
		int divisaoInteira = n2/n1; // 2
		float divisao = (float)n2/n1; // 2.556
		System.out.printf("%.3f\n", divisao);
		int resto = n2 % n1; // 5
		
	// Operadores Un�rios:
		
		int num = 10;
		System.out.println(num++); //  num = 10 Incrementa a vari�vel ap�s esta linha de comando
		System.out.println(num);   //  num = 11
		System.out.println(++num); //  num = 12 Incrementa a vari�vel antes desta linha de comando
		
		System.out.println(num--); //  num = 12 Decrementa a vari�vel ap�s esta linha de comando
		System.out.println(num);   //  num = 11
		System.out.println(--num); //  num = 10 Decrementa a vari�vel antes desta linha de comando
	
		
	// Operadores de Atribui��o:
		
		int a = 12;
		int b = 7;
		int somAtribuicao = a += b; // a = 19
		int subAtribuicao = a -= b; // a = 12
		int mulAtribuicao = a *= b; // a = 84
		int divAtribuicao = a /= b; // a = 12
		int resAtribuicao = a %= b; // a = 5
		
	// Classe Math	
		
	// Constantes:
				
	    System.out.printf("O valor de pi � %f\n", Math.PI);
	    System.out.printf("A constante de euler vale %f\n", Math.E);
	  	  
	// Fun��es Matem�ticas - alguns exemplos:
	    
	    System.out.printf("A raiz quadrada de %d � %.1f\n", 25, Math.sqrt(25)); 
	    System.out.printf("A raiz cubica de %d � %.1f\n", 216, Math.cbrt(216));
	    System.out.printf("%d elevado a %d � igual a %.1f\n",2, 10, Math.pow(2,10));
	    System.out.printf("O valor absoluto de %d � %d\n", -5, Math.abs(-5));
	    System.out.printf("%f arredondado para cima � %f \n", 4.1, Math.ceil(4.1));
	    System.out.printf("%f arredondado para baixo � %f \n", 4.9, Math.floor(4.9));
	    System.out.printf("%f arredondado aritimeticamente � %d\n", 4.5, Math.round(4.5));
	      
   // Gerar numeros aleat�rios:
	    
	    System.out.printf("A fun��o random() gera um numero aleatorio entra 0 e 1:%f \n ", Math.random());
	    
	}
	
}

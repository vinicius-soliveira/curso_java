package javabasico;
import java.math.*;


public class OperadoresMatematicos {

	public static void main(String[] args) {
		
	//Operadores Aritméticos:
		
		int n1 = 9;
		int n2 = 23;
		int soma = n1 + n2; // 32 
		int subtracao = n1-n2; // -14
		int multiplicacao = n1*n2; // 207
		int divisaoInteira = n2/n1; // 2
		float divisao = (float)n2/n1; // 2.556
		System.out.printf("%.3f\n", divisao);
		int resto = n2 % n1; // 5
		
	// Operadores Unários:
		
		int num = 10;
		System.out.println(num++); //  num = 10 Incrementa a variável após esta linha de comando
		System.out.println(num);   //  num = 11
		System.out.println(++num); //  num = 12 Incrementa a variável antes desta linha de comando
		
		System.out.println(num--); //  num = 12 Decrementa a variável após esta linha de comando
		System.out.println(num);   //  num = 11
		System.out.println(--num); //  num = 10 Decrementa a variável antes desta linha de comando
	
		
	// Operadores de Atribuição:
		
		int a = 12;
		int b = 7;
		int somAtribuicao = a += b; // a = 19
		int subAtribuicao = a -= b; // a = 12
		int mulAtribuicao = a *= b; // a = 84
		int divAtribuicao = a /= b; // a = 12
		int resAtribuicao = a %= b; // a = 5
		
	// Classe Math	
		
	// Constantes:
				
	    System.out.printf("O valor de pi é %f\n", Math.PI);
	    System.out.printf("A constante de euler vale %f\n", Math.E);
	  	  
	// Funções Matemáticas - alguns exemplos:
	    
	    System.out.printf("A raiz quadrada de %d é %.1f\n", 25, Math.sqrt(25)); 
	    System.out.printf("A raiz cubica de %d é %.1f\n", 216, Math.cbrt(216));
	    System.out.printf("%d elevado a %d é igual a %.1f\n",2, 10, Math.pow(2,10));
	    System.out.printf("O valor absoluto de %d é %d\n", -5, Math.abs(-5));
	    System.out.printf("%f arredondado para cima é %f \n", 4.1, Math.ceil(4.1));
	    System.out.printf("%f arredondado para baixo é %f \n", 4.9, Math.floor(4.9));
	    System.out.printf("%f arredondado aritimeticamente é %d\n", 4.5, Math.round(4.5));
	      
   // Gerar numeros aleatórios:
	    
	    System.out.printf("A função random() gera um numero aleatorio entra 0 e 1:%f \n ", Math.random());
	    
	}
	
}

package javabasico;

public class rotinas {
	
	// Funções em Java
	
	static void soma(int a, int b) {
		
		int s = a+b;
		System.out.println("A soma de " + a + " e " + b + " é: "+ s);	
		
	}
	
	static int subtracao(int a, int b) {
		int s = a-b;
		return s;	
	}
	
	public static void main(String[] args) {
		
		soma(4,8);
		int sub = subtracao(9,5);
		System.out.println("A subtração de 9 e 5 é: "+ sub);
		
		
	}
	
}

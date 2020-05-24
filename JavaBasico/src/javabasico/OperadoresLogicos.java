package javabasico;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
	
	// Operadores relacionais:	
		System.out.printf("Operador maior: %d > %d: %b\n", 10, 5, 10>5);
		System.out.printf("Operador maior ou igual: %d >= %d: %b\n", 4, 5, 4>=5);
		System.out.printf("Operador menor: %d < %d: %b\n", 10, 12, 10<12);
		System.out.printf("Operador menor ou igual: %d <= %d: %b\n", 6, 5, 6<=5);
		System.out.printf("Operador igual: %d == %d: %b\n", 10, 7, 10==7);
		System.out.printf("Operador diferente: %d != %d: %b\n", 10, 8, 10!=8);
	
		// Operadores lógicos	
		
		int x = 5;
		int y = 7;
		int z = 10;
		boolean w;
		
		System.out.printf("Operador AND: %d > %d && %d > %d -> %b\n", y,x,z,y,w=(y>x && z>y));
		System.out.printf("Operador OR: %d > %d || %d > %d -> %b\n",x,y,z,x,w=(x>y || z>x));
		System.out.printf("Operador XOR: %d > %d ^ %d > %d -> %b\n",y,x,z,y,w=(y>x ^ z>y));
		System.out.printf("Operador XOR: %d > %d ^ %d > %d -> %b\n",x,y,z,x,w=(x>y ^ z>x));
		System.out.printf("Operador NOT: !(%d == %d) -> %b\n", x,y,w=!(x==y));
		System.out.printf("Operador NOT: !(%d > %d) -> %b\n", y,x, w = !(y>x));
		
		
	// Operador ternário:
		
		int n1 = 5;
		int n2 = 7;
		int r = (n1>n2)?1:2;
		System.out.println(r);
		
	//
		
		
	}

}

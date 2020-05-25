package javabasico;

public class Loops {

	public static void main(String[] args) {
		
		// Estruturas de repetição com o comando while:
		System.out.println("Exemplo  - Loop while:\n");
		int contador = 0;
		while(contador < 5) {
			contador++;
			System.out.println("Contador: " + contador);
		}
		
		System.out.println("\nExemplo  - Continue:\n");
		contador = 0;
		while(contador < 5) {
			contador++;
			if (contador == 4) 
				continue; // Inicia nova iteração					
			System.out.println("Contador: " + contador);
		}
		
		System.out.println("\nExemplo  - Break:\n");
		contador = 0;
		while(contador < 5) {
			contador++;
			if (contador == 4) 
				break; // Sai do loop					
			System.out.println("Contador: " + contador);
		}
		
		
		
		// Estruturas de repetição com o comando do-while:
				System.out.println("\nExemplo  - Loop do-while:\n");
				contador = 0;
				do {
					contador++;
					System.out.println("Contador: " + contador);
				
				} while(contador < 5); 
				
				System.out.println("\nExemplo  - Continue:\n");
				contador = 0;
				do {
					contador++;
					if (contador == 4) 
						continue; // Inicia nova iteração
					System.out.println("Contador: " + contador);
				
				} while(contador < 5); 
				
				
				System.out.println("\nExemplo  - Break:\n");
				contador = 0;
				do {
					contador++;
					if (contador == 4) 
						break; // Sai do loop
					System.out.println("Contador: " + contador);
				
				} while(contador < 5); 
		
				
		// Estruturas de repetição com o comando for:
				System.out.println("\nExemplo  - Loop for:\n");
				
				for(contador = 1; contador <=5; contador++){
					System.out.println("Contador: " + contador);
				}
								
				System.out.println("\nExemplo  - Continue:\n");
				
				for(contador = 1; contador <=5; contador++){
					if (contador == 4) 
						continue; // Inicia nova iteração
					System.out.println("Contador: " + contador);
					
				}
				
				System.out.println("\nExemplo  - Break:\n");
				
				for(contador = 1; contador <=5; contador++){
					if (contador == 4) 
						break; // Sai do loop
					System.out.println("Contador: " + contador);
				}
				
		// Estruturas de repetição aninhada com o comando for:		
				
				System.out.println("\nExemplo  - repetição aninhada:\n");
				for(int i=0; i<3;i++) {
					for(int j=0;j<10;j+=5) {
						System.out.printf("%d%d\n",i,j);
					}
				}
				
				
	}

}

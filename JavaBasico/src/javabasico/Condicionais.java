package javabasico;

import java.util.Scanner;
import java.math.*;

public class Condicionais {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Compara��o  com if-else:
		
		System.out.print("Digite a sua idade: ");
		int idade = teclado.nextInt();
		
		if (idade > 18)
			System.out.println("Voc� � maior de idade!");
		 else 
			System.out.println("Voc� � menor de idade!");
		
		System.out.print("Digite os coeficientes da equa��o quadratica: ");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		double delta = b*b - 4*a*c;
		
		if (delta < 0)
			System.out.println("A equa��o n�o possui raizes reais!");
		else if (delta == 0) {
			double raiz = -b/(2*a);
			System.out.println("A equa��o possui uma raiz real de multiplicidade 2, igual a "+ raiz);	
		} else {
			double raiz1 = (-b + Math.sqrt(delta))/(2*a);
			double raiz2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("A equa��o possui duas raizes reais, iguais a "+ raiz1 + " e " + raiz2);
		}
	
		// Compara��o com switch:
		
		System.out.print("Digite o numero de faces do Poliedro: ");
		int faces = teclado.nextInt();
		
		switch(faces) {
		
		case 4:
			System.out.println("O poliedro � o tetraedro, e este � um poliedro de Plat�o");
			break;
		case 6:
			System.out.println("O poliedro � o hexaedro, e este � um poliedro de Plat�o");
			break;
		case 8:
			System.out.println("O poliedro � o octaedro, e este � um poliedro de Plat�o");
			break;
		case 12:
			System.out.println("O poliedro � o docecaedro, e este � um poliedro de Plat�o");
			break;
		case 20:	
			System.out.println("O poliedro � o icosaedro, e este � um poliedro de Plat�o");
			break;
		default:
			System.out.println("Este n�o � um poliedro de Plat�o");
		
			
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}

}

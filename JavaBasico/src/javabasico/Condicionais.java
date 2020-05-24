package javabasico;

import java.util.Scanner;
import java.math.*;

public class Condicionais {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Comparação  com if-else:
		
		System.out.print("Digite a sua idade: ");
		int idade = teclado.nextInt();
		
		if (idade > 18)
			System.out.println("Você é maior de idade!");
		 else 
			System.out.println("Você é menor de idade!");
		
		System.out.print("Digite os coeficientes da equação quadratica: ");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		double delta = b*b - 4*a*c;
		
		if (delta < 0)
			System.out.println("A equação não possui raizes reais!");
		else if (delta == 0) {
			double raiz = -b/(2*a);
			System.out.println("A equação possui uma raiz real de multiplicidade 2, igual a "+ raiz);	
		} else {
			double raiz1 = (-b + Math.sqrt(delta))/(2*a);
			double raiz2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("A equação possui duas raizes reais, iguais a "+ raiz1 + " e " + raiz2);
		}
	
		// Comparação com switch:
		
		System.out.print("Digite o numero de faces do Poliedro: ");
		int faces = teclado.nextInt();
		
		switch(faces) {
		
		case 4:
			System.out.println("O poliedro é o tetraedro, e este é um poliedro de Platão");
			break;
		case 6:
			System.out.println("O poliedro é o hexaedro, e este é um poliedro de Platão");
			break;
		case 8:
			System.out.println("O poliedro é o octaedro, e este é um poliedro de Platão");
			break;
		case 12:
			System.out.println("O poliedro é o docecaedro, e este é um poliedro de Platão");
			break;
		case 20:	
			System.out.println("O poliedro é o icosaedro, e este é um poliedro de Platão");
			break;
		default:
			System.out.println("Este não é um poliedro de Platão");
		
			
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}

}

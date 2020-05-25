package javabasico;

import java.util.Arrays;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Criando vetores:
		
		int a[] = new int[4]; 
		int n[] = {1,2,3,4};
		
		for(int c=0; c < n.length; c++){
			a[c] = c;
			n[c] *= n[c];
			System.out.print(a[c]);
			System.out.print("\t"+n[c]+"\n");
		}
	
		// For each - exclusivo para coleções em Java
		
		System.out.println("\nExemplo - for each\n");
		int num[] = {4, 5, 7, 1, 8};
		
		for (int valor: num) { 
			
			System.out.println(valor);
		}
		System.out.println("\nOrdenando:\n");
		Arrays.sort(num);
		for (int valor:num) { 
			
			System.out.println(valor);
		}
		
		
		// Busca binária
		
		int vet[] = {0,2,5,9,4,7,6,3};
		Arrays.sort(vet);
		int p = Arrays.binarySearch(vet, 7);
		System.out.println("O número 7 está na posição " + p);
		
		// Prencher vetores

		int v[] = new int[20];
		Arrays.fill(v, 0);
		
		for (int valor: v) { 
			
			System.out.print(valor + " ");
		}
		
		// Exemplo vetores:
		
		String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho","Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int numDias[] = {31, 28, 31,30,31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.print("\nDigite o ano atual: ");
		int ano = teclado.nextInt();
		boolean bissexto = false;
		
		
		if (ano % 400 == 0) {
			bissexto = true;
		} else if (ano % 4 == 0 && ano % 100 !=0 ) {
			bissexto = true;
		} else {
			bissexto = false;
		}
		
		if (bissexto)
			numDias[1] = 29;
		
		
		for(int i = 0; i < mes.length;i++ ) {
			
			System.out.println("O mês " + mes[i] + " tem " + numDias[i] + " dias.");
		}
		
		
		
	}

}

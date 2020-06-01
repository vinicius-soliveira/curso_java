package javabasico;

import java.util.Scanner;

public class EntradaSaidaDados {
	public static void main(String[] args) {

		// Saída de dados:

		String nome = new String("Vinicius");
		int idade = 25;
		double peso = 81.5;
		int numeroAlunos = (int) 45;
		Float nota = new Float(8.72);
		double taxaJuros = (double) 0.0429786;
		char letra = 'V';

		System.out.print("Seu nome é " + nome + " sua idade é " + idade + " seu peso é " + peso + "\n");
		System.out.println("O numero de alunos na turma é " + numeroAlunos + " e a maior nota é " + nota);
		System.out.printf("A taxa de juros para você é %.3f \n", taxaJuros);
		System.out.format("As letras %cestá em %s", letra, nome);

		// Entrada de dados:

		// Para entrada de dados é necessário importar a biblioteca: java.util.Scanner

		Scanner teclado = new Scanner(System.in); // Cria um objeto teclado do tipo Scanner para ser a entrada do
													// sistema
		System.out.print("\nDigite o nome do seu time: ");
		String time = teclado.nextLine(); // O método nextLine retorna uma String finalizada com Enter
		System.out.println(nome + " torce para o " + time);
		System.out.print("Digite o seu ano de nascimento: ");
		int ano = teclado.nextInt();
		System.out.println(nome + " nasceu no ano de " + ano);
		
		
		
		
	}
}

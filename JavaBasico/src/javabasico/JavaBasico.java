package javabasico;
import java.util.Scanner;

public class JavaBasico {
	public static void main(String[] args) {
		//Introdução a Java Básico - Criando váriaveis e manipulando dados
		
		//Diferentes formas de declarar variáveis do tipo Inteiro:
		
			int idade = 25; // 
			int numeroAlunos = (int) 45;
			Integer mesesAno = new Integer(12); // Objeto do tipo Integer
			
	    //Diferentes formas de declarar variáveis do tipo Ponto Flutuante:
			
			float altura = 1.72f;
			float imc = (float) 23.7855;
			Float nota = new Float(8.72); // Objeto do tipo Float
			
			double peso = 81.5;
			double taxaJuros = (double) 0.0429786;
			Double temperatura = new Double(29.51); // Objeto do tipo Double
			
		//Diferentes formas de declarar variáveis do tipo Literal:
			
			char letra = 'V';
			char vogal = (char) 'i';
			Character consoante = new Character('S'); // Objeto do tipo Character - armazena apenas um caractere
			String nome = new String("Vinicius"); // Objeto do tipo String - armazena uma cadeia de caracteres
			
	   //Diferentes formas de declarar variáveis do tipo Booleano:
			
			boolean casado = false;
			boolean solteiro = (boolean) true;
			Boolean flamenguista = new Boolean(true); // Objeto do tipo Boolean
			
	  // Saída de dados:
			
			System.out.print("Seu nome é " + nome + " sua idade é " + idade + " seu peso é " + peso + "\n");	
			System.out.println("O numero de alunos na turma é " + numeroAlunos + " e a maior nota é " + nota);
			System.out.printf("A taxa de juros para você é %.3f \n", taxaJuros);
			System.out.format("As letras %c e %c estão em %s", letra, vogal, nome);	
		
	 //Entrada de dados:	

		// Para entrada de dados é necessário importar a biblioteca: java.util.Scanner
		
			Scanner teclado = new Scanner(System.in); // Cria um objeto teclado do tipo Scanner para ser a entrada do sistema
			System.out.print("\nDigite o nome do seu time: ");
			String time = teclado.nextLine(); // O método nextLine retorna uma String finalizada com Enter
			System.out.println(nome + " torce para o " + time);
			System.out.print("Digite o seu ano de nascimento: ");
			int ano = teclado.nextInt();
			System.out.println(nome + " nasceu no ano de "+ ano + " e este ano obviamente teve " + mesesAno + " meses");
			
	//Conversão de tipo de dados
			
			int salario = 3000;
			String pagamento = Integer.toString(salario); // Convertendo um Inteiro em String
			System.out.printf(pagamento);
			salario = Integer.parseInt(pagamento); // Convertendo uma String em um Inteiro

	}
}

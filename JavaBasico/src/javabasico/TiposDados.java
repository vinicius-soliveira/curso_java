package javabasico;

public class TiposDados {
	public static void main(String[] args) {
		// Introdu��o a Java B�sico - Criando v�riaveis e manipulando dados

		// Diferentes formas de declarar vari�veis do tipo Inteiro:

		int idade = 25; //
		int numeroAlunos = (int) 45;
		Integer mesesAno = new Integer(12); // Objeto do tipo Integer

		/*
		 O tipo de dado int reserva um espa�o na memoria de 32 bits Outros tipos de
		 dados de inteiros s�o: byte que reserva um espa�o na mem�ria de 4 bits. short
		 que reserva um espa�o na mem�ria de 16 bits. long que reserva um espa�o na
		 mem�ria de 64 bits.
		 */

		// Diferentes formas de declarar vari�veis do tipo Ponto Flutuante:

		float altura = 1.72f;
		float imc = (float) 23.7855;
		Float nota = new Float(8.72); // Objeto do tipo Float

		double peso = 81.5;
		double taxaJuros = (double) 0.0429786;
		Double temperatura = new Double(29.51); // Objeto do tipo Double

		/*
		 O tipo de dado float reserva um espa�o na memoria de 32 bits. O tipo de dado
		 float reserva um espa�o na memoria de 64 bits.
		 */

		// Diferentes formas de declarar vari�veis do tipo Literal (caractere Unicode):

		char letra = 'V';
		char vogal = (char) 'i';
		Character consoante = new Character('S'); // Objeto do tipo Character - armazena apenas um caractere
		String nome = new String("Vinicius"); // Objeto do tipo String - armazena uma cadeia de caracteres

		/*
		 O tipo de dado char reserva um espa�o na memoria de 16 bits.
		 */

		// Diferentes formas de declarar vari�veis do tipo Booleano:

		boolean casado = false;
		boolean solteiro = (boolean) true;
		Boolean flamenguista = new Boolean(true); // Objeto do tipo Boolean

		/*
		 O tipo de dado boolean reserva um espa�o na memoria de 1 bit.
		 */

		// Convers�o de tipo de dados

		int salario = 3000;
		String pagamento = Integer.toString(salario); // Convertendo um Inteiro em String
		salario = Integer.parseInt(pagamento); // Convertendo uma String em um Inteiro
		
		// Fun��es para strings
		
		String frase = "Amar � um deserto e seus temores.";
		String fraseMinuscula = frase.toLowerCase();
		String fraseMaiuscula = frase.toUpperCase();
		String palavra = frase.substring(0,4);
		String[] palavras = frase.split(" "); 
		System.out.println(frase);
		System.out.println(fraseMinuscula);
		System.out.println(fraseMaiuscula);
		System.out.println(palavra);
		System.out.println(palavras[3]);
		
		
	}
}

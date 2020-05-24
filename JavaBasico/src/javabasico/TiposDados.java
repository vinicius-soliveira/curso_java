package javabasico;


public class TiposDados{
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
			
	  //Conversão de tipo de dados
			
			int salario = 3000;
			String pagamento = Integer.toString(salario); // Convertendo um Inteiro em String
			salario = Integer.parseInt(pagamento); // Convertendo uma String em um Inteiro

	}
}

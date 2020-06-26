package aula1_classesObjetos;

public class ClasseExemplo1 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.ponta = 0.7; // Erro pois o atributo tem visibilidade privada
		c1.status();
		c1.escrever();

		Caneta c2 = new Caneta();
		c2.modelo = "Compactor";
		c2.cor = "Preta";
		c2.ponta = 0.5; // Erro pois o atributo tem visibilidade privada
		c2.tampada = true;
		c2.status();
		c2.escrever();

	}

}

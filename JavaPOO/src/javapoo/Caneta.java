package javapoo;

public class Caneta {
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status () {
		System.out.println("Uma caneta " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
	}
	
	void escrever(){
		if (!tampada){
			System.out.println("Escrevendo");
		} else {
			System.out.println("Impossível escrever. Retire a tampa!");
		}
		
	}
	
	
	
	
}

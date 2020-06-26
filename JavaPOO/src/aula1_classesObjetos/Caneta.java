package aula1_classesObjetos;

public class Caneta {
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	boolean tampada;
	
	public void status () {
		System.out.println("Uma caneta " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
	}
	
	protected void escrever(){
		if (!tampada){
			System.out.println("Escrevendo");
		} else {
			System.out.println("Impossível escrever. Retire a tampa!");
		}
	
	}
		
	public void tampar() {
		if(!tampada) {
			tampada = true;
		}
			
			
		
	}
	
	
	
	
}

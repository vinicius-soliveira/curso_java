package banco;

public class Banco {
	public static void main(String[] args) {
		Conta cliente01 = new Conta("Vinicius Oliveira", 27,"João Pessoa", "Estudante", 1000.00f);
		cliente01.show();
		cliente01.abrirConta("CC");
		cliente01.depositar(1200);
	}
}

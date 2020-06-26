package metodoAcessor;

public class Pessoa {

	protected String nome;
	protected int idade;
	public String cidade;
	
	
	public Pessoa(String name, int age, String city) {
		this.nome = name;
		this.idade = age;
		this.cidade = city;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setNome(String name) {
		this.nome = name;
	}
	
	public void setCidade(String city) {
		this.cidade = city;
	}
	public void setIdade(int age) {
		this.idade = age;
	}
	
	public void show() {
		System.out.println("O nome do candidato é "+ this.getNome());
		System.out.println(this.getNome() + " tem "+ this.getIdade()+ " anos");
		System.out.println(this.getNome() + " mora em "+ this.getCidade());
	}
	
}

package banco;

public class Cliente {
	private String nome;
	private int idade;
	private String cidade;
    private String profissao;
    private float renda;
	
	
	public Cliente (String name, int age, String city, String job, float renda) {
		this.nome = name;
		this.idade = age;
		this.cidade = city;
		this.profissao = job;
		this.renda = renda;
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
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public float getRenda() {
		return this.renda;
	}
		
	
	public void setNome(String name) {
		this.nome = name;
	}
	
	public void setIdade(int age) {
		this.idade = age;
	}
	
	public void setCidade(String city) {
		this.cidade = city;
	}
	
	public void setProfissao(String job) {
		this.profissao = job;
	}
	
	public void setRenda(float renda) {
		this.renda = renda;
	}
	
	
	public void show() {
		System.out.println("O nome do cliente é "+ this.getNome());
		System.out.println(this.getNome() + " tem "+ this.getIdade()+ " anos");
		System.out.println(this.getNome() + " mora em "+ this.getCidade());
		System.out.println("A profissão de " + this.getNome() + " é "+ this.getProfissao());
		System.out.println(this.getNome() + " recebe mensalmente R$ "+ this.getRenda());
	}
}

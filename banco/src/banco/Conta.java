package banco;

public class Conta extends Cliente {
	public int numConta;
	protected String tipo;
	private float saldo;
	private boolean status;
	
	public Conta(String name, int age, String city, String job, float renda) {
		super(name, age, city, job, renda);
		status = false;
		saldo = 0;
		
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(String tipo) {
		if(!this.getStatus()) {
			
			setStatus(true);
			setTipo(tipo);
			
			if(this.tipo == "CC") {
				setSaldo(50);
			} else if(this.tipo == "CP") {
				setSaldo(150);
			} else {
				System.out.println("Tipo inválido");
				setStatus(false);
			}
		}
	}
	
	public void fecharConta() {
		if(this.status) {
			if(this.saldo >= 0) {
				sacar(this.saldo);
				setStatus(false);			
			} else {
				System.out.println("Você precisa quitar seu débito para fechar a conta!");
			}
		} else {
			System.out.println("Não foi possível realizar esta operação");
		}
	}
	
	public void depositar (float valor) {
		if (valor < 0) {
			System.out.println("Não foi possível realizar a operação.");
		} else {
			this.saldo += valor;
		}
		
	}
	
	public void sacar (float valor) {
		if (valor < 0) {
			System.out.println("Não foi possível realizar a operação.");
		} else if (this.saldo < valor) {
			System.out.println("Não foi possível realizar a operação. Verifique seu saldo");
		}else {
			this.saldo -= valor;
		}
		
	}
	
	public void pagarTaxaMensal (float valor) {
		if(this.getStatus()) {
			if(this.getTipo() == "CC") {
				valor = 10;
			} else if(this.getTipo() == "CP") {
				valor = 20;
			}else {
				System.out.println("Não foi possível realizar a operação.");
			}
				this.saldo -= valor;
			}
		}
		
	

}

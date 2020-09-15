package entities;

public class Conta {
	//Variaveis
	private String nome;
	private int numConta;
	private double saldo;
	
	//construtores
	public Conta() {
		
	}
	public Conta(String nome, int numConta) {
		super();
		this.nome = nome;
		this.numConta = numConta;
	}
	
	//Get | Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//Metodos
	public double saqueConta(double saque) {
		return this.saldo -= saque + 5.0;
	}
	public double depositoConta(double dep) {
		return this.saldo = this.saldo + dep;
	}
	public String toString()
	{
		return "Valor na conta: " + this.saldo 
				+ " do cliente " + this.nome 
				+ " conta: " + this.numConta;
	}
}

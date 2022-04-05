package ftsubota.com.github.projeto.contaBancaria;

public class ContaBancaria {
	
	private String nome;
	private Double saldo;
	private String numero;
	private String tipo;
	
	public ContaBancaria(String nome, Double saldo, String numero, String tipo) {
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void sacar(Double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	@override
	public void detalhes() {
		System.out.println("Conta: " + this.getNumero());
		System.out.println("Titular: " + this.getNome());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
}
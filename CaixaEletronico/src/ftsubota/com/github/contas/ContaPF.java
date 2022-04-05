package ftsubota.com.github.contas;

import ftsubota.com.github.projeto.contaBancaria.*;

public class ContaPF extends ContaBancaria{
	
	private int qtdSaque;
	
	public ContaPF(String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
		this.qtdSaque = 3;
	}
	
	public void depositar(Double valor) {
		Double taxa = valor * 0.01;
		Double saldo = valor - taxa;
		super.depositar(valor);	
	}
	
	public void sacar(Double valor) {
		if(valor > this.getSaldo()) {
			System.out.println("Saque para saldo negado");
			return;
		}
		
		if(this.qtdSaque < 1) {
			Double taxa = valor * 0.01;
			Double saldo = valor + taxa;
			super.getSaldo();
			return;
		}
		super.sacar(valor);
	}
	
}
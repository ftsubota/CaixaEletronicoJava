package ftsubota.com.github.contas;

import ftsubota.com.github.projeto.contaBancaria.*;

public class ContaPJ extends ContaBancaria{

	public ContaPJ(String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
		
	}
	
	public void sacar(Double valor){
		super.sacar(valor);
	}
	
	public void depositar(Double valor) {
		valor -= valor * 0.02;
		super.depositar(valor);
	}
}
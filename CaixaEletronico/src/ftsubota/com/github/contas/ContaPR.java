package ftsubota.com.github.contas;

import ftsubota.com.github.projeto.contaBancaria.*;

public class ContaPR extends ContaBancaria{
	
	private int qtdSaque;

	public ContaPR(String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
	}
	
	public void sacar(Double valor) {
		if(this.qtdSaque >= 3){
			double taxa = valor * 0.015;
			valor += taxa;
			super.sacar(valor);
			return;
		}
		super.sacar(valor);
		this.qtdSaque++;
	}
	
	public void depositar(Double valor) {
		if(valor <= 1000.00) {
			double taxa = valor * 0.008;
			valor -= taxa;
			super.depositar(valor);
		}
		super.depositar(valor);
	}
}
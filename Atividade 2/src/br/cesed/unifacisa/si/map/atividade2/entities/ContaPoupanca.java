package br.cesed.unifacisa.si.map.atividade2.entities;

import br.cesed.unifacisa.si.map.atividade2.interfaces.Conta;

public class ContaPoupanca implements Conta {
	
	private String titular;
	private String cpf;
	private double saldo;
	private double juros;

	public ContaPoupanca(String titular, String cpf, double saldo, double juros) {
		super();
		this.titular = titular;
		this.cpf = cpf;
		this.saldo = saldo;
		this.juros =  juros;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void saque(double montante) {
		
		if(montante <= saldo){
			saldo -= montante;
		}else {
			System.out.println("Valor inv�lido para saque");
		}
		
	}

	public void deposito(double montante) {
		double juros = (montante/100) * this.juros;
		if(montante > 0) {
			saldo += (montante + juros);
		}else {
			System.out.println("Valor para deposito inv�lido");
		}
	}

	public double checkExtract() {
		System.out.println("O saldo da sua conta poupan�a �:");
		return saldo;
	}
	
	

}

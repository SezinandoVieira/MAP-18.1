package br.cesed.unifacisa.si.map.atividade2.entities;

import br.cesed.unifacisa.si.map.atividade2.interfaces.Conta;

public class ContaCorrente implements Conta {

	private String titular;
	private String cpf;
	private double saldo;

	public ContaCorrente(String titular, String cpf, double saldo) {
		super();
		this.titular = titular;
		this.cpf = cpf;
		this.saldo = saldo;
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
		if (montante <= saldo) {
			saldo -= montante;
		} else {
			System.out.println("Valor inválido");
		}
	};

	public void deposito(double montante) {
		if (montante > 0) {
			saldo += montante;
		} else {
			System.out.println("Valor insuficiente ou inválido para depósito");
		}
	}

	public double checkExtract() {
		System.out.println("O saldo de sua conta corrente é:");
		return saldo;
	}

}

package br.cesed.facisa.si.map.entidades;

public abstract class ContaBancaria {

	private String titular;
	private String cpf;
	private int conta;
	private double saldo;

	public ContaBancaria(String nome, String cpf, int conta) {
		this.titular = nome;
		this.cpf = cpf;
		this.conta = conta;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public ContaBancaria(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return titular;
	}

	public void setNome(String nome) {
		this.titular = nome;
	}

	public void saque(double s) {
		if (s <= saldo) {
			saldo -= s;
		} else {
			System.out.println("O valor que voc� est� tentando sacar � muito alto");
		}
	}

	public void depositar(double d) {
		if (d > 0) {
			saldo += d;
		} else {
			System.out.println("Valor para deposito inv�lido");
		}
	}

	public double retornaSaldo() {
		System.out.println("Seu saldo �:");
		return saldo;
	}

}

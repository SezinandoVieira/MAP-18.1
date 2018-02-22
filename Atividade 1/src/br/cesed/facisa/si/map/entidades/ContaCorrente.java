package br.cesed.facisa.si.map.entidades;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String nome, String cpf, int conta) {
		super(nome, cpf, conta);
	}

	public ContaCorrente(String cpf) {
		super(cpf);
	}

}

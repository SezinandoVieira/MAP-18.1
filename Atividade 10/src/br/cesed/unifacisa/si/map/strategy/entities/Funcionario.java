package br.cesed.unifacisa.si.map.strategy.entities;

import br.cesed.unifacisa.si.map.strategy.enums.Cargos;

public class Funcionario {

	private String nome;
	private Cargos cargo;
	private double comissao;

	public Funcionario(String nome, Cargos cargo) {
		super();
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}

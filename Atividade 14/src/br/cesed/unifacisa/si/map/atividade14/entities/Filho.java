package br.cesed.unifacisa.si.map.atividade14.entities;

import br.cesed.unifacisa.si.map.atividade14.interfaces.Familia;

public class Filho implements Familia {

	private Pai pai;
	private String nome;
	private String email;
	
	@Override
	public String dados() {
		return "O pai de " + nome + " é = " + pai.getNome() + " Email = " + email;
	}

	public Pai getPai() {
		return pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

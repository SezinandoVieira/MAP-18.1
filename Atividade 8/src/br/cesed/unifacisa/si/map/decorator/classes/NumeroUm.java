package br.cesed.unifacisa.si.map.decorator.classes;

import br.cesed.unifacisa.si.map.decorator.interfaces.NumeroDecorator;

public class NumeroUm implements NumeroDecorator{

	private Numero numero;

	public NumeroUm(Numero numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String getNumeroDecorado() {
		return this.numero.toString();
	}
	
	
}

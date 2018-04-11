package br.cesed.unifacisa.si.map.decorator.classes;

import br.cesed.unifacisa.si.map.decorator.interfaces.NumeroDecorator;

public class Chaves implements NumeroDecorator {

	private NumeroDecorator numD;

	public Chaves(NumeroDecorator numD) {
		super();
		this.numD = numD;
	}

	@Override
	public String getNumeroDecorado() {
		// TODO Auto-generated method stub
		return "{" + numD.getNumeroDecorado() + "}";
	}

}

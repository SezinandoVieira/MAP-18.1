package br.cesed.unifacisa.si.map.decorator.classes;

import br.cesed.unifacisa.si.map.decorator.interfaces.NumeroDecorator;

public class Colchetes implements NumeroDecorator {

	private NumeroDecorator numC;

	public Colchetes(NumeroDecorator numC) {
		super();
		this.numC = numC;
	}

	@Override
	public String getNumeroDecorado() {
		// TODO Auto-generated method stub
		return "[" + numC.getNumeroDecorado() + "]";
	}
	
	
}

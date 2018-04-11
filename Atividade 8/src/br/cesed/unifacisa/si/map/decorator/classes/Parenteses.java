package br.cesed.unifacisa.si.map.decorator.classes;

import br.cesed.unifacisa.si.map.decorator.interfaces.NumeroDecorator;

public class Parenteses implements NumeroDecorator{

	private NumeroDecorator numP;

	public Parenteses(NumeroDecorator numP) {
		super();
		this.numP = numP;
	}

	@Override
	public String getNumeroDecorado() {
		// TODO Auto-generated method stub
		return "(" + numP.getNumeroDecorado() + ")";
	}
	
	
	
}

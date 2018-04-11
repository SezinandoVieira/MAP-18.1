package br.cesed.unifacisa.si.map.decorator.main;

import br.cesed.unifacisa.si.map.decorator.classes.Chaves;
import br.cesed.unifacisa.si.map.decorator.classes.Colchetes;
import br.cesed.unifacisa.si.map.decorator.classes.Numero;
import br.cesed.unifacisa.si.map.decorator.classes.NumeroUm;
import br.cesed.unifacisa.si.map.decorator.classes.Parenteses;
import br.cesed.unifacisa.si.map.decorator.interfaces.NumeroDecorator;

public class App {

	public static void main(String[] args) {

		Numero num = new Numero(1);
		
		NumeroDecorator numeroDecorado = new NumeroUm(num);
		System.out.println(numeroDecorado.getNumeroDecorado());
		numeroDecorado = new Parenteses(numeroDecorado);
		numeroDecorado = new Chaves(numeroDecorado);
		numeroDecorado = new Colchetes(numeroDecorado);
		System.out.println(numeroDecorado.getNumeroDecorado());
	}

}

package br.cesed.facisa.si.map.main;

import br.cesed.facisa.si.map.entidades.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente("092.183.084-82");
		c1.depositar(100.0);
		System.out.println(c1.retornaSaldo());
		System.out.println(c1.getCpf());
	}

}

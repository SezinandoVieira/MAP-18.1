package br.cesed.unifacisa.si.map.atividade14.main;

import br.cesed.unifacisa.si.map.atividade14.entities.Filho;
import br.cesed.unifacisa.si.map.atividade14.entities.Pai;

public class App {

	public static void main(String[] args) {

		Pai pai = new Pai();
		pai.setNome("Pedin da Silva");
		pai.setIdade(45);
		System.out.println(pai.dados());
		
		Filho filho = new Filho();
		
		filho.setPai(pai);
		filho.setNome("Pedin Juino");
		filho.setEmail("pedin_ocanxa@gmail.com");
		System.out.println(filho.dados());
	}

}

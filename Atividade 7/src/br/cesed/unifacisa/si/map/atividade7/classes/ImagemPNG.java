package br.cesed.unifacisa.si.map.atividade7.classes;

import br.cesed.unifacisa.si.map.atividade7.interfaces.Imagem;

public class ImagemPNG implements Imagem {

	@Override
	public void carregaImagem() {
		System.out.println("Carregando a imagem no formato PNG");
	}

	@Override
	public void desenhaImagem() {
		System.out.println("Desenhando a imagem no formato PNG");
	}


}

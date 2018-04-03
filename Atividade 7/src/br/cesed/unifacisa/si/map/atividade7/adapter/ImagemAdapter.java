package br.cesed.unifacisa.si.map.atividade7.adapter;

import br.cesed.unifacisa.si.map.atividade7.interfaces.Imagem;
import br.cesed.unifacisa.si.map.atividade7.interfaces.ImagemTarget;

public class ImagemAdapter implements ImagemTarget{
	

	@Override
	public void carregaImagem(Imagem imagem) {
		imagem.carregaImagem();
		
	}

	@Override
	public void desenhaImagem(Imagem imagem) {
		imagem.desenhaImagem();
	}

	

}

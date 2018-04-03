package br.cesed.unifacisa.si.map.atividade7.main;

import br.cesed.unifacisa.si.map.atividade7.adapter.ImagemAdapter;
import br.cesed.unifacisa.si.map.atividade7.classes.ImagemBMP;
import br.cesed.unifacisa.si.map.atividade7.classes.ImagemPNG;
import br.cesed.unifacisa.si.map.atividade7.interfaces.Imagem;

public class App {

	public static void main(String[] args) {
		ImagemAdapter img = new ImagemAdapter();
		Imagem PNG = new ImagemPNG();
		Imagem BMP = new ImagemBMP(); 
		img.desenhaImagem(PNG);
		img.carregaImagem(BMP);
		
	}

}

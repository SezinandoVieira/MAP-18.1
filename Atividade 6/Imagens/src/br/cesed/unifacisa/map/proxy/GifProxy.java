package br.cesed.unifacisa.map.proxy;

import java.io.IOException;

import br.cesed.unifacisa.map.classes.Gif;
import br.cesed.unifacisa.map.classes.Path;
import br.cesed.unifacisa.map.interfaces.Cabecalho;
import br.cesed.unifacisa.map.interfaces.Imagem;

public class GifProxy implements Imagem{
	
	Cabecalho cabecalho;
    Path path;
    Gif gif;
    
    GifProxy(Gif gif, Path path, Cabecalho cabecalho) {
        this.gif = gif;
    	this.path = path;
        this.cabecalho = cabecalho;
    }

	@Override
	public short altura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short largura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[][] content() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
}

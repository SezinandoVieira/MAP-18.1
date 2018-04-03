package br.cesed.unifacisa.map.classes;

import br.cesed.unifacisa.map.interfaces.Cabecalho;

public class CabecalhoGif implements Cabecalho {

	String path;
    CabecalhoGif(String path) {
        this.path = path;
    }
    @Override
    public short altura() {
        return 256;
    }

    @Override
    public short largura() {
        return 256;
    }
	
}

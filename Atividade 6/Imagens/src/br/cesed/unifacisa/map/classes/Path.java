package br.cesed.unifacisa.map.classes;

public class Path {

	String p;
    Path(String p) {
        this.p = p;
    }
    String get() {
        return this.p;
    }
    String getTipo() {
        return this.p.substring(this.p.lastIndexOf(".") + 1);
    }
	
}

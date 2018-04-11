package br.cesed.unifacisa.si.map.decorator.classes;

public class Numero {

	private int num;

	public Numero(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	
	

}

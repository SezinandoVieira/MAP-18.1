package br.cesed.unifacisa.si.map.atividade4;

class Incremental {
	private static int count = 0;
	private static int numero;
	
	private static Incremental inc = new Incremental();
	
	private Incremental() {
		
	}

	public String toString() {
		return "Incremental " + numero;
	}
	
	public static Incremental getIncremental(){
		numero = ++count;
		return inc;
	}
	
}

public class TesteIncremental {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(Incremental.getIncremental());
		}
	}
}

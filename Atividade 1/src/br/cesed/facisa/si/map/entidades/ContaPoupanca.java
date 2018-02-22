package br.cesed.facisa.si.map.entidades;

public class ContaPoupanca extends ContaBancaria {
	private double juros;

	public ContaPoupanca(String nome, String cpf, int conta, double juros) {
		super(nome, cpf, conta);
		this.juros = juros;
	}

	public ContaPoupanca(String cpf) {
		super(cpf);
	}

	public double getJuros() {
		return juros;
	}
	
	@Override
	public void saque(double quantia)	{
		double juros = (quantia/100) * this.juros;
		double valorFinal = quantia + juros;
		
		super.saque(valorFinal);
		
	}
	
}

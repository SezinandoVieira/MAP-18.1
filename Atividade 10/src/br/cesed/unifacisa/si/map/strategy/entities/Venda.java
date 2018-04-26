package br.cesed.unifacisa.si.map.strategy.entities;

public class Venda {

	private double venda;
	private Funcionario func;
	private double comissaoVenda;
	
	public Venda(Funcionario func, double venda) {
		super();
		this.func = func;
		this.venda = venda;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public Funcionario getFunc() {
		return func;
	}

	public void setFunc(Funcionario func) {
		this.func = func;
	}

	public double getComissao() {
		return comissaoVenda;
	}

	public void setComissao(double comissao) {
		this.comissaoVenda = comissao;
	}
	
	
	public void sale(){
		this.comissaoVenda = this.func.getCargo().calcularComissao(this.venda);
		this.func.setComissao(this.func.getComissao() + this.comissaoVenda);
	}
	
}

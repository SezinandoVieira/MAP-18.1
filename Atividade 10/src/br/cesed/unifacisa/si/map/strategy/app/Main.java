package br.cesed.unifacisa.si.map.strategy.app;

import br.cesed.unifacisa.si.map.strategy.entities.Funcionario;
import br.cesed.unifacisa.si.map.strategy.entities.Venda;
import br.cesed.unifacisa.si.map.strategy.enums.Cargos;

public class Main {

	public static void main(String[] args) {
		
		Funcionario gerente = new Funcionario("Cleiton", Cargos.GERENTE);
		Funcionario vendedor = new Funcionario("Marisvania", Cargos.VENDEDOR);
		Funcionario atendente = new Funcionario("Cleiton", Cargos.ATENDENTE);

		Venda venda1 = new Venda(gerente, 200);
		venda1.sale();
		System.out.println(gerente.getComissao());
		
		Venda venda2 = new Venda(vendedor, 700);
		venda2.sale();
		System.out.println(vendedor.getComissao());
		
		Venda venda3 = new Venda(atendente, 1200);
		venda3.sale();
		System.out.println(atendente.getComissao());
	}

}


public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 2100, 1);
		System.out.println(umFuncionario.calcularGratificacao());

		Funcionario outroFuncionario = new Funcionario(Funcionario.DBA, 1700, 2);
		System.out.println(outroFuncionario.calcularGratificacao());
		
		Funcionario umGerente = new Funcionario(Funcionario.GERENTE, 10500, 1);
		System.out.println(umGerente.calcularGratificacao());
		
		Funcionario outroGerente = new Funcionario(Funcionario.GERENTE, 15000, 2);
		System.out.println(outroGerente.calcularGratificacao());
	}
}

//Super Classe do Supervisor e Gerente
abstract class Gerencia extends Funcionario implements GerenciaInterface{
	
	public Gerencia(String nome, double salario) {
		super(nome, salario);	
	}
	
	public void ajustarSalario(Funcionario func, double valor) {
		func.salario += valor;
		System.out.printf("%s ,Reajuste concedido! Valor %.2f%n", func.getNome(), valor);
		System.out.printf("Valor total do salário: %.2f%n", (func.getSalario() + func.getBeneficio()));
	};
	
	public void demitir(Funcionario func) {
		System.out.println("-------------------------------------------------------------------");
		if(func.isAtivo()) {
			func.setAtivo(false);
			func.setTrabalho(false);
			System.out.printf("%s, demissão concluída!%n", func.getNome());
		}else{
		System.out.printf("%s ,funcionário não está ativo!%n", func.getNome());
		}
	};
	
	public void pagarSalario(Funcionario func) {
		System.out.println("-------------------------------------------------------------------");
		if(func.isTrabalho()) {
			System.out.printf("%s, pagamento realizado!%n", func.getNome());
		}else {
			System.out.printf("%s, não está ativo! %n", func.getNome());
		}
	};
	
	public void supervisionar(Funcionario func) {
		System.out.println("-------------------------------------------------------------------");
		if(func.isTrabalho()) {
			System.out.printf("%s, parabéns! Trabalho realizado! %n", func.getNome());
		}else {
			System.out.printf("%s, atenção! Trabalho não realizado. %n", func.getNome());
		}
	};
}

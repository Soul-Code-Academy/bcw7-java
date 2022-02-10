//Funcionário Padrão - trabalha
//
//Funcionário Gerente trabalha, supervisiona, demite, dar aumento, faz pagamentos ao funcionario padrao
//
//funcionario supervisor trabalha, demite, superviosa, faz pagamento gerente
//
//Regra de Negócios
//
//Todos os Funcionários:
//
//Se tiver filhos: recebe bônus família;
//
//Para ser demitido: tem que estar ativo;
//
//Para receber o salário: tem que trabalhar;


// Classe abstrata não pode ser substanciada, mas pode ser herdada.
// private -> não permite acessar diretamente na classe principal, só através de get e set.

public abstract class Funcionario {
	
	private String nome;
	private String cargo;
	protected double beneficio;
	protected double salario;
	private boolean filhos;
	private boolean ativo; 
	private boolean trabalho;
	
	
	final double BONUS_FAMILIA = 350.50;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;	
		this.ativo = true;
//		this.beneficio = salario;
	}

	public void dados() {	System.out.println("-------------------------------------------------------------");
		System.out.printf("Nome do funcionário: %s%n", this.getNome());
		System.out.printf("Salário do funcionário. *Salário base + benefícios. %.2f%n", (this.getSalario()+ this.getBeneficio()));
		System.out.printf("Funcionário tem filhos: %s%n", (this.isFilhos() ? "Sim" : "Não"));
		System.out.printf("Cargo do Funcionário: %s%n", this.getCargo());
		
	}
	
	public void informarFilho() {
		if(!this.isFilhos()) {
		this.setFilhos(true);
		this.setBeneficio(this.BONUS_FAMILIA);
		System.out.println("----------------------------------------------------------");
		System.out.printf("%s , seu Bônus Família foi ativado. Valor %.2f%n", this.getNome(), 					this.BONUS_FAMILIA);
		System.out.printf("Valor total do salário: %.2f%n", (this.getSalario() + this.getBeneficio()));
		}
	}
	public void trabalhar() {
		if(this.isAtivo()) {
		this.setTrabalho(true);	
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Carga horária cumprida!");
	}else {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Você não está ativo!");
		}
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public boolean isFilhos() {
		return filhos;
	}

	public void setFilhos(boolean filhos) {
		this.filhos = filhos;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isTrabalho() {
		return trabalho;
	}

	public void setTrabalho(boolean trabalho) {
		this.trabalho = trabalho;
	}

	public double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(double beneficio) {
		this.beneficio += beneficio;
	}	
}

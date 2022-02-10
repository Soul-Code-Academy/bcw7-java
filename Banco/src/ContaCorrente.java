//Subclasse da classe Conta
public class ContaCorrente extends Conta{
	
	//final (o conteúdo aplicado não será modificado)
	
	private final String atendimento = "Sem prioridades";
	
	//Adicionando o constructor
	//Constructor tem que ter o mesmo nome da subclasse -> ContaCorrente
	
	public ContaCorrente(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}
	
	//Herdando o método dados da super classe Conta
	public void dados() {
		super.dados();
		System.out.println("Atendimento: " + this.getAtendimento());		
	}

	public String getAtendimento() {
		return atendimento;
	}
	
	public void sacar(double valor) {
		System.out.println("--------------------------------" + this.getTitular() + "--------------------------------");
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso! Saldo:  " + this.getSaldo());
		}else {
			System.out.println("Saldo insuficiente. Revise o valor! Saldo:  " + this.getSaldo());
		}
	}
	
	public void depositar(double valor) {
		System.out.println("--------------------------------" + this.getTitular() + "--------------------------------");
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso! Saldo:  " + this.getSaldo());
	}
	

}

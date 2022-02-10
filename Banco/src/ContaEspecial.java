//Subclasse da classe Conta
public class ContaEspecial extends Conta{
	
	//final (o conteúdo aplicado não será modificado)
	
	private final String atendimento = "Com prioridades";
	
	public double chequeEspecial = 300.00;
	
	//Adicionando o constructor
	//Constructor tem que ter o mesmo nome da subclasse -> ContaEspecial
	
	public ContaEspecial(String titular, int numero, double saldo, double chequeEspecial) {
		super(titular, numero, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public String getAtendimento() {
		return atendimento;
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void dados() {
		//Herdando o método dados da super classe Conta
		super.dados();
		System.out.println("Atendimento: " + this.getAtendimento());
		System.out.println("Cheque Especial: " + this.getChequeEspecial());	
	}
	
	public void sacar (double valor) {
		System.out.println("--------------------------------" + this.getTitular() + "--------------------------------");
		if(this.getSaldo() >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso! Saldo:  " + this.getSaldo());
		}else if((this.getSaldo() + this.getChequeEspecial()) >= valor){
			System.out.println("Saldo disponível insuficiente. O limite será somado ao saldo.");
			this.chequeEspecial -= (valor - this.getSaldo());
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso! Saldo: " + this.getSaldo() + " Saldo do limite: " + 			this.getChequeEspecial());
		}else {
			System.out.println("Saldo insuficiente. Revise o valor!");
		}		
	}
	
	public void depositar(double valor) {
		System.out.println("--------------------------------" + this.getTitular() + "--------------------------------");
		if(this.getSaldo() >= 0) {
//			this.chequeEspecial -= (valor - this.getSaldo());
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso! Saldo:  " + this.getSaldo() + " Saldo do limite: " +  			this.getChequeEspecial());
		}else if(this.getSaldo() < 0) {
			this.saldo += valor;
			this.chequeEspecial += (valor - this.saldo);
			System.out.println("Depósito realizado com sucesso! Saldo:  " + this.getSaldo() + " Saldo do limite: " +  			this.getChequeEspecial());
		}
	}
}
	

	


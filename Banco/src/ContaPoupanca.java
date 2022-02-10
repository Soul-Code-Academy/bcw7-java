//Subclasse da classe Conta
public class ContaPoupanca extends Conta{
	
	//final (o conteúdo aplicado não será modificado)
	
	private final String atendimento = "Sem prioridades";

	public double rendimento = 0.5;
	
	//Adicionando o constructor
	//Constructor tem que ter o mesmo nome da subclasse -> ContaEspecial
		
		public ContaPoupanca(String titular, int numero, double saldo) {
			super(titular, numero, saldo);
		}
		
		public String getAtendimento() {
			return atendimento;
		}
		
		public double getRendimento() {
			return rendimento;
		}
		
		public void dados() {
			//Herdando o método dados da super classe Conta
			super.dados();
			System.out.println("Atendimento: " + this.getAtendimento());
			System.out.println("Rendimento: " + this.getRendimento());	
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
		
		  public void addRendimentos(double rendimento){
		      this.saldo = this.saldo * rendimento;
		      System.out.println("Saldo com rendimento:  " + this.getSaldo());
		   }
		
}

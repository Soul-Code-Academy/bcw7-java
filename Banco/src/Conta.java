//Super classe -> Conta
public class Conta {

	//Atributos comuns para todas sub-classes
	
	public int numero;
	public String titular;
	public double saldo;
	
	//Constructor tem que ter o mesmo nome da classe -> Conta
	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}
	
	// Método -> dados
	public void dados() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Titular da Conta: " + this.getTitular());
		System.out.println("Número da Conta: " + this.getNumero());
		System.out.println("Saldo da Conta: " + this.getSaldo());
	}
}


public class Principal {

	public static void main(String[] args) {
		
		// Instanciar os objetos e imprimir os dados
		
//		Conta c1 = new Conta("José Antônio", 100, 300.50);
//		Conta c2 = new Conta("Luciana Almeida", 101, 200);
		
//		c1.dados();
//		c2.dados();
		
		ContaCorrente c3 = new ContaCorrente("José Antônio", 100, 300.50);
		ContaCorrente c4 = new ContaCorrente("Luciana Almeida", 101, 200);
		
		c3.dados();
		c4.dados();
		
		c3.sacar(100);
		c4.sacar(201);
		
		c3.depositar(100);
		c4.depositar(200);
		
		c4.sacar(201);
		
		ContaEspecial c5 = new ContaEspecial("Ana Lúcia", 102, 300, 400);
		
		c5.dados();
		
		c5.sacar(700);
		
		c5.depositar(900);
		
		
		
		ContaPoupanca c6 = new ContaPoupanca("Rafaela Dias", 103, 400);
	
		c6.dados();
		
		c6.sacar(100);
		
		c6.depositar(900);
		
		c6.addRendimentos(2.5);
	}

}


public class Principal {

	public static void main(String[] args) {
		
//		Veiculo v1 = new Veiculo("Chevrolet" , "Astra", 65000);
//		v1.dados();
//		
		
		Bicicleta b1 = new Bicicleta("Caloi", "BMX", 600, 0);
		b1.informarBagageiro();
		b1.dados();
		b1.acelerar();
		b1.acelerar();
		b1.acelerar();
		b1.frear();
		
		Moto m1 = new Moto("Honda", "Bros", 22000);
		m1.dados();
		m1.acelerar();
		m1.acelerar();
		m1.acelerar();
		m1.frear();
		
		Carro c1 = new Carro ("Fiat", "Toro", 120000, 2);
		c1.dados();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
	}

}

//Atributos e métodos comuns a todas sub-classes
 abstract class Veiculo {
	
	private double valor;
	private double velocidade = 1;
	protected double potencia = 1;
	private String marca;
	private String modelo;
	protected int quantidadePneus;
	
	public Veiculo(String marca, String modelo, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	
	public void setValor(double valor) {
		if(valor >= 1000) {
			this.valor = valor;
		}else {
			System.out.println("Valor não aplicável.");
		}		
	}


//	public void setVelocidade(double velocidade) {
//		this.velocidade = velocidade;
//	}

	public void frear() {
		this.velocidade -= this.potencia;
		System.out.println("-------------------------------------------");
		System.out.printf("Velocidade: %.2f%n" , this.velocidade);
	}
	
	public void acelerar() {
		this.velocidade += (this.velocidade * this.potencia);
		System.out.println("-------------------------------------------");
		System.out.printf("Velocidade: %.2f%n" , this.velocidade);
	}
	
	public void dados() {
		System.out.printf("Marca do veículo: %s%n" , this.marca);
		System.out.printf("Modelo do veículo: %s%n", this.modelo);
		System.out.printf("Valor do veículo: %s%n", this.valor);
	}
	
	public double getVelocidade() {
		return velocidade;
	}

	public int getQuantidadePneus() {
		return quantidadePneus;
	}


	public void setQuantidadePneus(int quantidadePneus) {
		this.quantidadePneus = quantidadePneus;
	}


	public double getValor() {
		return valor;
	}


	public double getPotencia() {
		return potencia;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}
}

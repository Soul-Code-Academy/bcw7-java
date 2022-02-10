
public class Bicicleta extends Veiculo{

	private int quantidadeMarchas;
	private boolean bagageiro;
	
	public Bicicleta(String marca, String modelo, double valor, int quantidadeMarchas) {
		super(marca, modelo, valor);
		super.quantidadePneus = 2;
		super.potencia = 1.2;
		this.quantidadeMarchas = quantidadeMarchas;
	}
	
	public void informarBagageiro() {
		this.bagageiro = true;
	}
	
	public void dados() {
		super.dados();
		System.out.println("-----------------------------BICICLETA------------------------");
		System.out.printf("Quantidade de marchas: %s%n", this.getQuantidadeMarchas());
		System.out.printf("Tem bagageiro? %s%n", (this.isBagageiro() ? "Sim" : "Não"));
		
	}

	public int getQuantidadeMarchas() {
		return quantidadeMarchas;
	}

	public boolean isBagageiro() {
		return bagageiro;
	}

	
}


public class Carro extends Automovel{

	private int quantidadePortas;
	
	public Carro(String marca, String modelo, double valor,  int quantidadePortas) {
		super(marca, modelo, valor);
		super.setTipoCarteira("B");
		super.potencia = 1.9;
		this.quantidadePortas = quantidadePortas;	
	}
	
	public void dados() {
		System.out.println("-----------------------------CARRO------------------------");
		super.dados();
		System.out.printf("Tipo de carteira: %s%n", super.getTipoCarteira());
		System.out.printf("Quantidade de portas:  %s%n", this.getQuantidadePortas());	
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	
}

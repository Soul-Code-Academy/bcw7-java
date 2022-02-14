//Super classe -> Menu
public class Menu {

	//Atributos comuns para todas sub-classes
	
	private String nome;
	private String escolha;
	private double valorTotal;
	
	//Constructor tem que ter o mesmo nome da classe -> Conta
	public Menu(String nome, String escolha) {
		this.nome = nome;
		this.setEscolha(escolha);
	}
	
	// Método ->fazerPedido
		public void fazerPedido() {
			System.out.println("---------------------------------------------------------------------------");
			System.out.printf("Nome do cliente: %s%n", this.getNome());
			System.out.printf("Prato escolhido: %s%n" ,this.getEscolha());
		}

		public String getNome() {
			return nome;
		}

		public String getEscolha() {
			return escolha;
		}

		public void setEscolha(String escolha) {
			this.escolha = escolha;
		}

		public double getValorTotal() {
			return valorTotal;
		}

		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}

	


	
}

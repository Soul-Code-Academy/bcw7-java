
public class Massa extends Menu{

	final double VALOR_REAL = 25.00;
	private int quantidade;
	
	public Massa(String nome, String escolha, int quantidade) {
		super(nome, escolha);
		super.setValorTotal(this.getValorReal());
		this.quantidade = quantidade;
		
	}
	
	public double efetuarCompra() {
		return super.getValorTotal();	
	}
	
	public void efetuarPedido() {
		super.fazerPedido();
		System.out.printf("Valor total do pedido: %.2f%n", this.efetuarCompra() * this.getQuantidade());
	}
	
	public double getValorReal() {
		return VALOR_REAL;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}


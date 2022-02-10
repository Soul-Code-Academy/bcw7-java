
public class SaladaSanduiche extends Menu{
	
	final double VALOR_REAL = 30.00;
	final double TAXA = 10.00;

	public SaladaSanduiche(String nome, String escolha) {
		super(nome, escolha);
		super.setValorTotal(this.getValorReal());
	}
	
	public void ingredienteAdicional() {
		super.setValorTotal(super.getValorTotal() + this.getTaxa());
	}
	
	public double efetuarCompra() {
		return super.getValorTotal();	
	}
	
	public void efetuarPedido() {
		super.fazerPedido();
		System.out.printf("Valor total do pedido: %.2f%n", this.efetuarCompra());
	}
	
	public double getValorReal() {
		return VALOR_REAL;
	}
	
	public double getTaxa() {
		return TAXA;
	}

	
}

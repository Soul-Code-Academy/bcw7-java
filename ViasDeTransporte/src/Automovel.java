
public abstract class Automovel extends Veiculo {

	private String tipoCarteira;

	public Automovel(String marca, String modelo, double valor) {
		super(marca, modelo, valor);
		
	}

	public String getTipoCarteira() {
		return tipoCarteira;
	}

	public void setTipoCarteira(String tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}

	
}



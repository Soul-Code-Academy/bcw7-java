
public class Moto extends Automovel{

	private boolean partidaEletrica;
	
	public Moto(String marca, String modelo, double valor) {
		super(marca, modelo, valor);
		super.setTipoCarteira("A");
		super.potencia = 1.6;
	}
	
	public void informarPartida()
	{
		this.partidaEletrica = true;
	}
	
	public void dados() {
		System.out.println("-----------------------------MOTO------------------------");
		super.dados();
		System.out.printf("Tipo de carteira: %s%n", super.getTipoCarteira());
		System.out.printf("Tem partida elétrica? %s%n", (this.isPartidaEletrica() ? "Sim" : "Não"));	
	}

	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}
}

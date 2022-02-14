package Lanches;
//Subclasse da super classe Lanche
public class Bolo extends Lanche{

	private String massa;
	private String recheioEcobertura;
	
	//Constructor tem que ter o mesmo nome da classe
	public Bolo() {}
	
	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheioEcobertura() {
		return recheioEcobertura;
	}

	public void setRecheioEcobertura(String recheioEcobertura) {
		this.recheioEcobertura = recheioEcobertura;
	}

	
}
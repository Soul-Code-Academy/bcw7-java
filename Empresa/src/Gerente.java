
public class Gerente extends Gerencia implements GerenteInterface{
	
	final double BONUS_GERENTE = 500;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
		super.setCargo("Funcionário Gerente");
		super.beneficio += this.BONUS_GERENTE; 
	}
	
	public void ajustarSalarioPadrao(Padrao funcPadrao, double valorAumento) {
		super.ajustarSalario(funcPadrao, valorAumento);
	};
	
	public void demitirPadrao(Padrao funcPadrao) {
		super.demitir(funcPadrao);
	};
	
	public void pagarSalarioPadrao(Padrao funcPadrao) {
		super.pagarSalario(funcPadrao);
	};
	
	public void supervisionarPadrao(Padrao funcPadrao) {
	super.pagarSalario(funcPadrao);
	}

	public void darFolga() {
		
		
	};
}


public class Supervisor extends Gerencia implements SupervisorInterface{

	final double BONUS_SUPERVISOR = 800;
	
	public Supervisor(String nome, double salario) {
		super(nome, salario);
		super.setCargo("Funcionário Supervisor");
		super.setBeneficio(getBeneficio() + this.BONUS_SUPERVISOR);
	}

	public void ajustarSalarioGerente(Gerente funcGerente, double valor) {
		super.ajustarSalario(funcGerente, valor);
		
	}

	public void demitirGerente(Gerente funcGerente) {

		super.demitir(funcGerente);
		
	}

	public void pagarSalarioGerente(Gerente funcGerente) {
		super.pagarSalario(funcGerente);
	}

	public void supervisionarGerente(Gerente funcGerente) {
		super.pagarSalario(funcGerente);
	}


	public void declararPontoFacultativo() {
		
		
	}

	
}

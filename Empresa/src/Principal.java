
public class Principal {

	public static void main(String[] args) {
		
		Padrao f1 = new Padrao("José Carlos", 3500);
		f1.dados();
		f1.informarFilho();
		
		Gerente g1 = new Gerente("Ana Lúcia", 5000);
		Gerente g2 = new Gerente("José Edson", 4500);
		g1.dados();
		g1.ajustarSalarioPadrao(f1,100);
		f1.dados();
		
		f1.trabalhar();

		g1.pagarSalarioPadrao(f1);
		
		g1.demitirPadrao(f1);
		
		g1.pagarSalarioPadrao(f1);
		
		g1.supervisionarPadrao(f1);
	
		
		Supervisor s1 = new Supervisor("Rafaela Dias", 6000);
		
		s1.dados();
		
		s1.informarFilho();
		
		s1.dados();
		
		g2.dados();
		
		s1.ajustarSalarioGerente(g2, 300);
		
		g2.informarFilho();
		
		s1.demitirGerente(g2);
		
		g2.trabalhar();
		s1.pagarSalarioGerente(g2);

	}

}

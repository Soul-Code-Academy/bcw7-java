
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Quantidade de Jogadores: " + Jogador.quantJogadores);
		
		//Instanciei a classe através de um novo objeto
		//Classe Jogador
		
		Jogador j1 = new Jogador("Caio", 23);
		Jogador j2 = new Jogador("Rafaela", 18);
		Jogador j3 = new Jogador("José", 31);
		
		j1.setIdade(25);
		j3.setNome("Carlos");
		
		//Chamando por atributo
		System.out.println("Nome do jogador 1: " + j1.nome + "." +  " Idade: " + j1.idade + " anos.");
		System.out.println("Nome do jogador 2: " + j2.nome + "." +  " Idade: " + j2.idade + " anos.");
		System.out.println("Nome do jogador 3: " + j3.nome + "." +  " Idade: " + j3.idade + " anos.");
		
		//Chamando por método
		System.out.println("Nome do jogador 1: " + j1.getNome() + "." +  " Idade: " + j1.getIdade() + " anos.");
		System.out.println("Nome do jogador 2: " + j2.getNome() + "." +  " Idade: " + j2.getIdade() + " anos.");
		System.out.println("Nome do jogador 3: " + j3.getNome() + "." +  " Idade: " + j3.getIdade() + " anos.");
		
		System.out.println("Quantidade de Jogadores: " + Jogador.quantJogadores);
		
		j1.diminuirVidas();
		j1.diminuirVidas();
		j3.diminuirVidas();
		j2.diminuirVidas();
		
		j1.pontuar(38);
		j2.pontuar(18);
		j3.pontuar(3);
		j2.pontuar(-8);
		
		j1.dados();
		j2.dados();
		j3.dados();
		
	}

}


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciei a classe através de um novo objeto
		//Classe Jogador
		
		Jogador j1 = new Jogador("Caio", 23);
		Jogador j2 = new Jogador("Rafaela", 18);
		Jogador j3 = new Jogador("José", 31);
		System.out.println("Nome do jogador 1: " + j1.nome + "." +  " Idade: " + j1.idade + " anos.");
		System.out.println("Nome do jogador 2: " + j2.nome + "." +  " Idade: " + j2.idade + " anos.");
		System.out.println("Nome do jogador 3: " + j3.nome + "." +  " Idade: " + j3.idade + " anos.");
		
	}

}

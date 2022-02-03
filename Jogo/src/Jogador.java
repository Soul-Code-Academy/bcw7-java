
public class Jogador {
	
	//Atributo da classe (nome, idade)
	
	public String nome = "";
	public int idade = 0;
	
	//Parâmetro do método (nome, idade)
	public Jogador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("Jogador criado!");
	}
}
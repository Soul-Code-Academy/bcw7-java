
public class Jogador {
	
	//Atributo da classe (nome, idade)
	
	public String nome = "";
	public int idade = 0;
	public int vidas = 4;
	
	//Parâmetro do método (nome, idade)
	public Jogador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.vidas = 4;
		System.out.println("Jogador criado!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public int getVidas() {
		return this.vidas;
	}
	
	public void diminuirVidas() {
		if(this.vidas > 1) {
			this.vidas--;
			System.out.println("Você perdeu uma vida. Saldo: " + this.vidas);
		}else if(this.vidas == 1) {
			this.vidas--;
			System.out.println("Fim de jogo!");
		}else {
			System.out.println("Sem vidas! Você está fora do jogo.");		
		}	
		
	}

}
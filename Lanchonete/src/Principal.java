
//Atividade.
//Nome do projeto: Lanchonete.
//A lanchonete oferece 3 tipos tipos de pratos: Sanduiche, massa e salada.
//Para os sanduíches há um valor básico e o cliente poderá adicionar até mais 3 ingredientes. A cada ingrediente adicionado é acrescido um valor padrão.
//Para a escolha das massas, a lanchonete oferece 3 pratos diferentes, mas todos com o mesmo preço.
//Para a salada seguem as mesmas regras do sanduíche.
//Você deve implementar uma aplicação para a lanchonete, onde é feito um pedido e, de
//acordo com o pedido é calculado o preço do lanche.

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int escolha;
		
		System.out.println("Menu");
	System.out.println("Escolha um opção: 1 - Sanduíche, 2 - Salada, 3 - Massa");
	escolha = scan.nextInt();
	
	switch(escolha) {
	case 1:
		int adicionarIngrediente1 = 0;
		int devolve1;
		
		SaladaSanduiche ss1 = new SaladaSanduiche("Rafaela", "sanduiche");
		System.out.println("Adicionar mais um ingrediente?  Digite: 1 ou 2.  *1-Sim, 2-Não");
		devolve1 = scan.nextInt();
		
	while(adicionarIngrediente1 < 2 && devolve1 == 1) {
		System.out.println("Adicionar mais um ingrediente? Digite: 1 ou 2.  *1-Sim, 2-Não");
		devolve1 = scan.nextInt();
		adicionarIngrediente1++;
		ss1.ingredienteAdicional();
			}
		ss1.efetuarPedido();
		break;
	case 2:
		int adicionarIngrediente2 = 0;
		int devolve2 = 0;
		
		SaladaSanduiche ss2 = new SaladaSanduiche("João", "salada");
		System.out.println("Adicionar mais um ingrediente?  Digite: 1 ou 2.  *1-Sim, 2-Não");
		devolve2 = scan.nextInt();
		
	while(adicionarIngrediente2 < 2 && devolve2 == 1) {
		System.out.println("Adicionar mais um ingrediente? Digite: 1 ou 2.  *1-Sim, 2-Não");
		devolve2 = scan.nextInt();
		adicionarIngrediente2++;
		ss2.ingredienteAdicional();
			}
		ss2.efetuarPedido();
		break;
	case 3:
		Massa m1 = new Massa("Ana", "massa", 2);
		m1.efetuarPedido();
		break;
	default:
		System.out.println("Escolha uma opção válida!");
		}
	}
}

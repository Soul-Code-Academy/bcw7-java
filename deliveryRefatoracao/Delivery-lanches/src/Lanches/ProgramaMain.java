//Documento: https://docs.google.com/document/d/12VjowZSiKikKyrqMGPuWld2TOmc3JK0-1CeQX6rdJFM/edit?usp=sharing

package Lanches;

import java.util.Scanner;
//Classe principal, que é o ponto de entrada. Mostra o menu e chama os métodos para executar a aplicação.
public class ProgramaMain {
	public static void main(String[] args) {
		
		int escolhaDoTipoLanche;
	
		Scanner ler = new Scanner(System.in);
		//Menu 
		System.out.println("--------------------------Bem vindos ao Delivery do Java Express-------------------------");
		System.out.println("");
		System.out.println("-----------------------------------Menu de opções------------------------------------------");
		System.out.println("				[ 1 ] - Sanduíches ..... R$ 10,00 + 2,00 por ingrediente escolhido");
		System.out.println("				[ 2 ] - Massas ......... R$ (depende do sabor escolhido)");
		System.out.println("				[ 3 ] - Bolos .......... R$ 120,00");
		System.out.println("				[ 4 ] - Salgados ....... (depende do salgado");
		System.out.println("Escolha a opção desejada:");
		
		
		escolhaDoTipoLanche = ler.nextInt();
		//Opçoes para executar de acordo com o tipo de lanche escolhido
		switch (escolhaDoTipoLanche) {
	     case 1:
	 		Sanduiche sanduiche = new Sanduiche();
	       	 System.out.println("                              Para o sanduíche precisa escolher os ingredientes                            ");
	    	 System.out.println("__________________________________________________________________________________________________________________ ");
	    	 System.out.println(" ");
	    	 sanduiche.escolherIngrediente();
	    	 break;
	     case 2:
	 		 Massa massa = new Pizza();
	    	 System.out.println("                      Você escolheu Massa. Dentre as massas, você pode escolher entre:                      ");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 System.out.println(" ");
	    	 massa.escolherTipoDeMassa();
	       break;
	             
	     case 3:
	    	Bolo bolo = new Bolo();
	    	 System.out.println("                    Você escolheu Bolo. Escolha cobertura, massa e recheio.");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 bolo.escolherBolo();    	 
	    	 break;	 
	     case 4:
	    	 Salgado salgado = new SalgadoAssado();
	    	 System.out.println("                      Você escolheu Salgado. Dentre os salgados, você pode escolher entre:                      ");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 System.out.println(" ");
	    	 salgado.escolherTipoDeSalgado();
	       break;
	     default:
	       System.out.println("Número inválido");
	  }
		agradecimento();			
	}

	public static void agradecimento() {
		System.out.println(" _______________________________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println("                Agradecemos a sua preferência e desejamos bom apetite!!!");
		System.out.println(" ");	
	}
	

	





	










		
	
	}

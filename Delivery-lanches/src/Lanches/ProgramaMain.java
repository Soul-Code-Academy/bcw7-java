package Lanches;

import java.util.Scanner;


public class ProgramaMain {
	public static void main(String[] args) {
		
		int escolhaDoTipoLanche;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("--------------------------Bem vindos ao Delivery do Java Express-------------------------");
		System.out.println("");
		System.out.println("-----------------------------------Menu de opções------------------------------------------");
		System.out.println("				[ 1 ] - Sanduíches ..... R$ 10,00 + 2,00 por ingrediente escolhido");
		System.out.println("				[ 2 ] - Massas ......... R$ (depende do sabor escolhido)");
		System.out.println("				[ 3 ] - Bolos .......... R$ 120,00");
		System.out.println("				[ 4 ] - Salgados ....... (depende do salgado");
		System.out.println("Escolha a opção desejada:");
		
		escolhaDoTipoLanche = ler.nextInt();
		
		switch (escolhaDoTipoLanche) {
	     case 1:
	       	 System.out.println("                              Para o sanduíche precisa escolher os ingredientes                            ");
	    	 System.out.println("__________________________________________________________________________________________________________________ ");
	    	 System.out.println(" ");
	    	 escolherIngrediente();
	    	 break;
	     case 2:
	    	 System.out.println("                      Você escolheu Massa. Dentre as massas, você pode escolher entre:                      ");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 System.out.println(" ");
	    	 escolherTipoDeMassa();
	       break;
	             
	     case 3:
	    	 System.out.println("                    Você escolheu Bolo. Escolha cobertura, massa e recheio.");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 escolherBolo();    	 
	    	 break;	 
	     case 4:
	    	 System.out.println("                      Você escolheu Salgado. Dentre os salgados, você pode escolher entre:                      ");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 System.out.println(" ");
	    	 escolherTipoDeSalgado();
	       break;
	     default:
	       System.out.println("Número inválido");
	  }
		agradecimento();
				
}
	
	public static void escolherIngrediente() {
		int escolhaDoIngrediente=11, contador=0;
		double distancia, quantIngrediente = -1;
		
		Sanduiche lanche1 = new Sanduiche();	
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("__________________________________________________________________________________________________________________");
		System.out.println("                            1 - queijo        2 - presunto       3 - bacon          4 - alface ");
		System.out.println("                            5 - tomate        6 - catupiry       7 - maionese       8 - abacaxi ");
		System.out.println("                            9 - batata Palha  10 - mostarda      0 - para encerrar a escollha");
		System.out.println(" ");
		System.out.println("                            Você pode escolher até 10 ingredientes: ");
		System.out.println("__________________________________________________________________________________________________________________");
		
		while ((contador < 10) && escolhaDoIngrediente != 0) {
					
			System.out.println("                        Digite o número do ingrediente ou [0] para encerrar a escolha ");
				
			escolhaDoIngrediente = lerDados.nextInt();
			
			switch (escolhaDoIngrediente) {
		     	case 1:
		     		lanche1.setIngrediente("queijo");
		     		break;
		     	case 2:
		     		lanche1.setIngrediente("presunto");
		     		break;
		     	case 3:
		     		lanche1.setIngrediente("bacon");
		     		break;
		     	case 4:
		     		lanche1.setIngrediente("alface");
		     		break;
		     	case 5:
		     		lanche1.setIngrediente("tomate");
		     		break;
		     	case 6:
		     		lanche1.setIngrediente("catupiry");
		     		break;	
		     	case 7:
		     		lanche1.setIngrediente("maionese");
		     		break;
		     	case 8:
		     		lanche1.setIngrediente("abacaxi");
		     		break;
		     	case 9:
		     		lanche1.setIngrediente("batata pallha");
		     		break;	
		     	case 10:
		     		lanche1.setIngrediente("mostarda");
		     		break;
		     	case 0:
		     		break;	
		     	default:
		       		System.out.println("Número inválido");
		     }
			
			contador++;
			quantIngrediente++;
			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
			lanche1.getIngrediente();
			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
			System.out.println(" ");		
		}
		
		lanche1.setPreco(10 + quantIngrediente * 2);
		lanche1.escolherQuantidade();
		mensagemTempoDeEntrega();
		distancia = lerDados.nextInt();
		lanche1.fecharPedido();
		lanche1.calcularTempo(distancia);
		
	}	
	
	public static void escolherTipoDeMassa() {
			int escolhaDoTipoMassa, escolhaTipo;
			double distancia;
			
			Scanner lerDados = new Scanner(System.in);
			Scanner ler2 = new Scanner(System.in);
			
			System.out.println("__________________________________Menu de opções____________________________________________________________");
			System.out.println(" ");
			System.out.println("                                  [ 1 ] - Macarrãoo..........R$ (escolher o tipo)");
			System.out.println("                                  [ 2 ] - Pizza .............R$ (escolher o sabor)");
			System.out.println("                                  [ 3 ] - Lasanha ...........R$ 45.90");
			System.out.println(" Escolha a opção desejada:");
			System.out.println("  ");
			
			
			escolhaDoTipoMassa = ler2.nextInt();
	       
			switch (escolhaDoTipoMassa) {
	       		case 1:
	       			Massa massa1 = new Macarrao();
	       			massa1.setMolho(massa1.escolherMolho());
	
	       			System.out.println("__________________________________Tipos de macarrão a escolher______________________________________________");
	       			System.out.println(" ");
	       			System.out.println("                                  [ 1 ] - Talaharim ...... R$ 28,40");
	       			System.out.println("                                  [ 2 ] - Pene ........... R$ 36,70");
	       			System.out.println("                                  [ 3 ] - Parafuso ....... R$ 39,00");
	       			System.out.println(" Escolha a opção desejada:");
	       			System.out.println("  ");
	       			
	       			escolhaTipo = lerDados.nextInt();
	       			switch (escolhaTipo) {
			     	case 1:
			     		massa1.setSabor("Talharim");
			     		massa1.setPreco(28.40);
			     		
			     		break;
			     	case 2:
			     		massa1.setSabor("Pene");
			     		massa1.setPreco(36.70);
			     		break;
			     	case 3:
			     		massa1.setSabor("Parafuso");
			     		massa1.setPreco(39.00);
			     		break;
			     	
			     	default:
			       		System.out.println("Número inválido");
			     }
	       			
	       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
	       			System.out.println("                           Você escolheu macarrão " + massa1.getSabor() + " e o molho escolhido foi: " + massa1.getMolho());
	       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
	       			massa1.escolherQuantidade();
	       			mensagemTempoDeEntrega();
	       			distancia = lerDados.nextInt();
	     			massa1.fecharPedido();
	     			massa1.calcularTempo(distancia);
	       			break;
	       		case 2:
	       			Massa massa2 = new Pizza();
	       			   			
	       			System.out.println("__________________________________Sabores de pizzas disponíveis______________________________________________");
	       			System.out.println(" ");
	       			System.out.println("                                  [ 1 ] - Calabreza ...... R$ 36,40");
	       			System.out.println("                                  [ 2 ] - Atum ........... R$ 40,60");
	       			System.out.println("                                  [ 3 ] - 4 queijos ...... R$ 41,00");
	       			System.out.println(" Escolha a opção desejada:");
	       			System.out.println("  ");
	       			
	       			escolhaTipo = lerDados.nextInt();
	       			switch (escolhaTipo) {
			     	case 1:
			     		massa2.setSabor("Calabreza");
			     		massa2.setPreco(36.40);
			     		
			     		break;
			     	case 2:
			     		massa2.setSabor("Atum");
			     		massa2.setPreco(40.60);
			     		break;
			     	case 3:
			     		massa2.setSabor("4 queijos");
			     		massa2.setPreco(41.00);
			     		break;
			     	
			     	default:
			       		System.out.println("Número inválido");
			     }
	       			
	       			
	       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
	       			System.out.println("                            Você escolheu pizza de " + massa2.getSabor()); 
	       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
	       			massa2.escolherQuantidade();
	       			mensagemTempoDeEntrega();
	       			distancia = lerDados.nextInt();
	       			massa2.fecharPedido();
	       			massa2.calcularTempo(distancia);
	       			break;
	       		case 3:
	       			Massa massa3 = new Lasanha();
	       			massa3.setPreco(45.90);
	       			massa3.setMolho(massa3.escolherMolho());
	       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
	       			System.out.println("                            Você escolheu lasanha e o molho escolhido foi: " + massa3.getMolho());
	       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
	       			massa3.escolherQuantidade();
	       			mensagemTempoDeEntrega();
	       			distancia = lerDados.nextInt();
	       			massa3.fecharPedido();
	       			massa3.calcularTempo(distancia);
	       			break;
	       		default:
	       			System.out.println("Número inválido");
	       }	
	}
		

	public static void escolherBolo() {
		
		int escolhaDoTipoBolo, escolha;
		double distancia;
			
		Scanner lerDadosBolo = new Scanner(System.in);
		Scanner ler3 = new Scanner(System.in);
		
		Bolo bolo = new Bolo();
		bolo.setPreco(120.00);
		
		System.out.println("  ");
			System.out.println("__________________________________Tipo de Massa____________________________");
			bolo.setMassa(" Massa de pão de ló");
			System.out.println("                                  [ 1 ] - Massa de pão de ló" );	
			bolo.setMassa("Massa genoise");
			System.out.println("                                  [ 2 ] - Massa genoise");
			bolo.setMassa(" Massa amanteigada");
			System.out.println("                                  [ 3 ] - Massa amanteigada");
			bolo.setMassa(" Massa chiffon");
			System.out.println("                                  [ 4 ] - Massa chiffon" );
			System.out.println(" Escolha a opção desejada:" );
			System.out.println("  ");
			
			escolhaDoTipoBolo = ler3.nextInt();
			
		switch (escolhaDoTipoBolo) {
	
       		case 1:  
       			
       			System.out.println("  ");
       			System.out.println("__________________________________Cobertura e Recheio____________");
       			System.out.println(" ");
       			System.out.println("                                  [ 1 ] - Cobertura de Pasta Americana e Recheio com Frutas.");
    			System.out.println("                                  [ 2 ] - Cobertura de Fondant e Recheio com Frutas.");
       			System.out.println("                                  [ 3 ] - Cobertura de Chantilly e Recheio com Frutas.");
       			System.out.println("                                  [ 4 ] - Cobertura de Buttercream e Recheio com Frutas.");
       			System.out.println("                                  [ 5 ] - Cobertura de Pasta Americana  e Recheio Cremoso.");
    			System.out.println("                                  [ 6 ] - Cobertura de Fondant  e Recheio Cremoso.");
       			System.out.println("                                  [ 7 ] - Cobertura de Chantilly  e Recheio Cremoso.");
       			System.out.println("                                  [ 8 ] - Cobertura de Buttercream  e Recheio Cremoso.");
       			System.out.println("                                  [ 9 ] - Cobertura de Pasta Americana  e Recheio Gourmet.");
    			System.out.println("                                  [ 10 ] - Cobertura de Fondant  e Recheio Gourmet.");
       			System.out.println("                                  [ 11 ] - Cobertura de Chantilly  e Recheio Gourmet.");
       			System.out.println("                                  [ 12 ] - Cobertura de Buttercream  e Recheio Gourmet.");
       			System.out.println("                                  [ 13 ] - Cobertura de Pasta Americana   e Recheio Clássico.");
    			System.out.println("                                  [ 14 ] - Cobertura de Fondant   e Recheio Clássico.");
       			System.out.println("                                  [ 15 ] - Cobertura de Chantilly  e Recheio Clássico.");
       			System.out.println("                                  [ 16 ] - Cobertura de Buttercream e Recheio Clássico."); 
       			System.out.println(" Escolha a opção desejada:");
       			System.out.println("  ");
       			
       			escolha = lerDadosBolo.nextInt();
       		
       			bolo.escolherQuantidade();
       			switch (escolha) {
       			
		     	case 1:
		     		bolo.setRecheioEcobertura("Cobertura de Pasta Americana e Recheio com Frutas.");
		     		break;
		     	case 2:
		     		bolo.setRecheioEcobertura("Cobertura de Fondant e Recheio com Frutas.");
		     		break;
		     	case 3:
		     		bolo.setRecheioEcobertura("Cobertura de Chantilly e Recheio com Frutas.");
		     		break;
		     	case 4:
		     		bolo.setRecheioEcobertura("Cobertura de Buttercream e Recheio com Frutas.");
		     		break; 
		     	case 5:
		     		bolo.setRecheioEcobertura("Cobertura de Pasta Americana  e Recheio Cremoso.");
		     		break; 
		     	case 6:
		     		bolo.setRecheioEcobertura("Cobertura de Fondant  e Recheio Cremoso.");
		     		break; 
		     	case 7:
		     		bolo.setRecheioEcobertura("Cobertura de Chantilly  e Recheio Cremoso.");
		     		break; 
		     	case 8:
		     		bolo.setRecheioEcobertura("Cobertura de Buttercream  e Recheio Cremoso.");
		     		break; 
		     	case 9:
		     		bolo.setRecheioEcobertura("Cobertura de Pasta Americana  e Recheio Gourmet.");
		     		break;
		     	case 10:
		     		bolo.setRecheioEcobertura("Cobertura de Fondant  e Recheio Gourmet.");
		     		break;
		     	case 11:
		     		bolo.setRecheioEcobertura("Cobertura de Chantilly  e Recheio Gourmet.");
		     		break;
		     	case 12:
		     		bolo.setRecheioEcobertura("Cobertura de Buttercream  e Recheio Gourmet.");
		     		break;	
		     	case 13:
		     		bolo.setRecheioEcobertura("Cobertura de Pasta Americana   e Recheio Clássico.");
		     		break;
		     	case 14:
		     		bolo.setRecheioEcobertura("Cobertura de Fondant   e Recheio Clássico.");
		     		break;
		     	case 15:
		     		bolo.setRecheioEcobertura("Cobertura de Chantilly  e Recheio Clássico.");
		     		break;
		     	case 16:
		     		bolo.setRecheioEcobertura("Cobertura de Buttercream e Recheio Clássico."); 
		     		break;
		 
		     	default:
		       		System.out.println("Número inválido");
       			}
					
				
		       	System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
	       			System.out.println("                           Você escolheu o bolo : " + bolo.getMassa() + " "  + bolo.getRecheioEcobertura());
	       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
	       		
	       			mensagemTempoDeEntrega();
	       			distancia = lerDadosBolo.nextInt();
		     		bolo.fecharPedido();
		     		bolo.calcularTempo(distancia);
		     		break;	       			
		}
		
}
		
		public static void escolherTipoDeSalgado() {
			int escolhaDoTipoSalgado, escolha;
			double distancia;
			
			Scanner lerDadosSalgado = new Scanner(System.in);
			Scanner ler4 = new Scanner(System.in);
			
			System.out.println("__________________________________Menu de opções____________________________________________________________");
			System.out.println(" ");
			System.out.println("                                  [ 1 ] - Salgado Assado...........R$ (escolher o nome)");
			System.out.println("                                  [ 2 ] - Salgado Frito ...........R$ (escolher o nome)");
			System.out.println(" Escolha a opção desejada:");
			System.out.println("  ");
				
			escolhaDoTipoSalgado = ler4.nextInt();
	       
			switch (escolhaDoTipoSalgado) {
	       		case 1:
	       			Salgado salgado1 = new SalgadoAssado();
	       			System.out.println("__________________________________Salgados a escolher______________________________________________");
	       			System.out.println(" ");
	       			System.out.println("                                  [ 1 ] - Esfiha .................... R$ 4,40");
	    			System.out.println("                                  [ 2 ] - Empada .................... R$ 6,70");
	       			System.out.println("                                  [ 3 ] - Mini Quiche ............... R$ 9,00");
	       			System.out.println("                                  [ 4 ] - Bolinho de Carne Seca  .... R$ 8,00");
	       			System.out.println(" Escolha a opção desejada:");
	       			System.out.println("  ");
	       			  
	       			escolha = lerDadosSalgado.nextInt();
	       			salgado1.escolherQuantidade();
	       			switch (escolha) {
			     	case 1:
			     		salgado1.setNome("Esfiha");
			     		salgado1.setPreco(4.40); 		
			     		break;
			     	case 2:
			     		salgado1.setNome("Empada");
			     		salgado1.setPreco(6.70);
			     		break;
			     	case 3:
			     		salgado1.setNome("Mine Quiche");
			     		salgado1.setPreco(9.00);
			     		break;
			     	case 4:
			     		salgado1.setNome("Bolinho de Carne Seca");
			     		salgado1.setPreco(8.00);
			     		break; 	
			     	default:
			       		System.out.println("Número inválido");
	       			}
		       			
		       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
		       			System.out.println("                           Você escolheu salgado assado " + salgado1.getNome());
		       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
		       			mensagemTempoDeEntrega();
		       			distancia = lerDadosSalgado.nextInt();
		     			salgado1.fecharPedido();
		     			salgado1.calcularTempo(distancia);
		       			break;
	       				
	       	case 2:
	       		
		       	Salgado salgado2 = new SalgadoFrito();
		       
		       	System.out.println("__________________________________Salgados a escolher______________________________________________");
				System.out.println(" ");
				System.out.println("                                  [ 1 ] - Pastel ...... R$ 6,00");
				System.out.println("                                  [ 2 ] - Coxinha ..... R$ 5,50");
				System.out.println("                                  [ 3 ] - Quibe ....... R$ 4,00");
				System.out.println("                                  [ 4 ] - Croquete  ... R$ 4,80");
				System.out.println(" Escolha a opção desejada:");
				System.out.println("  ");
				
				escolha = lerDadosSalgado.nextInt();
				salgado2.escolherQuantidade();
				switch (escolha) {
	     	case 1:
	     		salgado2.setNome("Pastel");
	     		salgado2.setPreco(6.00);
	     		break;
	     	case 2:
	     		salgado2.setNome("Coxinha");
	     		salgado2.setPreco(5.50);
	     		break;
	     	case 3:
	     		salgado2.setNome("Quibe");
	     		salgado2.setPreco(4.00);
	     		break;
	     	case 4:
	     		salgado2.setNome("Croquete");
	     		salgado2.setPreco(4.80);
	     		break;
	     	  	
	     	default:
	       		System.out.println("Número inválido");
				}
					
				System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
       			System.out.println("                            Você escolheu salgado frito " + salgado2.getNome() + salgado2.getQuantidade());
       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
       			
  
       			mensagemTempoDeEntrega();
       			distancia = lerDadosSalgado.nextInt();
       		
       			salgado2.fecharPedido();
       			salgado2.calcularTempo(distancia);
       			break;       		   			
		
			}	
		
	}
	
				
		public static void mensagemTempoDeEntrega() {
		    pularLinhas(1);
			System.out.println(" _______________________________________________________________________________________________________________ ");
			System.out.println(" ");
			System.out.println("                Para cálculo do tempo de entrega, precisamos saber a distância até sua casa! ");
			System.out.println(" ");
			System.out.println(" Qual a distância da sua casa? (em km) ");
		}
		
		
		public static void pularLinhas(int quantLinhas)
	    {
	            for(int i = 0; i < quantLinhas; i++)
	            System.out.println("");
	    }
		
		public static void agradecimento() {
			System.out.println(" _______________________________________________________________________________________________________________ ");
			System.out.println(" ");
			System.out.println("                Agradecemos a sua preferência e desejamos bom apetite!!!");
			System.out.println(" ");
			
		}
		
		
	
	}

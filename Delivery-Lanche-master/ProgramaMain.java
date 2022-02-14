package Lanches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaMain {
	public static void main(String[] args) {
		
		int escolhaDoTipoLanche;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("--------------------------Bem vindos do Delivery do Java Express---------------------------");
		System.out.println("");
		System.out.println("-----------------------------------Menu de opções------------------------------------------");
		System.out.println("				[ 1 ] - Sanduíches ..... R$ 10,00 + 2,00 por ingrediente escolhido");
		System.out.println("				[ 2 ] - Massas ......... R$ (depende do sabor escolhido)");
		System.out.println("				[ 3 ] - Bolos .......... R$ 40,90");
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
	    	 System.out.println("                    Você escolheu Bolo. Digite as opções de Massa, Recheio e Cobertura");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 escolherBolo();
	    	
	    	 
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
		     		lanche1.setIngrediente("preseunto");
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
		mensagemTempoDeEntrega();
		distancia = lerDados.nextInt();
		lanche1.fecharPedido();
		lanche1.calcularTempo(distancia);
		
	}	
	
	public static void escolherTipoDeMassa() {
			int escolhaDoTipoMassa, escolhaTipoPizza;
			double distancia;
			Scanner lerDados = new Scanner(System.in);
			
			Scanner ler2 = new Scanner(System.in);
			
			
			System.out.println("__________________________________Menu de opções____________________________________________________________");
			System.out.println(" ");
			System.out.println("                                  [ 1 ] - Macarrão...........R$ (escolher o tipo)");
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
	       			
	       			escolhaTipoPizza = lerDados.nextInt();
	       			switch (escolhaTipoPizza) {
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
	       			mensagemTempoDeEntrega();
	       			distancia = lerDados.nextInt();
	     			massa1.fecharPedido();
	     			massa1.calcularTempo(distancia);
	       			break;
	       		case 2:
	       			Massa massa2 = new Pizza();
	       			massa2.setMolho(massa2.escolherMolho());
	       			
	       			System.out.println("__________________________________Sabores de pizzas disponíveis______________________________________________");
	       			System.out.println(" ");
	       			System.out.println("                                  [ 1 ] - Calabreza ...... R$ 36,40");
	       			System.out.println("                                  [ 2 ] - Atum ........... R$ 40,60");
	       			System.out.println("                                  [ 3 ] - 4 queijos ...... R$ 41,00");
	       			System.out.println(" Escolha a opção desejada:");
	       			System.out.println("  ");
	       			
	       			escolhaTipoPizza = lerDados.nextInt();
	       			switch (escolhaTipoPizza) {
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
	       			System.out.println("                            Você escolheu pizza de " + massa2.getSabor() + " e o molho escolhido foi: " + massa2.getMolho());
	       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
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
		String tipoMassa, recheio,cobertura;
		Scanner ler3 = new Scanner(System.in);
		double distancia;
		
		
		
		
		 System.out.println("-----------------------------------Qual o tipo de massa você quer?-----------------------------------------");
    	 tipoMassa = ler3.next();
    	 
    	 System.out.println("-----------------------------------Qual o tipo de recheio você quer?---------------------------------------");
    	 recheio = ler3.next();
    	 
    	 System.out.println("-----------------------------------Qual o tipo de cobertura você quer?-------------------------------------");
    	 cobertura = ler3.next();
    	 
    	 Bolo bolo1 = new Bolo(40.90);
    	 bolo1.setMassa(tipoMassa);
    	 bolo1.setRecheio(recheio);
    	 bolo1.setCobertura(cobertura);
    	 
    	 System.out.println("");
    	 System.out.println("----------------------------------------------------------------------------------------------------------- ");
    	 System.out.println("Você escolheu um bolo com massa de: " + bolo1.getMassa() + " com recheio de: " + bolo1.getRecheio() + " e cobertura de:" + bolo1.getCobertura());
    	 System.out.println("----------------------------------------------------------------------------------------------------------- ");
    	 
    	 mensagemTempoDeEntrega();
    	 distancia = ler3.nextInt();
    	 bolo1.fecharPedido();
    	 bolo1.calcularTempo(distancia);
   	}
	
	
		
	
		
	public static void mensagemTempoDeEntrega() {
	    pularLinhas(1);
		System.out.println(" _______________________________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println("                Para cálculo do tempo de entrega, precisamos saber a distãncia até sua casa! ");
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

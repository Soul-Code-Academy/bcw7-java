package Lanches;

import java.util.Scanner;

//Subclasse da classe Lanche
public abstract class Massa extends Lanche{
	
	//Atributos
	private String molho;
	private String molhoEscolhido;
	private String sabor;
	private int escolhaDoTipoMolho;
	
	//Consructor
	public Massa () {}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	
	public String getMolho() {
		return this.molho;
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}

	//Método comum as subclasses Massa, Lasanha
	public String escolherMolho() {
					
		System.out.println("                                          Você também deve escolher o molho:");
		System.out.println("");
		   
			Scanner ler3 = new Scanner(System.in);
	       
			System.out.println("____________________________________________Menu de opções____________________________________________________________");
			System.out.println("                                            [ 1 ] - Molho ao Sugo ");
			System.out.println("                                            [ 2 ] - Molho branco");
			System.out.println("                                            [ 3 ] - Molho bolonhesa");
			System.out.println(" Escolha a opção desejada:");
	       
			escolhaDoTipoMolho = ler3.nextInt();
	       
			switch (escolhaDoTipoMolho) {
				case 1:
	       			molhoEscolhido =  "Molho ao Sugo";
	       			break;
	       		case 2:
	       			molhoEscolhido = "Molho branco";
	       			break;
	       		case 3:
	       			molhoEscolhido = "Molho bolonhesa";
	       			break;
	       		default:
	       			System.out.println("Numero inválido");
	       }
		return molhoEscolhido;
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
       			massa1.cliente();
       			mensagemTempoDeEntrega();
       			distancia = lerDados.nextInt();
     			massa1.fecharPedido();
     			massa1.calcularTempo(distancia);
     			massa1.notaFiscal();
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
       			massa3.cliente();
       			mensagemTempoDeEntrega();
       			distancia = lerDados.nextInt();
       			massa3.fecharPedido();
       			massa3.calcularTempo(distancia);
       			massa3.notaFiscal();
       			break;
       		default:
       			System.out.println("Número inválido");
       }	
}
	
	

	public void notaFiscal() {
		super.notaFiscal();
		System.out.println("Massa: " + getSabor());
	}
	
	public void fecharPedido() {
		super.fecharPedido();	
	}
	
	public void calcularTempo() {
		super.calcularTempo(getTempoTotal());
	}
	
}

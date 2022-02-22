package Lanches;

import java.util.Scanner;

//Subclasse da super classe Lanche
public class Bolo extends Lanche{

	private String massa;
	private String recheioEcobertura;
	
	//Constructor tem que ter o mesmo nome da classe
	public Bolo() {}
	
	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheioEcobertura() {
		return recheioEcobertura;
	}

	public void setRecheioEcobertura(String recheioEcobertura) {
		this.recheioEcobertura = recheioEcobertura;
	}

	public void notaFiscal() {
		super.notaFiscal();
		System.out.println("Bolo: " + getMassa() + " " + getRecheioEcobertura());	
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
       			bolo.cliente();
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
		     		bolo.notaFiscal();
		     		break;	       			
		}
		
}
		

	
}
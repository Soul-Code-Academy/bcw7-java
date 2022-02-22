package Lanches;

import java.util.Scanner;

	//Subclasse da classe Lanche
	public abstract class Salgado extends Lanche{

	//Atributos
	private String tipo;
	private String nome;	
	
	//Constructor
	public Salgado() {}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void calcularTempo() {
		super.calcularTempo(getTempoTotal());
	}

	public void fecharPedido(){
		super.fecharPedido();
	}
	
	public void notaFiscal() {
		super.notaFiscal();
		System.out.println("Salgado: " + getNome()); 
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
	       			salgado1.cliente();
	     			salgado1.fecharPedido();
	     			salgado1.calcularTempo(distancia);
	     			salgado1.notaFiscal();
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
	   			salgado2.cliente();
	   			salgado2.fecharPedido();
	   			salgado2.calcularTempo(distancia);
	   			salgado2.notaFiscal();
	   			break;       		   			
		
			}	
	}

}

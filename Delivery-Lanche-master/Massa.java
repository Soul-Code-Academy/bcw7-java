package Lanches;

import java.util.Scanner;

public abstract class Massa extends Lanche{
	
	private double preco;
	private String molho;
	private double tempoTotal;
	private int escolhaDoTipoMolho;
	private String molhoEscolhido;
	private String sabor;
	
	
	
	
	public Massa() {
	//	super();
	//	this.preco = preco;
		// TODO Auto-generated constructor stub
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	//public double getPreco() {
	//	return super.preco;
	//}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

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
	       			System.out.println("Número inválido");
	       }
		return molhoEscolhido;
	}
	
	public String getMolho() {
		return this.molho;
	}
	
	@Override
	public void calcularTempo(double distancia) {
		double inteira,resto;
		this.tempoTotal = (distancia*10) + 30;
		
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		System.out.println("  Tempo total para entrega: " + (int)inteira + " hora e " + resto + " minutos" );
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		
		
	}
	
	public abstract void fecharPedido();
	
	
	
}

package Lanches;

import java.util.Scanner;

//Subclasse da classe Lanche
public abstract class Massa extends Lanche{
	
	
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
	


	public void fecharPedido() {
		super.fecharPedido();	
	}
	
	public void calcularTempo() {
		super.calcularTempo(getTempoTotal());
	

}
		

}

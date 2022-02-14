package Lanches;

import java.util.Scanner;

	//Super classe das classes Salgado, Massa, Bolo, Sanduiche
	public abstract class Lanche {

	private double preco;
	private double tempoTotal;
	private int quantidade;
	
	//Constructor tem que ter o mesmo nome da classe
	public Lanche() {}


	public double getTempoTotal() {
		return tempoTotal;
	}


	public void setTempoTotal(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//Métodos comuns a todas as subclasses 
	public void escolherQuantidade() {
		
		 Scanner entrada = new Scanner(System.in);	
	     System.out.print("Digite a quantidade: " + getQuantidade());
	     quantidade = entrada.nextInt();
	}

	public void calcularTempo(double distancia) {
		double inteira,resto;
		this.tempoTotal = (distancia * 10) + 30;
		
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		System.out.println("  Tempo total para entrega: " + (int)inteira + " horas e " + resto + " minutos" );
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		
	}
	
	public void fecharPedido() {	
		System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		System.out.printf("  Seu pedido ficou em: R$ %.2f%n",  + (getPreco()* getQuantidade()));
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}


	
}







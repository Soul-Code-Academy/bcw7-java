package Lanches;

import java.util.Scanner;

	//Subclasse da classe Lanche
	public abstract class Salgado extends Lanche{

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

		
}

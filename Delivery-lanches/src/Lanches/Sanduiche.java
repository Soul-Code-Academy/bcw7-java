package Lanches;

import java.util.ArrayList;
import java.util.List;

	//Subclasse da super classe Lanche
	public class Sanduiche extends Lanche{
			
	//Constructor
	public Sanduiche() {}
	
	List<String> ingredientes = new ArrayList<>();
	
	public void setIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
		
	}
	
	public void getIngrediente() {
		System.out.println("  Você escolheu os ingredientes: " + this.ingredientes);
		
	}

}

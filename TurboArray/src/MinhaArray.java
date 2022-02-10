//Pesquisar sobre o List


import java.util.ArrayList;

public class MinhaArray {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<String> cores = new ArrayList<>();
		
		numeros.add(12);
		numeros.add(92);
		numeros.add(19);
		numeros.add(55);
		numeros.add(83);
		numeros.add(4,1);
		System.out.println(numeros);
		System.out.println(numeros.get(0));
		System.out.println(numeros.get(3));
		
		for (int n:numeros) {
			System.out.println(n);
		}
		
		System.out.println("--------------------------------------------------");
		
		cores.add("preto");
		cores.add("azul");
		cores.add("branco");
		cores.add("rosa");
		cores.add(1,"verde");
		
		System.out.println(cores);
		System.out.println(cores.get(0));
		System.out.println(cores.get(3));
		
		for (String c:cores) {
			System.out.println(c);
			
		}
//			cores.clear();
			
		System.out.println(cores.size());
			
		System.out.println(cores.remove(0));
		
		System.out.println(cores);
		
		System.out.println(cores.indexOf("preto"));
		
		System.out.println(cores.indexOf("rosa"));
		
		System.out.println("--------------------------------------------------");
		
//		Sempre que houver uma operação crítica (passível de erro), devemos tratar o possível erro
		
		try {
			System.out.println(cores.get(10));
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		System.out.println("--------------------------------------------------");
		
		try {
			System.out.println(cores.get(1));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Erro: Índice inexistente");
		}catch(Exception e) {
			System.out.println("Erro: Não identificado");
		}finally{
			System.out.println("Fim do try");
		}
			System.out.println("--------------------------------------------------");
		
		try {
			System.out.println(cores.get(10));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Erro: Índice inexistente");
		}catch(Exception e) {
			System.out.println("Erro: Não identificado");
		}finally{
			System.out.println("Fim do try");
		}
		
//		Disparar uma excessão propositalmente - throw
		
		int nota1 = 60;
		
		if(nota1 > 50) {
			throw new IllegalArgumentException("Valor de nota inválido");
		}
	}	
}


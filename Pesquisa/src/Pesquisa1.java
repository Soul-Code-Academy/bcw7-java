//Arrays.fill() em Java com exemplos

//java.util.Arrays.fill() método está na classe java.util.Arrays. Este método atribui o valor do tipo de dados especificado a cada elemento da faixa especificada do array especificado.


import java.util.Arrays; 
public class Pesquisa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
// Programa Java para preencher uma subarray de determinada matriz.
		
// Podemos preencher toda a matriz.
		
		int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2}; 

		  
// Para preencher a matriz completa com um determinado valor 

        Arrays.fill(ar, 10); 

        System.out.println("Matriz completamente preenchida" + 

                  " com 10\n" + Arrays.toString(ar)); 

    
//	Podemos preencher parte da matriz.
	
//	Programa Java para preencher uma matriz de subarray com  
//	dado valor. 
	
	 int arr[] = {2, 2, 2, 2, 2, 2, 2, 2, 2}; 

	  
//Preencha do índice 1 ao índice 4.
	 
     Arrays.fill(arr, 1, 5, 10); 


     System.out.println(Arrays.toString(ar)); 
     
     
// Podemos preencher uma matriz multidimensional Podemos usar um loop para preencher uma matriz multidimensional.

// 1)Preenncha matriz 2D

    
// Programa Java para preencher uma matriz multidimensional com dado valor. 
     
     int [][]arrr = new int [3][4]; 

     

// Preencha cada linha com 10.

     for (int[] row : arrr) 

         Arrays.fill(row, 10); 

     System.out.println(Arrays.deepToString(arrr)); 
     
//  2) Preencha a matriz 3D

//	Programa Java para preencher uma matriz multidimensional com dado valor. 

     int[][][] arrrr = new int[3][4][5]; 

 
// Encha cada linha com -1.

     for (int[][] row : arrrr) { 

         for (int[] rowColumn : row) { 

             Arrays.fill(rowColumn, -1); 

         } 

     } 



     System.out.println(Arrays.deepToString(arrrr)); 

 } 
	}



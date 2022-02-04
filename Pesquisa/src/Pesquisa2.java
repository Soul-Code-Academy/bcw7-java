
//System.arraycopy() em Java
//
//java.lang.A classe System fornece métodos úteis para entrada e saída padrão, para carregar arquivos e bibliotecas ou para acessar propriedades externamente definidas. O método java.lang.System.arraycopy() copia uma matriz de origem de uma posição inicial específica para a matriz de destino da posição mencionada. Não. de argumentos a serem copiados são decididos por argumento len.
//Os componentes em source_Position para source_Position + comprimento – 1 são copiados para o conjunto de destinos de destination_Position a destination_Position + comprimento – 1
//
//Declaração de Classe
//
//public final class System
//   extends Object


import java.lang.*;
   
   public class Pesquisa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int s[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	        int d[] = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
	  
	        int source_arr[], sourcePos, dest_arr[], destPos, len;
	        source_arr = s;
	        sourcePos = 3;
	        dest_arr = d;
	        destPos = 5;
	        len = 4;
	  
	        // Imprimir elementos da fonte
	        System.out.print("source_array : ");
	        for (int i = 0; i < s.length; i++)
	            System.out.print(s[i] + " ");
	        System.out.println("");
	  
	        System.out.println("sourcePos : " + sourcePos);
	         
	        //Imprimir elementos da fonte
	        System.out.print("dest_array : ");
	        for (int i = 0; i < d.length; i++)
	            System.out.print(d[i] + " ");
	        System.out.println("");
	         
	        System.out.println("destPos : " + destPos);
	         
	        System.out.println("len : " + len);
	         
	        // Uso do método arraycopy()
	        System.arraycopy(source_arr, sourcePos, dest_arr, 
	                                            destPos, len);
	         
	        // Imprimir elementos de destino após
	        System.out.print("final dest_array : ");
	        for (int i = 0; i < d.length; i++)
	            System.out.print(d[i] + " ");

	}

}

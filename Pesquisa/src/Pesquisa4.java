//Método Java.util.Arrays.binarySearch()
//
//Descrição
//O método java.util.Arrays.binarySearch (Object[] a, Object key) pesquisa o array especificado para o objeto especificado usando o algoritmo de pesquisa binária. A matriz será classificada em ordem ascendente de acordo com a ordenação natural de seus elementos antes de fazer esta chamada. Se não for classificado, os resultados são indefinidos.
//
//Declaração
//A seguir está a declaração para java.util.Arrays.binarySearch() método
//
//public static int binarySearch(Object[] a, Object key)
//Parâmetros
//a − Esta é a matriz a ser pesquisada.
//
//chave − Este é o valor a ser pesquisado.
//
//Valor de retorno
//Este método retorna o índice da chave de pesquisa, se estiver contida no array, outra forma retornar (-(ponto de inserção) - 1). O ponto de inserção é o ponto em que a chave seria inserida na matriz: o índice do primeiro elemento maior que a chave, ou um.comprimento se todos os elementos da matriz forem inferiores à chave especificada.
//
//Exceção
//ClassCastException − Se a chave de pesquisa não for comparável aos elementos do array.
//
//Exemplo
//O exemplo a seguir mostra o uso do método java.util.Arrays.binarySearch().

import java.util.Arrays;
public class Pesquisa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inicializando matriz não-variada
	      Object arr[] = {10,2,22,69};

	      // sorting array
	      Arrays.sort(arr);

	      // vamos imprimir todos os elementos disponíveis
	      System.out.println("A matriz classificada é:");
	      for (Object number : arr) {
	         System.out.println("Number = " + number);
	      }

	      // entrando o valor a ser pesquisado
	      int searchVal = 22;

	      int retVal = Arrays.binarySearch(arr,searchVal);

	      System.out.println("O índice do elemento 22 é : " + retVal);
	}

}

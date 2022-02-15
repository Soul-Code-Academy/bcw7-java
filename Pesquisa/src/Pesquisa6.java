

//Lista Java
//
//A lista em Java fornece a facilidade para manter a coleção ordenada. Ele contém os métodos baseados em índices para inserir, atualizar, excluir e pesquisar os elementos. Ele pode ter os elementos duplicados também. Também podemos armazenar os elementos nulos da lista.
//
//A interface Lista é encontrada no pacote java.util e herda a interface Collection. É uma fábrica de interface ListIterator. Através do ListIterator, podemos iterar a lista em direções para a frente e para trás. As classes de implementação da interface List são ArrayList, LinkedList, Stack e Vector. O ArrayList e o LinkedList são amplamente utilizados na programação Java. A classe Vector está preterida desde Java 5.
//
//Declaração de interface de lista
//
//interface pública Lista<E> estende Coleção<E>
//
//Lista Java vs ArrayList
//Lista é uma interface, enquanto o ArrayList é a classe de implementação da Lista.
//
//Como criar lista
//
//As classes ArrayList e LinkedList fornecem a implementação da interface List. Vejamos os exemplos para criar a Lista:
//	
//	Criando uma lista de string tipo usando ArrayList  
//	Lista<String> list=nova ArrayList<String>();
//	  
//	Criando uma lista de tipos integer usando ArrayList  
//	Lista<Integer> lista=novo ArrayList<Integer>();
//	  
//	Criando uma lista de tipos de livro usando ArrayList  
//	Lista<Book> lista=nova ArrayList<Book>();
//	  
//	Criando uma lista de string tipo usando o LinkedList  
//	Lista<String> lista=nova Lista de LinkedList<String>();
//
//Em suma, você pode criar a lista de qualquer tipo. As classes ArrayList<T> e LinkedList<T> são usadas para especificar o tipo. Aqui, T denota o tipo.
//
//Java ListIterator Interface
//ListIterator Interface é usado para atravessar o elemento em uma direção para trás e para a frente.
//
//Declaração de interface do ListIterator
//interface pública ListIterator<E> estende Iterator<E>



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class Pesquisa6 {
	
	public static void main(String args[]){  

// Exemplo da lista Java
//	Vejamos um exemplo simples de Lista onde estamos usando a classe ArrayList como a implementação.


	// ‎Criando uma lista‎   
	 List<String> list=new ArrayList<String>();  
	 // ‎Adicionando elementos na Lista‎   
	 list.add("Manga"); 
	 list.add("Maçã");  
	 list.add("Banana");  
	 list.add("Bacupari");  
	 // ‎Iterando o elemento Lista usando para cada loop‎   
	 for(String fruit:list)  
	  System.out.println(fruit); 
	 System.out.println("______________________________________________________________________________________");

//Como converter o Array em Lista
//Podemos converter o Array em Lista atravessando o array e adicionando o elemento na lista um por um usando o método list.add(). Vejamos um exemplo simples para converter elementos de matriz em Lista.
	 
	//Criando matriz  
	 String[] array={"Java","Python","PHP","C++"};  
	 System.out.println("Printing Array: "+Arrays.toString(array));  
	 //Conversão de matriz em lista  
	 List<String> list1=new ArrayList<String>();  
	 for(String lang:array){  
	 list1.add(lang);  
	 }  
	 System.out.println("Printing List: "+list1); 
	 
	 System.out.println("______________________________________________________________________________________");

	 
//Como converter lista para matriz
//Podemos converter a Lista para Array chamando o método list.toArray(). Vejamos um exemplo simples para converter elementos de lista em matriz.

	 List<String> fruitList = new ArrayList<>();    
	 fruitList.add("Manga");    
	 fruitList.add("Banana");    
	 fruitList.add("Uva");    
	 fruitList.add("Morango");    
	 // Conversão de ArrayList para Array   
	 String[] array1 = fruitList.toArray(new String[fruitList.size()]);    
	 System.out.println("Printing Array: "+Arrays.toString(array1));  
	 System.out.println("Printing List: "+fruitList); 
	 
	 System.out.println("______________________________________________________________________________________");

	 
//Obter e definir elemento na lista
//O método get() retorna o elemento no índice dado, enquanto o método set() altera ou substitui o elemento.
	 
	// Criando uma lista  
	 List<String> list2=new ArrayList<String>();  
	 //Adicionando elementos na Lista   
	 list2.add("Manga");  
	 list2.add("Pêra");  
	 list2.add("Banana");  
	 list2.add("Ameixa");  
	 //Acessando o elemento     
	 System.out.println("Returning element: "+list2.get(1));///ele vai retornar o 2º elemento, porque o índice começa a partir de 0
	 //Mudando o elemento  
	 list2.set(1,"Dates");  
	 // Iterando o elemento Lista usando para cada loop   
	 for(String fruit:list2)  
	  System.out.println(fruit);
	 
	 System.out.println("______________________________________________________________________________________");

	 
//	 
//Como classificar lista
//Existem várias maneiras de classificar a Lista, aqui vamos usar o método Collections.sort() para classificar o elemento de lista. O pacote java.util fornece uma classe de utilidade Coleções que tem o método estático tipo(). Usando o método Collections.sort(), podemos facilmente classificar qualquer Lista.
	 
	 //  Criando uma lista de frutas  
	  List<String> list5=new ArrayList<String>();  
	  list5.add("Mango");  
	  list5.add("Apple");  
	  list5.add("Banana");  
	  list5.add("Grapes");  
	  //  Classificando a lista  
	  Collections.sort(list5);  
	   //   Lista de travessia através do loop para cada  
	  for(String fruit:list5)  
	    System.out.println(fruit);  
	      
	 System.out.println("Sorting numbers...");  
	  // Criando uma lista de números  
	  List<Integer> list6=new ArrayList<Integer>();  
	  list6.add(21);  
	  list6.add(11);  
	  list6.add(51);  
	  list6.add(1);  
	  //  Classificando a lista  
	  Collections.sort(list6);  
	   // Lista de travessia através do loop para cada
	  for(Integer number:list6)  
	    System.out.println(number);  
	  
	  System.out.println("______________________________________________________________________________________");

	  
//	  Exemplo de Interface ListIterator
	  
	  List<String> al=new ArrayList<String>();    
      al.add("Amit");    
      al.add("Vijay");    
      al.add("Kumar");    
      al.add(1,"Sachin");    
      ListIterator<String> itr=al.listIterator();    
      System.out.println("Atravessando elementos na direção para a frente");    
      while(itr.hasNext()){    
            
      System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
      }    
      System.out.println("Atravessando elementos na direção retrógrada");    
      while(itr.hasPrevious()){    
        
      System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
      }   
      
      System.out.println("______________________________________________________________________________________");

      
//Exemplo de Lista: Livro
//Vamos ver um exemplo de Lista onde estamos adicionando os Livros.
      
      class Book {  
    	  int id;  
    	  String name,author,publisher;  
    	  int quantity;  
    	  public Book(int id, String name, String author, String publisher, int quantity) {  
    	      this.id = id;  
    	      this.name = name;  
    	      this.author = author;  
    	      this.publisher = publisher;  
    	      this.quantity = quantity;  
    	  }  
    	 }
      
      // Criando lista de livros  
      List<Book> list7=new ArrayList<Book>();  
      //Criando livros  
      Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
      Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
      Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
      //Adicionando livros à lista    
      list7.add(b1);  
      list7.add(b2);  
      list7.add(b3);  
      //   Lista de travessia  
      for(Book b:list7){  
      System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
      }  
      
	}
	
	
}

//PESQUISANDO ELEMENTOS EM VETOR USANDO ÍNDICE EM JAVA

//O Vector implementa uma matriz dinâmica que significa que pode aumentar ou diminuir conforme necessário. Como uma matriz, ele contém componentes que podem ser acessados ​​por meio de um índice inteiro. Um elemento de um vetor pode ser pesquisado usando um índice com métodos diferentes. Suponha que se o elemento não estiver presente no Vector, o método retornará -1.
//
//Método 1: (Usando indexOf (Object o) )
//
//Declaração
//
//public int indexOf(Object o)
//Sintaxe:
//
//Vector.indexOf(Object element)
//Parâmetros: este método aceita um elemento de parâmetro obrigatório do tipo Vector. Ele especifica o elemento cuja ocorrência deve ser verificada no Vector
//
//Valor de retorno: este método retorna o índice ou posição da primeira ocorrência do elemento no vetor. Caso contrário, ele retornará -1 se o elemento não estiver presente no vetor. O valor retornado é do tipo inteiro.
//
//// Searching Elements in Vector Using Index in Java
//import java.util.Vector;
//  
//public class GFG {
//    
//    public static void main(String args[])
//    {
//        // initialization Of Vector
//        Vector<String> details = new Vector<>(10);
//  
//        // Adding Elements To The
//        // Vector
//        details.add("Geeks For Geeks");
//        details.add("Welcome");
//        details.add("Bob");
//        details.add("Hello");
//        details.add("Geeks For Geeks");
//  
//        // Searching The Index Of Element
//        System.out.println(
//            "The index of element Geeks For Geeks in Vector is: "
//            + details.indexOf("Geeks For Geeks"));
//        System.out.println(
//            "The index of element 2100 in Vector is: "
//            + details.indexOf(2100));
//    }
//}
//Saída
//O índice do elemento Geeks For Geeks em vetor é: 0
//O índice do elemento 2100 no vetor é: -1
//Método 2: (Usando lastIndexOf (Object o) )
//
//Declaração
//
//public int lastIndexOf(Object o)
//Sintaxe:
//
//Vector.lastIndexOf(Object element)
//Parâmetros: o elemento de parâmetro é do tipo Vector. Refere-se ao elemento cuja última ocorrência deve ser verificada.
//
//Valor de retorno: o método retorna a posição da última ocorrência do elemento no vetor. Se o elemento não estiver presente no Vetor, o método retornará -1. O valor retornado é do tipo inteiro.
//
//// Searching Elements in Vector
//// Using Index in Java
//import java.util.Vector;
//  
//public class GFG {
//    
//    public static void main(String args[])
//    {
//        // initialization Of Vector
//        Vector<String> details = new Vector<>(10);
//  
//        // Adding Elements To The
//        // Vector
//        details.add("Geeks For Geeks");
//        details.add("Welcome");
//        details.add("Bob");
//        details.add("Hello");        
//        details.add("Geeks For Geeks");
//  
//        // print an element using it's index
//        System.out.println(
//            "The index of element Geeks For Geeks in Vector is: "
//            + details.lastIndexOf("Geeks For Geeks"));
//    }
//}
//Saída
//
//O índice do elemento Geeks For Geeks in Vector é: 4
//Método 3: (Usando o método indexOf (Object, int))
//
//Declaração
//
//public int indexOf(Object o, int Starting_Index)
//Sintaxe
//
//Vector.indexOf(Object, int)
//Parâmetros:
//
//Starting_index: É um índice onde começar a procurar por um elemento na direção para frente.
//o: é um elemento a ser pesquisado.
//Valor de retorno: o índice da primeira ocorrência do objeto (o) neste vetor, pesquisando a partir do índice_início fornecido
//
//// Searching Elements in Vector Using Index in Java
//import java.util.Vector;
//  
//public class GFG {
//    
//    public static void main(String args[])
//    {
//        // initialization Of Vector
//        Vector<String> details = new Vector<>(10);
//  
//        // Adding Elements To The
//        // Vector
//        details.add("Geeks For Geeks");
//        details.add("Welcome");
//        details.add("Bob");
//        details.add("Hello");
//        details.add("Bob");
//        details.add("Geeks For Geeks");
//  
//        System.out.println(
//            "The index of element Bob in Vector is: "
//            + details.indexOf("Bob", 3));
//    }
//}
//Saída
//O índice do elemento Bob em Vector é: 4
//Método 4: (usando o método lastIndexOf (Object, int))
//
//Declaração
//
//public int lastIndexOf(Object o, int Starting_Index)
//Sintaxe
//
//Vector.lastIndexOf(Object, int)
//Parâmetros:
//
//Starting_index: É um índice onde começar a procurar um elemento na direção anterior.
//o: é um elemento a ser pesquisado.
//Valor de retorno: o índice da última ocorrência do elemento especificado neste vetor, pesquisando para trás a partir de Starting_Index.
//
//// Searching Elements in Vector Using Index in Java
//import java.util.Vector;
//  
//public class GFG {
//    
//    public static void main(String args[])
//    {
//        // create a instance of vector
//        Vector<String> details = new Vector<>(10);
//  
//        // Adding Elements To The
//        // Vector
//        details.add("Geeks For Geeks");
//        details.add("Welcome");
//        details.add("Bob");
//        details.add("Hello");
//        details.add("Bob");
//        details.add("Geeks For Geeks");
//  
//        System.out.println(
//            "The index of element Bob in Vector is: "
//            + details.lastIndexOf("Bob", 4));
//    }
//}
//Saída
//O índice do elemento Bob em Vector é: 4
//Java.util.Arrays.equals() em Java com Exemplos
//
//Duas matrizes são consideradas iguais se ambas as matrizes contiveram o mesmo número de elementos, e todos os pares correspondentes de elementos nas duas matrizes são iguais. Em outras palavras, duas matrizes são iguais se contiverem os mesmos elementos na mesma ordem. Além disso, duas referências de matriz são consideradas iguais se ambas forem nulas.
//
//As arrays classe em java fornecem o método Arrays.equals() para verificar se duas matrizes são iguais ou não.


//Algumas Variantes:
//
//público estático booleano equals (byte[] a, byte[] a2)
//público estático booleano equals (curto[] a, curto[] a2)
//público estático booleano é igual (longo[] a, longo[] a2)
//público estático boolean equals (float[] a, float[] a2)
//público estático booleano equals (duplo[] a, duplo[] a2)
//público estático booleano equals (char[] a, char[] a2)
//público estático booleano equals (boolean[] a, boolean[] a2)
//éléticos públicos iguais (Objeto[] a, Objeto[] a2)


//Também podemos usar Arrays.equals() para verificar a igualdade de matrizes de objetos de classe definida pelo usuário. Veja a última variante do método Arrays.equals()
//
//Nota :- No caso de matrizes de Objetos, você deve substituir o método de igualdade para fornecer sua própria definição de igualdade, caso contrário, você terá saída depende do método igual () de retornos da classe Object. No 2° programa abaixo, estamos verificando a igualdade de rollno, nome e endereço para um aluno.

import java.util.Arrays;
public class Projeto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

// Programa Java para demonstrar o trabalho de Arrays.equals()
		
// Vamos criar diferentes matrizes de inteiros
		
        int[] arr1 = new int [] {1, 2, 3, 4};
        int[] arr2 = new int [] {1, 2, 3, 4};
        int[] arr3 = new int [] {1, 2, 4, 3};
          
        System.out.println("is arr1 equals to arr2 : " +
                                Arrays.equals(arr1, arr2));
        System.out.println("is arr1 equals to arr3 : " +
                                Arrays.equals(arr1, arr3));
        
//  Programa Java para demonstrar o trabalho de Arrays.equals() para objetos definidos pelo usuário.

        Student [] arr4 = {new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")};

        Student [] arr5 = {new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")};

        Student [] arr6 = {new Student(111, "bbbb", "london"),
                new Student(121, "dddd", "jaipur"),
                new Student(131, "aaaa", "nyc"),
                };

		System.out.println("is arr1 equals to arr2 : " +
		                         Arrays.equals(arr1, arr2));
		System.out.println("is arr1 equals to arr3 : " +
		                         Arrays.equals(arr1, arr3));    
		}
	}
		

		//Uma aula para representar um aluno.
		class Student
		{
		 int rollno;
		 String name, address;
		
		 // Constructor
		 public Student(int rollno, String name,
		                            String address)
		 {
		     this.rollno = rollno;
		     this.name = name;
		     this.address = address;
		 }
		   
		 @Override
		 public boolean equals(Object obj) {
		       
		     // typecast obj para estudante para que possamos comparar alunos
		     Student s = (Student) obj;
		       
		     return this.rollno == s.rollno && this.name.equals(s.name)
		                             && this.address.equals(s.address);
		 }
}
		

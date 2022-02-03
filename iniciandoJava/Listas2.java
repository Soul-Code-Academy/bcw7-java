import java.util.Arrays;

public class Listas2 {
    public static void main(String[] args) {
        
        int [] numeros = { 90,20,70,30,10};

        for(int item:numeros){
            System.out.println(item);
        }

        String[] palavras = { "casa", "gato", "chinelo", "pato", "zebra"};

        for(String n:palavras){
            System.out.println(n);
        }

        Arrays.sort(numeros);
        for(int item:numeros){
        System.out.println(item);
        }

        Arrays.sort(palavras);
        for(String n:palavras){
        System.out.println(n);
        }

        // PESQUISAR:
        // Arrays.fill(arg0, arg1);
        // System.arraycopy(arg0,arg1,arg2,arg3,arg4);
        // Arrays.equals(a,a2);
        // Arrays.binarySearch(a, key);
        // buscar pelo indice
    }
}

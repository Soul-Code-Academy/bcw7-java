import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // int[] numero = new int[5];

        // numero[0] = 10;
        // numero[1] = 20;
        // numero[2] = 30;
        // numero[3] = 40;
        // numero[4] = 50;

        int[] numero = {10,20,30,40,50};

        System.out.println(numero[3]);

        for (int i = 0; i < numero.length; i++){
            System.out.println(numero[i]);
        }

        final int num = 2;

        char [] gabarito = {'a', 'c', 'd', 'a', 'b'};
        char [] respostas = new char[5];

        for(int i = 0; i < respostas.length; i++){
            System.out.println("Digite a resposta da pergunta n° " + i);
            respostas[i] = scan.next().charAt(0);
        }

        int nota = 0;

        for(int i = 0; i < gabarito.length; i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }

        System.out.println("Sua nota é: " + nota);
       
    }
}

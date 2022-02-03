import java.util.Scanner;

public class LeituraAtividade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota1, nota2,nota3,nota4, media ;
        
        String nome = "";
        System.out.println("Digite um nome: ");
        nome = scan.next();
      
        System.out.println("1° nota : " );
        nota1 = scan.nextInt();
        
        System.out.println("2° nota : " );
        nota2 = scan.nextInt();
        
        System.out.println("3° nota : " );
        nota3 = scan.nextInt();
        
        System.out.println("4° nota : " );
        nota4 = scan.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
       
        System.out.printf("O nome digitado foi: " + nome + ". " + "%n A sua média é : " + media + ". %n");       
    }
}

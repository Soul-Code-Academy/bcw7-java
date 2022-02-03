public class Condicional {
    public static void main(String[] args) {
        
        boolean condicao = true;

        if(condicao){
            System.out.println("Passou por aqui!");
        }else {
            System.out.println("Passou por lá!");
        }

        int nota = 50;
        int media = 60;
        int faltas = 6;
        int maxFaltas = 5; 

        if(nota >= media && faltas <= maxFaltas){
            System.out.println("Aprovado.");
        }else if(nota> 40){
            System.out.println("Recuperação.");  
        }else{
            System.out.println("Reprovado.");
        }

        String resultado = "";

        resultado = (nota > media) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }

   
    // int posicao = 5;

    // switch (posicao) {
    //     case 1: 
    //     System.out.println("Chegou em 1° lugar.");
    //         break;
    //     case 2:
    //     System.out.println("Chegou em 2° lugar.");
    //         break;
    //     case 3:
    //     System.out.println("Chegou em 3° lugar.");
    //         break;
    //     case 4: case 5: case 6:
    //     System.out.println("Premiação de participação.");
    //         break;
    //     default:
    //         System.out.println("Não subiu ao pódio.");
               
    // }

   
}

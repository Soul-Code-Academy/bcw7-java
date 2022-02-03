public class AloMundo{
    public static void main (String [] args){
        System.out.println ("Olá Mundo!");
        System.out.print ("Olá Mundo!");
        System.out.printf ("%nCurso: %s ano: %d%n", "Java", 2022);

        int idade = 20;
        int num1, num2,num3;
        num1 = 2;
        num2 = 4;
        num3 = 5;
     
        System.out.println("A idade é: " + idade + " anos.");

        //Operadores

        num1 = num2 + num3;
        System.out.println("num2 + num3 é igual a : " + num1);

        num1 = num3 /num2;
        System.out.println("num3 dividido por num2 é igual a: " + num1);

        num1 = num3 % num1;
        System.out.println(num1);

        num1 = num3 * num2;
        System.out.println("num3 multiplicado por num2 é igual a: " + num1);

        double pi = 3.14;
        System.out.println(pi);

        double a = 3;
        System.out.println(a);

        float d = 5f;
        System.out.println(d);

        d = (float) pi;
        System.out.println(d);


        int x = 5;
        int y = 1;

        // x = y++;
        x = ++y;
        System.out.println("x é igual a : " + x);
        System.out.println("y é igual a : " + y);

        // int a = 1;
        // int b = 1;

        // a += b; //a = a + b
        // a -= b; //a = a - b;
    }
}
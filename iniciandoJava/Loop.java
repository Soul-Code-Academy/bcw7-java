public class Loop {
    public static void main(String[] args) {
        //loop For

        for(int cont = 0; cont < 10; cont++){
            System.out.println(cont + " - Java");
        }

        int cont = 5;
       
        while(cont <= 10){
            System.out.println(cont + " -- Java");
            cont ++;
        }

        cont = 8;
        do{
            System.out.println(cont + " --- Java");
            cont ++;
        }while(cont <= 10);
    }
}
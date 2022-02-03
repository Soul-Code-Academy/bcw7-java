public class Metodos {
    public static void main(String[] args) {
        
        impressao();
        mensagem("Cusro introdutório de Java");
        minhaIdade("Alana", 32);
        System.out.println(soma(3,4));
        System.out.println(soma(3.1,4.2));
        }

        //Método sem retorno e sem passagem de parâmetro

        public static void  impressao(){
            System.out.println("Extensão de Java");
    }

        //Método sem retorno e com passagem de parâmetro
        public static void mensagem(String msg){
            System.out.println(msg);
        }

        public static void minhaIdade(String nome, int idade){
            System.out.println("Meu nome é: " + nome + " e minha idade é: " + idade);
        }

        //Método com retorno
        public static int soma(int num1, int num2){
            return num1 + num2;
        }

        //Sobrecaga de métodos
        public static double soma(double num1, double num2){
            return num1 + num2;
        }


}

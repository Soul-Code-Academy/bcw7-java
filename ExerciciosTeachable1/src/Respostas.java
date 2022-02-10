//Exercícios: fixação de sintaxe
public class Respostas {

	public static void main(String[] args) {
	
//		1-Imprima todos os números de 150 a 300.
		

//		No 'for', a variável 'número1' foi iniciada em 150 e terminou em 300, incrementando 1 em casa iteração.
		
		int numero1;
        
        for(numero1 = 150 ; numero1 <= 300 ; numero1++){
            System.out.println(numero1);
        }
		

//		No laço 'while',  a variável 'número2' foi inicializada antes do laço e  incrementada dentro do próprio laço 'while'.

        int numero2=150;
        
        while(numero2<=300){
            System.out.println(numero2);
            numero2++;
        }
        
//        2-Imprima a soma de 1 até 1000.
        
//       A variável 'numero3' irá percorrer do número 1 até 1000. A variável 'soma1' é inicializada em 0 e armazena o valor de todos os números, de 1 até 1000, bem como a variável 'numero4' e 'soma2' do 'while'.
       
        
        int numero3,
            soma1=0;
        
        for(numero3 = 1 ; numero3 <= 1000 ; numero3++){
            soma1 = soma1 + numero3;
        }
        
        System.out.println("Soma: "+soma1);

	
    
        int numero4=1,
	            soma2=0;
	        
	    while(numero4<=1000){
	          soma2 = soma2 + numero4;
	          numero4++;
	        }
	        
	        System.out.println("Soma: "+soma2);

  
	
//	4-Imprima os fatoriais de 1 a 10.
	
//	O fatorial é representado pelo símbolo “!”. Definimos como n! (n fatorial) a multiplicação de n por todos os seus antecessores até chegar em 1. n! = n · (n – 1)· (n – 2) · … · 3 · 2 · 1.

	int n,
    fatorial=1;

	for(n=1 ; n<=10 ; n++){
	    fatorial = fatorial * n;
	    System.out.println("O fatorial de "+ n + " é (" +(n-1)+"!) * "+n+" = "+fatorial);            
	}
	
	int n1,
    fatorial1=1;

	for(n1=1 ; n1<=20 ; n1++){
	    fatorial1 = fatorial1 * n1;
	    System.out.println("O fatorial de "+ n1 + " é (" +(n1-1)+"!) * "+n1+" = "+fatorial1);            
	}
	
	long n2,
    fatorial2=1;

	for(n2=1 ; n2<=30 ; n2++){
	    fatorial2 = fatorial2 * n2;
	    System.out.println("O fatorial de "+ n2 + " é (" +(n2-1)+"!) * "+n2+" = "+fatorial2);            
	}
	
	long n3,
    fatorial3=1;

	for(n3=1 ; n3<=40 ; n3++){
	    fatorial3 = fatorial3 * n3;
	    System.out.println("O fatorial de "+ n3 + " é (" +(n3-1)+"!) * "+n3+" = "+fatorial3);            
	}

//  5-No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos até 20, 30 e 40.
	
//	Obs.:  a variável do tipo int pode variar de -2.147.483.648 até o máximo 2.147.483.647
//
//	Ou seja, até n=12, tudo ok. Passou disso, o Java imprime valores errados, pois extrapola o máximo que a variável inteira pode suportar.
//	
//	Já o tipo long pode armazenar inteiros de tamanho até 9.223.372.036.854.775.807
	
	
//	6-Escreva um programa em que, dada uma variável xcom algum valor inteiro, temos um novo xde acordo com a seguinte regra:
//		Se xé par, x = x / 2;
//		Se xé impar, x = 3 * x + 1;
//		Imprime x;
	
//	Chamamos o n-ésimo termo da série de 'numero', o (n-1)-ésimo termo de 'ultimo' e o (n-2)-ésimo de 'penultimo'.
//	Assim, temos a fórmula geral: numero = ultimo + penultimo;
	
	int numero5, 
    ultimo=1, 
    penultimo=0;

	numero5 = ultimo + penultimo;
	
	while(numero5<=100){
	    System.out.println(numero5);
	    
	    penultimo=ultimo;
	    ultimo=numero5;
	    numero5 = ultimo + penultimo;
		
		}
	
//	7-Escreva uma classe Java que contenha apenas o método main( ). Você deve passar como parâmetro para o método main( ) as coordenadas x, y de pontos. O método calcula a distância Euclidiana ente estes dois pontos e exibe o resultado na tela.
	
	

	}
}
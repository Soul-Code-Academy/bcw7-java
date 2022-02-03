
//Criar uma classe Triangulo com os atributos: base e altura.
//Criar método para calcular a área desse triângulo de acordo com os valores da base e altura que deverão ser passados como parâmetros do construtor.
//Através de uma classe Principal, instanciar 3 triângulos, cada um com medidas diferentes e fazer os cálculos para cada triângulo.


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo triangulo1 = new Triangulo(2, 2);
		Triangulo triangulo2 = new Triangulo(3, 3);
		Triangulo triangulo3 = new Triangulo(4, 4);
		
		System.out.println("Base triangulo1: " + triangulo1.getBase()  +  " Altura triangulo1: " + triangulo1.getAltura() +  " Área: " + triangulo1.calcularArea());
		
		System.out.println("Base triangulo2: " + triangulo2.getBase()  +  " Altura triangulo2: " + triangulo2.getAltura() +  " Área: " + triangulo2.calcularArea());
		
		System.out.println("Base triangulo3: " + triangulo3.getBase()  +  " Altura triangulo3: " + triangulo3.getAltura() +  " Área: " +  triangulo3.calcularArea());
		
	}
	
}






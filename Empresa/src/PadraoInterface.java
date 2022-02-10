//Outra forma de conseguir a abstração em Java, é com interfaces.
//
//A é uma classe completamente "abstrata" que é usada para agrupar métodos relacionados com corpos vazios:interface.abstract
//
//Notas em Interfaces:
//Como classes abstratas, as interfaces não podem ser usadas para criar objetos (no exemplo acima, não é possível criar um objeto "Animal" na MyMainClass)
//Os métodos de interface não têm um corpo - o corpo é fornecido pela classe "implementar"
//Na implementação de uma interface, você deve substituir todos os seus métodos
//Os métodos de interface são por padrão e abstractpublic
//Os atributos da interface são por padrão e publicstaticfinal
//Uma interface não pode conter um construtor (pois não pode ser usado para criar objetos)
//Por que e quando usar interfaces?

//1) Para obter segurança - ocultar certos detalhes e apenas mostrar os detalhes importantes de um objeto (interface).
//
//2) Java não suporta "herança múltipla" (uma classe só pode herdar de uma superclasse). No entanto, ele pode ser alcançado com interfaces, pois a classe pode implementar várias interfaces. Nota: Para implementar várias interfaces, separe-as com uma círgula (veja o exemplo abaixo).

//https://www.w3schools.com/java/java_interface.asp

public interface PadraoInterface {
	
//  Interface lista os métodos 
	
	public void baterPonto();
}

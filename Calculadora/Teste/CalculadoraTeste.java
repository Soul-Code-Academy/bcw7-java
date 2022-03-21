import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTeste {
	
	private Calculadora calculadora = new Calculadora();

	@Test
	void soma() {
		int resultado = calculadora.soma(8,2);
		Assertions.assertEquals(10, resultado);
	}
	
	@Test
	void subtracao() {
		int resultado = calculadora.subtracao(8,2);
		Assertions.assertEquals(6, resultado);
	}
	
	@Test
	void multiplicacao() {
		int resultado = calculadora.multiplicacao(8,2);
		Assertions.assertEquals(16, resultado);
	}
	
	@Test
	void divisaoResultadoInteiro() {
		double resultado = calculadora.divisao(8,2);
		Assertions.assertEquals(4, resultado);
	}
	
	@Test
	void divisaoResultadoDecimal() {
		double resultado = calculadora.divisao(8,3);
		Assertions.assertEquals(2, resultado, 0.67);
	}
	
	

}

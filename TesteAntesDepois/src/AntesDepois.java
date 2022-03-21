import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AntesDepois {
	
	
	@BeforeClass
	static public void AntesDeTodosTestes() {
		System.out.println("Antes da execução de todos os testes.");
	}

	@AfterClass
	static public void DepoisDeTodosTestes() {
		System.out.println("Depois da execução de todos os testes.");
	}
	
	@Before
	public void AntesDoTeste() {
		System.out.println("Antes da execução do teste.");
	}
		
	@After
	public void DepoisDoTeste() {
		System.out.println("Antes da execução do teste.");
	}
	
	@Test
	public void test1() {
		System.out.println("Teste1");
	}
	
	@Test
	public void test2() {
		System.out.println("Teste2");
	}
	
	@Test
	public void test3() {
		System.out.println("Teste3");
	}
	
	

}

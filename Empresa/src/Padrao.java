
public class Padrao extends Funcionario implements PadraoInterface{
	
	public Padrao(String nome, double salario) {
		super(nome, salario);
		super.setCargo("Funcionário Padrão");
	}
	
	public void baterPonto() {
		System.out.println("Carga horária diária cumprida!");
	}
}

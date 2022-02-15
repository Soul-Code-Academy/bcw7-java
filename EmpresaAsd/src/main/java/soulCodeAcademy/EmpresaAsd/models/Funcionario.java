package soulCodeAcademy.EmpresaAsd.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Faz definição de tabela

public class Funcionario {
		
		@Id //Informa que é o id
		@GeneratedValue(strategy=GenerationType.IDENTITY)//Informa que é auto-incremento
		private Integer id_funcionario;
		
		@Column(nullable = false, length = 60) //Informa que é uma coluna da tabela, é um atributo que não pode ser nulo e tem tamanho máximo 60
		private String func_nome;
		
		
		@Column(nullable = false, length = 30)
		private String func_cidade;
		
		@Column(nullable = false, length = 20)
		private String func_cargo;

		public Integer getId_funcionario() {
			return id_funcionario;
		}

		public void setId_funcionario(Integer id_funcionario) {
			this.id_funcionario = id_funcionario;
		}

		public String getFunc_nome() {
			return func_nome;
		}

		public void setFunc_nome(String func_nome) {
			this.func_nome = func_nome;
		}

		public String getFunc_cidade() {
			return func_cidade;
		}

		public void setFunc_cidade(String func_cidade) {
			this.func_cidade = func_cidade;
		}

		public String getFunc_cargo() {
			return func_cargo;
		}

		public void setFunc_cargo(String func_cargo) {
			this.func_cargo = func_cargo;
		}

}

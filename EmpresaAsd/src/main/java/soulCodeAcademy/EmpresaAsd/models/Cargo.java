package soulCodeAcademy.EmpresaAsd.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cargo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_cargo;
	
	@Column(nullable=false, length=10)
	private String ca_nome;
	
	@Column(nullable=false, length=80)
	private String ca_atribuicao;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario>funcionario = new ArrayList<>();

	public Integer getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(Integer id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getCa_nome() {
		return ca_nome;
	}

	public void setCa_nome(String ca_nome) {
		this.ca_nome = ca_nome;
	}

	public String getCa_atribuicao() {
		return ca_atribuicao;
	}

	public void setCa_atribuicao(String ca_atribuicao) {
		this.ca_atribuicao = ca_atribuicao;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
	
}

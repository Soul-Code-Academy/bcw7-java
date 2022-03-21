package soulCodeAcademy.Escola.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity //Faz definição de tabela
public class Aluno {
	
	@Id //Informa que é o id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Informa que é auto-incremento
	private Integer ra_aluno;
	

	@Column(nullable = false, length = 60) //Informa que é uma coluna da tabela, é um atributo que não pode ser nulo e tem tamanho máximo 60
	private String al_nome;
	
	@Column(nullable = true, length = 60)
	private String al_responsavel;
	
	@Column(nullable = false, length = 30)
	private String al_cidade;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_turma")
	private Turma turma;

	public Integer getRa_aluno() {
		return ra_aluno;
	}

	public void setRa_aluno(Integer ra_aluno) {
		this.ra_aluno = ra_aluno;
	}

	public String getAl_nome() {
		return al_nome;
	}

	public void setAl_nome(String al_nome) {
		this.al_nome = al_nome;
	}

	public String getAl_responsavel() {
		return al_responsavel;
	}

	public void setAl_responsavel(String al_responsavel) {
		this.al_responsavel = al_responsavel;
	}

	public String getAl_cidade() {
		return al_cidade;
	}

	public void setAl_cidade(String al_cidade) {
		this.al_cidade = al_cidade;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	
	
}

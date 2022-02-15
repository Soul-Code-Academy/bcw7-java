package soulCodeAcademy.Escola.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_turma;
	
	@Column(nullable=false, length=10)
	private String tu_nome;
	
	@Column(nullable=false, length=20)
	private String tu_descricao;
	
	@OneToMany(mappedBy = "turma")
	private List<Aluno>aluno = new ArrayList<>();

	public Integer getId_turma() {
		return id_turma;
	}

	public void setId_turma(Integer id_turma) {
		this.id_turma = id_turma;
	}

	public String getTu_nome() {
		return tu_nome;
	}

	public void setTu_nome(String tu_nome) {
		this.tu_nome = tu_nome;
	}

	public String getTu_descricao() {
		return tu_descricao;
	}

	public void setTu_descricao(String tu_descricao) {
		this.tu_descricao = tu_descricao;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	

}

package soulCodeAcademy.EmpresaAsd.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Servico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_servico;
	
	
	@Column(nullable = false, length = 500)
	private String ser_descricao;
	
	
	@OneToOne
	@JoinColumn(name = "id_cargo", unique = true)
	@JsonIgnore
	private Cargo cargo;


	public Integer getId_servico() {
		return id_servico;
	}


	public void setId_servico(Integer id_servico) {
		this.id_servico = id_servico;
	}


	public String getSer_descricao() {
		return ser_descricao;
	}


	public void setSer_descricao(String ser_descricao) {
		this.ser_descricao = ser_descricao;
	}


	public Cargo getCargo() {
		return cargo;
	}


	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
}


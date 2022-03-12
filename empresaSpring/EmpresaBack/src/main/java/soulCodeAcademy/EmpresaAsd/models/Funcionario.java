package soulCodeAcademy.EmpresaAsd.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity //Faz definição de tabela
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_funcionario;

//	false - falsa a possibilidade de ser null
	@Column(nullable = false, length = 60)
	private String func_nome;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Column(columnDefinition = "date", nullable = false)
	@Temporal(TemporalType.DATE) //sem salvar a hora, só o dia
	private Date func_dataNascimento;

	@Column(nullable = false, length = 30)
	private String func_cidade;
	
	@Column(nullable = false, length = 60)
	private String func_bairro;
	
	@Column(nullable = false, length = 60)
	private String func_referencia;
	
	@Column(nullable = false, length = 60)
	private Integer func_numero;
	
	@Column(nullable = false, length = 100)
	private String func_rua;
	
	@Column(nullable = false, length = 30)
	private String func_cep;
	
	@Column(nullable = false, length = 30)
	private String func_estado;
	
	@Column(nullable = false, length = 11)
	private String func_cpf;
	
	@Column(nullable = false, length = 30)
	private String func_telefone;
	
	@Column(nullable = false, length = 100)
	private String func_email;

	@Column(nullable = true, length = 1000)
	private String func_foto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_cargo")
	private Cargo cargo;

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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getFunc_foto() {
		return func_foto;
	}

	public void setFunc_foto(String func_foto) {
		this.func_foto = func_foto;
	}

	public String getFunc_cpf() {
		return func_cpf;
	}

	public void setFunc_cpf(String func_cpf) {
		this.func_cpf = func_cpf;
	}

	public String getFunc_bairro() {
		return func_bairro;
	}

	public void setFunc_bairro(String func_bairro) {
		this.func_bairro = func_bairro;
	}

	public String getFunc_rua() {
		return func_rua;
	}

	public void setFunc_rua(String func_rua) {
		this.func_rua = func_rua;
	}

	public String getFunc_cep() {
		return func_cep;
	}

	public void setFunc_cep(String func_cep) {
		this.func_cep = func_cep;
	}

	public String getFunc_estado() {
		return func_estado;
	}

	public void setFunc_estado(String func_estado) {
		this.func_estado = func_estado;
	}

	

	public String getFunc_referencia() {
		return func_referencia;
	}

	public void setFunc_referencia(String func_referencia) {
		this.func_referencia = func_referencia;
	}

	public Integer getFunc_numero() {
		return func_numero;
	}

	public void setFunc_numero(Integer func_numero) {
		this.func_numero = func_numero;
	}


	public String getFunc_telefone() {
		return func_telefone;
	}

	public void setFunc_telefone(String func_telefone) {
		this.func_telefone = func_telefone;
	}

	public String getFunc_email() {
		return func_email;
	}

	public void setFunc_email(String func_email) {
		this.func_email = func_email;
	}

	public Date getFunc_dataNascimento() {
		return func_dataNascimento;
	}

	public void setFunc_dataNascimento(Date func_dataNascimento) {
		this.func_dataNascimento = func_dataNascimento;
	}
	
	
	
	
}


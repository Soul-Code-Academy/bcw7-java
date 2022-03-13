//package soulCodeAcademy.EmpresaAsd.models;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//
//@Entity
//public class Usuario {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id_usuario;
//	
//	@Column(nullable = false, length = 150)
//	private String nome;
//	
//	@Column(nullable = false, length = 150)
//	private String sobrenome;
//	
//	@Column(nullable = false, length = 150)
//	private String email;
//	
//	@Column(nullable = true, length = 150)
//	private String pasword;
//	
//	@Column(nullable = true, length = 50)
//	private String username;
//	
//	@ManyToOne
//	@JoinColumn(name = "id_role")
//	private Role role;
//	
//	public Usuario() {
//			
//		}
//
//	public Usuario(String nome, String sobrenome, String email) {
//		super();
//		this.nome = nome;
//		this.sobrenome = sobrenome;
//		this.email = email;	
//	}
//	
//	
//	public Integer getId_usuario() {
//		return id_usuario;
//	}
//
//	public void setId_usuario(Integer id_usuario) {
//		this.id_usuario = id_usuario;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public String getSobrenome() {
//		return sobrenome;
//	}
//
//	public void setSobrenome(String sobrenome) {
//		this.sobrenome = sobrenome;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPasword() {
//		return pasword;
//	}
//
//	public void setPasword(String pasword) {
//		this.pasword = pasword;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public Role getRole() {
//		return role;
//	}
//
//	public void setRole(Role role) {
//		this.role = role;
//	}
//
//	
//	
//}

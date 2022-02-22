package soulCodeAcademy.Escola.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_professor;
	
	@Column(nullable = false, length = 60)
	private String pro_nome;
	
	@Column(nullable = false, length = 60)
	private String pro_formacao;
	
	@Column(nullable = true, length = 100)
	private String pro_foto;

	@OneToOne
	@JoinColumn(name = )
}

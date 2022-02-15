package soulCodeAcademy.Escola.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import soulCodeAcademy.Escola.models.Aluno;

//Estendemos o JPA Repository para acessar seus métodos
public interface AlunoRepository extends JpaRepository<Aluno,Integer>{
	
}

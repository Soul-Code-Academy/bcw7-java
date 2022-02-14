package soulCodeAcademy.Escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soulCodeAcademy.Escola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Integer>{
	
}

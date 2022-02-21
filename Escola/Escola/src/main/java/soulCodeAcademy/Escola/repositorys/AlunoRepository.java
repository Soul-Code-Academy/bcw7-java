package soulCodeAcademy.Escola.repositorys;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.Escola.models.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno,Integer>{
	@Query(value = "SELECT * FROM aluno WHERE id_turma  = :id_turma", nativeQuery = true)
	List<Aluno> fetchByTurma(Integer id_turma);
	
	@Query(value = "SELECT ra_aluno, al_nome, al_cidade, tu_nome, tu_descricao FROM turma right JOIN aluno ON aluno.id_turma = turma.id_turma", nativeQuery = true)
	List<List> alunosComTurma();
	
}



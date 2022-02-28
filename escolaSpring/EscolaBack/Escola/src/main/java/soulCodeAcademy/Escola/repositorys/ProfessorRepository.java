package soulCodeAcademy.Escola.repositorys;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.Escola.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Integer>{
	@Query(value= "SELECT * FROM professor WHERE id_turma= :id_turma", nativeQuery = true)
	Professor buscarProfessorTurma(Integer id_turma);
	
	@Query(value = "SELECT  pro_nome, pro_formacao, tu_nome FROM turma right JOIN professor ON professor.id_turma = turma.id_turma order by pro_nome", nativeQuery = true)
	List<List> professoresComTurma();
	
	@Query(value = "SELECT * FROM professor WHERE id_turma is null", nativeQuery = true)
	List<Professor> professorSemTurma();
	
}


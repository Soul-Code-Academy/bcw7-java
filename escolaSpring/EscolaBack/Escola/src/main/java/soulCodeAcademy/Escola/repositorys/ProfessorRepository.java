package soulCodeAcademy.Escola.repositorys;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.Escola.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Integer>{

	@Query(value = "SELECT * FROM professor WHERE id_turma = :id_turma", nativeQuery = true)
	Professor fetchByTurma(Integer id_turma);

	@Query(value="SELECT * FROM professor WHERE id_turma is null", nativeQuery = true)
	List<Professor> professorSemTurma();
	
	@Query(value = "SELECT professor.id_professor,professor.pro_nome,professor.pro_formacao,turma.id_turma,turma.tu_nome,turma.tu_descricao FROM turma right JOIN professor ON professor.id_turma = turma.id_turma order by professor.pro_nome;",nativeQuery = true)
	List<List> professorComSuaTurma();

	
}


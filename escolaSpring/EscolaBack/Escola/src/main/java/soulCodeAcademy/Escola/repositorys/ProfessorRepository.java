package soulCodeAcademy.Escola.repositorys;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.Escola.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Integer>{
	@Query(value= "SELECT * FROM professor WHERE id_turma= :id_turma", nativeQuery = true)
	Professor buscarProfessorTurma(Integer id_turma);
	
	
}

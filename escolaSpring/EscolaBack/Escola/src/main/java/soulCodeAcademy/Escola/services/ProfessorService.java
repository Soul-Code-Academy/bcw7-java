package soulCodeAcademy.Escola.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import soulCodeAcademy.Escola.models.Professor;
import soulCodeAcademy.Escola.models.Turma;
import soulCodeAcademy.Escola.repositorys.ProfessorRepository;
import soulCodeAcademy.Escola.repositorys.TurmaRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private TurmaService turmaService;
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	public List<Professor> mostrarTodosProfessores(){
		return professorRepository.findAll();
	}
	
	public  Professor mostrarUmProfessor(Integer id_professor) {
		Optional<Professor> professor = professorRepository.findById(id_professor);
		return professor.orElseThrow();
	}
	
	public Professor buscarProfessorTurma(Integer id_turma) {
		Professor professor = professorRepository.buscarProfessorTurma(id_turma);
		return professor;
	}
	
	public Professor inserirProfessor(Integer id_turma, Professor professor) {
		professor.setId_professor(null);
			if(id_turma != null) {
				Turma turma = turmaService.buscarUmaTurma(id_turma);
				professor.setTurma(turma);
				turma.setProfessor(professor);
			
	}
	return professorRepository.save(professor);
}
	
//	public Professor inserirProfessorSemTurma(Professor professor) {
//		professor.setId_professor(null);
//		return professorRepository.save(professor);
//	}
//	
//	public Professor inserirProfessorComTurma(Integer id_turma, Professor professor) {
//		professor.setId_professor(null);
//		Turma turma = turmaService.buscarUmaTurma(id_turma);
//		professor.setTurma(turma);
//		return professorRepository.save(professor);
//		
//	}
	
	public Professor editarProfessor(Integer id_turma, Professor professor) {
		
			if(id_turma != null) {
				Professor professorAnterior = mostrarUmProfessor(professor.getId_professor());
				Turma turmaAnterior = professorAnterior.getTurma();
					if(turmaAnterior != null) {
						turmaAnterior.setProfessor(null);
						turmaRepository.save(turmaAnterior);
				}
				Turma turma = turmaService.buscarUmaTurma(id_turma);
				professor.setTurma(turma);
				turma.setProfessor(professor);
			}
			return professorRepository.save(professor);
	}

}

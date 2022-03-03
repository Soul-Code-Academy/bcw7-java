package soulCodeAcademy.Escola.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import soulCodeAcademy.Escola.models.Professor;
import soulCodeAcademy.Escola.models.Turma;
import soulCodeAcademy.Escola.repositorys.ProfessorRepository;
import soulCodeAcademy.Escola.repositorys.TurmaRepository;
import soulCodeAcademy.Escola.services.exceptions.DataIntegrityViolationException;

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
	

	public Professor buscarProfessorDaTurma(Integer id_turma){
		Professor professor = professorRepository.fetchByTurma(id_turma);
		return professor;
	}
	
	public List<Professor> professorSemTurma(){
		return professorRepository.professorSemTurma()
;	}
	
	public List<List> professsorComSuaTurma(){
		return professorRepository.professorComSuaTurma();
	}
	
	
	public Professor inserirProfessor(Integer id_turma, Professor professor) {
		professor.setId_professor(null);
		
		if(id_turma != null) {
			Turma turma = turmaService.buscarUmaTurma(id_turma);
			professor.setTurma(turma);		
		}
		return professorRepository.save(professor);
		
	}
	
	public Professor editarProfessor(Professor professor) {
		mostrarUmProfessor(professor.getId_professor());
		return professorRepository.save(professor);
	}
	
	public Professor salvarFoto (Integer id_professor, String caminhoFoto) {
		Professor professor = mostrarUmProfessor(id_professor);
		professor.setPro_foto(caminhoFoto);
		return professorRepository.save(professor);
	}
	
	public void deletarUmProfessor(Integer id_professor) {
		professorRepository.deleteById(id_professor);
		try {
			professorRepository.deleteById(id_professor);
			}catch(org.springframework.dao.DataIntegrityViolationException e) {
				throw new DataIntegrityViolationException("Esse professor não pode ser excluído.");
			}
		}
	

	
	
}

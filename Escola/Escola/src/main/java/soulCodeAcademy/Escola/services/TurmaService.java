package soulCodeAcademy.Escola.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import soulCodeAcademy.Escola.models.Turma;
import soulCodeAcademy.Escola.repositorys.TurmaRepository;
import soulCodeAcademy.Escola.services.exceptions.DataIntegrityViolationException;
import soulCodeAcademy.Escola.services.exceptions.ObjectNotFoundException;

@Service
public class TurmaService {
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	public List<Turma>mostrarTodasTurmas(){
		return turmaRepository.findAll();	
		}
	
	public Turma buscarUmaTurma(Integer id_turma) {
		Optional<Turma>turma = turmaRepository.findById(id_turma);
		return turma.orElseThrow(() -> new ObjectNotFoundException("Objeto não cadastrado. ID: " + id_turma));
		}
	
	public Turma inserirTurma(Turma turma) {
		return turmaRepository.save(turma);
		}
	
	
	public Turma editarTurma(Turma turma) {
		buscarUmaTurma(turma.getId_turma());
		return turmaRepository.save(turma);
		}
	
	public void deletarUmaTurma(Integer id_turma) {
		turmaRepository.deleteById(id_turma);
		try {
			turmaRepository.deleteById(id_turma);
			}catch(org.springframework.dao.DataIntegrityViolationException e) {
				throw new DataIntegrityViolationException("Essa turma não pode ser excluída, pois possui alunos relacionados.");
			}
		}	
}


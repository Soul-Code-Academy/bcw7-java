package soulCodeAcademy.Escola.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulCodeAcademy.Escola.models.Aluno;
import soulCodeAcademy.Escola.models.Turma;
import soulCodeAcademy.Escola.repositorys.AlunoRepository;
import soulCodeAcademy.Escola.services.exceptions.ObjectNotFoundException;

@Service //Criação dos serviços para utilizar os métodos JPA
public class AlunoService {
	
	//Fazendo a injeção de dependência
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private TurmaService turmaService ;
	
	// Serviço: implementar listagem dos alunos cadastrados
	public List<Aluno>mostrarTodosAlunos(){
		return alunoRepository.findAll();	//findAll mostra todos os registros
		}
	
	public Aluno buscarUmAluno(Integer ra_Aluno) {
		
		//Optional - evita os erros NullPointerExcetion, tirando a necessidade da verificação por criação de código. Ex.: (if aluno != null
		//orElseThrow() - se o aluno estiver no banco de dads, retorna o aluno. Se não, lança uma exceção.
		Optional<Aluno>aluno = alunoRepository.findById(ra_Aluno);
		return aluno.orElseThrow(() -> new ObjectNotFoundException("Objeto não cadastrado. ID: " + ra_Aluno));
	}
	
	public Aluno inserirAluno(Integer id_turma, Aluno aluno) {
		aluno.setRa_aluno(null);
		Turma turma = turmaService.buscarUmaTurma(id_turma);
		aluno.setTurma(turma);		
		return alunoRepository.save(aluno);
	}
	
	public void deletarUmAluno(Integer ra_aluno) {
		alunoRepository.deleteById(ra_aluno);
	}
	
	public Aluno editarAluno(Aluno aluno) {
		buscarUmAluno(aluno.getRa_aluno());
		return alunoRepository.save(aluno);
	}
	


}


package soulCodeAcademy.Escola.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import soulCodeAcademy.Escola.models.Aluno;
import soulCodeAcademy.Escola.repositorys.AlunoRepository;
import soulCodeAcademy.Escola.services.AlunoService;

//Mapeamento dos endpoints

@CrossOrigin
@RestController
@RequestMapping("escola")
public class AlunoController {

	//Injeção de dependências
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping("/aluno")
	public List<Aluno>mostrarTodosAlunos(){
		List<Aluno>aluno = alunoService.mostrarTodosAlunos();
		return aluno;
	}
	
	// ResponseEntity - retorna os dados reais de um registro do banco de dados. Retorna uma resposta inteira, incluindo cabeçalho, corpo e status.
	
	@GetMapping("/aluno/{ra_aluno}")
	public ResponseEntity<?>buscarUmAluno(@PathVariable Integer ra_aluno){
		Aluno aluno = alunoService.buscarUmAluno(ra_aluno);
		return ResponseEntity.ok().body(aluno);
	}
	
	@PostMapping("/aluno")
	public ResponseEntity<Void>inserirAluno(@RequestBody Aluno aluno){
		
		aluno = alunoService.inserirAluno(aluno);
		
		//URI - Identificador uniforme de recurso. Serve para identificar ou denominar um recurso vindo do servidor. 	Une o protocolo HTTP + localização do recurso (url + nome do recurso).
		//ServletUriComponentsBuilder - e uma classe que possui métodos para criar ligações com o servidor.
		//buildAndExpand- cria uma nova instância e coloca e coloca os dados que foram passados através do corpo da requisição no modelo que temos como objeto do aluno
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(aluno.getRa_aluno()).toUri();
		return ResponseEntity.created(uri).build()
;	}
	
	@DeleteMapping("/aluno/{ra_aluno}")
	public ResponseEntity<Void>deletarUmAluno(@PathVariable Integer ra_aluno){
		alunoService.deletarUmAluno(ra_aluno);
		return  ResponseEntity.noContent().build();
	}
	
	@PutMapping("/aluno/{ra_aluno}")
	public ResponseEntity<Void>editarAluno(@PathVariable Integer ra_aluno, @RequestBody Aluno aluno){
		aluno.setRa_aluno(ra_aluno);
		aluno = alunoService.editarAluno(aluno);
		return ResponseEntity.noContent().build();
	}
	
}

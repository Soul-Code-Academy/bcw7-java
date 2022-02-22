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

import soulCodeAcademy.Escola.models.Turma;
import soulCodeAcademy.Escola.services.TurmaService;

@CrossOrigin
@RestController
@RequestMapping("escola")
public class TurmaController {

	@Autowired
	private TurmaService turmaService;
	
	@GetMapping("/turma")
	public List<Turma> mostrarTodasTurmas(){
		List<Turma> turma = turmaService.mostrarTodasTurmas();
		return turma;
	}
	
	@GetMapping("/turma/{id_turma}")
	public ResponseEntity<?>buscarUmaTurma(@PathVariable Integer id_turma){
		Turma turma= turmaService.buscarUmaTurma(id_turma);
		return ResponseEntity.ok().body(turma);
	}
	
	@PostMapping("/turma")
	public ResponseEntity<Void>inserirTurma(@RequestBody Turma turma){
		
		turma  = turmaService.inserirTurma(turma);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(turma.getId_turma()).toUri();
		return ResponseEntity.created(uri).build()
;	}
	
	@DeleteMapping("/turma/{id_turma}")
	public ResponseEntity<Void>  deletarUmaTurma(@PathVariable Integer id_turma){
		turmaService.deletarUmaTurma(id_turma);
		return  ResponseEntity.noContent().build();
	}
	
	@PutMapping("/turma/{id_turma}")
	public ResponseEntity<Void> editarTurma(@PathVariable Integer id_turma, @RequestBody Turma turma){
		turma.setId_turma(id_turma);
		turma = turmaService.editarTurma(turma);
		return ResponseEntity.noContent().build();
	}
	
}

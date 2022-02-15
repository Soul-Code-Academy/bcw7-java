package soulCodeAcademy.EmpresaAsd.controllers;

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

import soulCodeAcademy.EmpresaAsd.models.Funcionario;
import soulCodeAcademy.EmpresaAsd.services.FuncionarioService;

//Mapeamento dos endpoints

@CrossOrigin
@RestController
@RequestMapping("empresa")

public class FuncionarioController {

	//Injeção de dependências
	
//		@Autowired
//		private FuncionarioRepository funcionarioRepository;
		
		@Autowired
		private FuncionarioService funcionarioService;
		
		@GetMapping("/funcionario")
		public List<Funcionario>mostrarTodosFuncionarios(){
			List<Funcionario>funcionario = funcionarioService.mostrarTodosFuncionarios();
			return funcionario;
		}
		
		// ResponseEntity - retorna os dados reais de um registro do banco de dados. Retorna uma resposta inteira, incluindo cabeçalho, corpo e status.
		
		@GetMapping("/funcionario/{id_funcionario}")
		public ResponseEntity<?>buscarUmFuncionario(@PathVariable Integer id_funcionario){
			Funcionario funcionario = funcionarioService.buscarUmFuncionario(id_funcionario);
			return ResponseEntity.ok().body(funcionario);
		}
		
		@PostMapping("/funcionario")
		public ResponseEntity<Void>inserirFuncionario(@RequestBody Funcionario funcionario){
			
			funcionario = funcionarioService.inserirFuncionario(funcionario);
			
			//URI - Identificador uniforme de recurso. Serve para identificar ou denominar um recurso vindo do servidor. 	Une o protocolo HTTP + localização do recurso (url + nome do recurso).
			//ServletUriComponentsBuilder - e uma classe que possui métodos para criar ligações com o servidor.
			//buildAndExpand- cria uma nova instância e coloca e coloca os dados que foram passados através do corpo da requisição no modelo que temos como objeto do funcionario
			
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(funcionario.getId_funcionario()).toUri();
			return ResponseEntity.created(uri).build()
	;	}
		
		@DeleteMapping("/funcionario/{id_funcionario}")
		public ResponseEntity<Void>deletarUmFuncionario(@PathVariable Integer id_funcionario){
			funcionarioService.deletarUmFuncionario(id_funcionario);
			return  ResponseEntity.noContent().build();
		}
		
		@PutMapping("/funcionario/{id_funcionario}")
		public ResponseEntity<Void>editarFuncionario(@PathVariable Integer id_funcionario, @RequestBody Funcionario funcionario){
			funcionario.setId_funcionario(id_funcionario);
			funcionario= funcionarioService.editarFuncionario(funcionario);
			return ResponseEntity.noContent().build();
		}
	
}

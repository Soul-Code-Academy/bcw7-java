
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import soulCodeAcademy.EmpresaAsd.models.Funcionario;
import soulCodeAcademy.EmpresaAsd.repositorys.FuncionarioRepository;
import soulCodeAcademy.EmpresaAsd.services.FuncionarioService;
import soulCodeAcademy.EmpresaAsd.models.Cargo;

//Mapeamento dos endpoints

@CrossOrigin
@RestController
@RequestMapping("empresa")
public class FuncionarioController {

	// Precisamos da injeção de dependências

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping("/funcionario")
	public List<Funcionario> mostrarTodosFuncionarios() {
//		dentro do objeto funcionario vai estar o resultado
		List<Funcionario> funcionario = funcionarioService.findAll();
		return funcionario;
	}

	@GetMapping("/funcionario/{id_funcionario}")
	public ResponseEntity<?> buscarUmFuncionario(@PathVariable Integer id_funcionario) {
		Funcionario funcionario = funcionarioService.buscarUmFuncionario(id_funcionario);
		return ResponseEntity.ok().body(funcionario);
	}

	@GetMapping("/funcionario/busca-cargo/{id_cargo}")
	public List<Funcionario> buscarFuncionarioTurma(@PathVariable Integer id_cargo) {
		List<Funcionario> funcionario = funcionarioService.buscarFuncionarioCargo(id_cargo);
		return funcionario;
		// Aqui retorna-se o funcionário do cargo em questão
	}

	@PostMapping("/funcionario")
	public ResponseEntity<Funcionario> inserirFuncionario(@RequestParam(value = "cargo") Integer id_cargo,
			@RequestBody Funcionario funcionario) {
		funcionario = funcionarioService.inserirFuncionario(id_cargo, funcionario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/funcionario/{id}")
				.buildAndExpand(funcionario.getId_funcionario()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping("/funcionario/{id_funcionario}")
	public ResponseEntity<Void> deletarUmFuncionario(@PathVariable Integer id_funcionario) {
		funcionarioService.deletarUmFuncionario(id_funcionario);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/funcionario/{id_funcionario}")
	public ResponseEntity<Void> editarFuncionario(@RequestParam(value = "cargo") Cargo cargo,
			@PathVariable Integer id_funcionario, @RequestBody Funcionario funcionario) {
		funcionario.setId_funcionario(id_funcionario);
		funcionario.setCargo(cargo);
		funcionario = funcionarioService.editarFuncionario(funcionario);
		return ResponseEntity.noContent().build();
	}
}



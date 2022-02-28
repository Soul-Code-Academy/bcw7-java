package soulCodeAcademy.EmpresaAsd.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import soulCodeAcademy.EmpresaAsd.models.Servico;
import soulCodeAcademy.EmpresaAsd.services.ServicoService;

@CrossOrigin
@RestController
@RequestMapping("empresa")
public class ServicoController {

	@Autowired
	private ServicoService servicoService;
	
	@GetMapping("/servico")
	private List<Servico> mostrarTodosServicos() {
		List<Servico> servico= servicoService.mostrarTodosServicos();
		return servico;
	}
	
	@GetMapping("/servico/{id_servico}")
	public ResponseEntity<Servico> mostrarUmServico(@PathVariable Integer id_servico) {
		Servico servico = servicoService.mostrarUmServico(id_servico);
		return ResponseEntity.ok().body(servico);
	}
	
	@GetMapping("/servico-cargo{id_cargo}")
	public ResponseEntity<Servico> buscarServicoCargo(@PathVariable Integer id_cargo) {
		Servico servico = servicoService.buscarServicoCargo(id_cargo);
		return ResponseEntity.ok().body(servico);	
}
	
	@PutMapping("/servico/{id_servico}")
	public ResponseEntity<Servico> editarServico(@RequestParam(value="cargo", required = false) Integer id_cargo, @PathVariable Integer id_servico, @RequestBody Servico servico){
		servico.setId_servico(id_servico);
		servico = servicoService.editarServico(id_cargo,servico);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/servico")
	public ResponseEntity<Servico> inserirServico(@RequestParam(value="servico", required=false)Integer id_cargo,@RequestBody Servico servico){
		servico = servicoService.inserirServico(id_cargo, servico);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(servico.getId_servico()).toUri();
		return ResponseEntity.created(uri).build();
		
	}
}			

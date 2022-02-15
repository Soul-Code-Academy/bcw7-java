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

import soulCodeAcademy.EmpresaAsd.models.Cargo;
import soulCodeAcademy.EmpresaAsd.services.CargoService;

@CrossOrigin
@RestController
@RequestMapping("empresa")
public class CargoController {
	@Autowired
	private CargoService cargoService;
	
	@GetMapping("/cargo")
	public List<Cargo> mostrarTodosCargos(){
		List<Cargo> cargo = cargoService.mostrarTodosCargos();
		return cargo;
	}
	
	@GetMapping("/cargo/{id_cargo}")
	public ResponseEntity<?>buscarUmCargo(@PathVariable Integer id_cargo){
		Cargo cargo = cargoService.buscarUmCargo(id_cargo);
		return ResponseEntity.ok().body(cargo);
	}
	
	@PostMapping("/cargo")
	public ResponseEntity<Void>inserirCargo(@RequestBody Cargo cargo){
		
		cargo = cargoService.inserirCargo(cargo);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cargo.getId_cargo()).toUri();
		return ResponseEntity.created(uri).build()
;	}
	
	@DeleteMapping("/cargo/{id_cargo}")
	public ResponseEntity<Void>deletarUmCargo(@PathVariable Integer id_cargo){
		cargoService.deletarUmCargo(id_cargo);
		return  ResponseEntity.noContent().build();
	}
	
	@PutMapping("/cargo/{id_cargo}")
	public ResponseEntity<Void>editarTurma(@PathVariable Integer id_cargo, @RequestBody Cargo cargo){
		cargo.setId_cargo(id_cargo);
		cargo = cargoService.editarCargo(cargo);
		return ResponseEntity.noContent().build();
	}
	
}

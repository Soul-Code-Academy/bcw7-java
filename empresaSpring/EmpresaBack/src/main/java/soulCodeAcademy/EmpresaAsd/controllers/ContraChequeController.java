package soulCodeAcademy.EmpresaAsd.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import soulCodeAcademy.EmpresaAsd.models.ContraCheque;
import soulCodeAcademy.EmpresaAsd.services.ContraChequeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("empresa")
public class ContraChequeController {

    @Autowired
    private ContraChequeService contraChequeService;

    @GetMapping(value = "/funcionario/contraCheque")
    public List<ContraCheque> buscarTodosContraCheques() {
        List<ContraCheque> contraCheque = contraChequeService.buscarTodosContraCheques();
        return contraCheque;
    }

    @GetMapping("/funcionario/contraCheque/{matricula}")
    public ResponseEntity<ContraCheque> buscarUmContraCheque(@PathVariable Integer matricula) {
        ContraCheque contraCheque = contraChequeService.buscarUmContraCheque(matricula);
        return ResponseEntity.ok().body(contraCheque);
    }
    

    @GetMapping("/funcionario/contraCheque-funcionario/{id_funcionario}")
    public List<ContraCheque> buscarContrasChequesDoFuncionario(@PathVariable Integer id_funcionario) {
        List<ContraCheque> contraCheque = contraChequeService.buscarContrasChequesDoFuncionario(id_funcionario);
        return contraCheque;
    }
    
    @PostMapping("/funcionario/contraCheque/{id_funcionario}")
	public ResponseEntity<ContraCheque> inserirContraCheque(@RequestBody ContraCheque contraCheque, @PathVariable Integer id_funcionario){
		contraCheque = contraChequeService.inserirContraCheque(contraCheque,id_funcionario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(contraCheque.getMatricula()).toUri();
		return ResponseEntity.created(uri).build();
		
	}
	
	@DeleteMapping("/funcionario/contraCheque/{matricula}")
	public ResponseEntity<Void> deletarUmBoleto(@PathVariable Integer matricula){
		contraChequeService.deletarUmContraCheque(matricula);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/funcionario/contraCheque/{matricula}/{id_funcionario}")
	public ResponseEntity<ContraCheque> editarContraCheque( @RequestBody ContraCheque contraCheque, @PathVariable Integer matricula, @PathVariable Integer id_funcionario){
		contraCheque.setMatricula(matricula);
		contraCheque = contraChequeService.editarContraCheque(contraCheque, id_funcionario, matricula);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/funcionario/pagar-contraCheque/{matricula}")
	public ResponseEntity<ContraCheque> quitarContraCheque(@PathVariable Integer matricula){
		contraChequeService.quitarContraCheque(matricula);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/funcionario/cancelar-contraCheque/{matricula}")
	public ResponseEntity<ContraCheque> cancelarContraCheque(@PathVariable Integer matricula){
		contraChequeService.cancelarContraCheque(matricula);
		return ResponseEntity.noContent().build();
	}
}

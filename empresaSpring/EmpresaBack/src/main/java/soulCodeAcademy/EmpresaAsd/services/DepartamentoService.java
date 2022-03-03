package soulCodeAcademy.EmpresaAsd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulCodeAcademy.EmpresaAsd.models.Cargo;
import soulCodeAcademy.EmpresaAsd.models.Departamento;
import soulCodeAcademy.EmpresaAsd.repositorys.DepartamentoRepository;


@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Autowired
	private CargoService cargoService;
	
	public List<Departamento> mostrarTodosDepartamentos(){
		return departamentoRepository.findAll();	
	}
	
	public Departamento mostrarUmDepartamento(Integer id_departamento) {
		Optional<Departamento> departamento = departamentoRepository.findById(id_departamento);
		return departamento.orElseThrow();
	}
	
	public Departamento buscarDepartamentoDoCargo(Integer id_cargo){
		Departamento departamento = departamentoRepository.buscarDepartamentoDoCargo(id_cargo);
		return departamento;
	}
	
	public List<Departamento> departamentoSemCargo(){
		return departamentoRepository.departamentoSemCargo();
	}
	
	public List<List> departamentoComSeuCargo(){
		return departamentoRepository.departamentoComSeuCargo();
	}
	
	public Departamento inserirDepartamento(Integer id_cargo, Departamento departamento) {
		departamento.setId_departamento(null);
		
		if(id_cargo != null) {
			Cargo cargo = cargoService.buscarUmCargo(id_cargo);
			departamento.setCargo(cargo);		
		}
		return departamentoRepository.save(departamento);	
	}
	
	public Departamento editarDepartamento(Departamento departamento) {
		mostrarUmDepartamento(departamento.getId_departamento());
		return departamentoRepository.save(departamento);
	}
	
}
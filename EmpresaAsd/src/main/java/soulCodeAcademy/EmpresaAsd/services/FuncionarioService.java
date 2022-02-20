package soulCodeAcademy.EmpresaAsd.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulCodeAcademy.EmpresaAsd.models.Funcionario;
import soulCodeAcademy.EmpresaAsd.repositorys.FuncionarioRepository;
import soulCodeAcademy.EmpresaAsd.models.Cargo;
import soulCodeAcademy.EmpresaAsd.services.exceptions.ObjectNotFoundException;

@Service
public class FuncionarioService {

//	Fazendo injeção de dependência
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private CargoService cargoService;
	
//	O primeiro serviço que vamos implementar é a listagem de todos os funcionários cadastrados
	public List<Funcionario> findAll() {
		return funcionarioRepository.findAll();
	}

	public Funcionario buscarUmFuncionario(Integer id_funcionario) {
		Optional<Funcionario> funcionario = funcionarioRepository.findById(id_funcionario);
		return funcionario.orElseThrow();
	}

	public Funcionario inserirFuncionario(Integer id_cargo, Funcionario funcionario) {
		funcionario.setId_funcionario(null);
		Cargo cargo = cargoService.buscarUmCargo(id_cargo);
		funcionario.setCargo(cargo);
		return funcionarioRepository.save(funcionario);
	}

	public void deletarUmFuncionario(Integer id_funcionario) {
		funcionarioRepository.deleteById(id_funcionario);
	}

	public Funcionario editarFuncionario(Funcionario funcionario) {
		buscarUmFuncionario(funcionario.getId_funcionario());
		return funcionarioRepository.save(funcionario);
	}
	
	public List<Funcionario> buscarFuncionarioCargo(Integer id_cargo){
		List <Funcionario> funcionario = funcionarioRepository.fetchByCargo(id_cargo);
		return funcionario;
	}
}


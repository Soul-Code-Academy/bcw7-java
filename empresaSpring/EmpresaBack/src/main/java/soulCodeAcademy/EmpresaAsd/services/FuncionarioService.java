package soulCodeAcademy.EmpresaAsd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulCodeAcademy.EmpresaAsd.models.Cargo;
import soulCodeAcademy.EmpresaAsd.models.Funcionario;
import soulCodeAcademy.EmpresaAsd.repositorys.FuncionarioRepository;
import soulCodeAcademy.EmpresaAsd.services.exceptions.ObjectNotFoundException;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private CargoService cargoService;
	
	public List<Funcionario> findAll() {
		return funcionarioRepository.findAll();
	}

	public List<List> funcionariosComCargo() {
		return funcionarioRepository.funcionarioComCargo();
	}

	public Funcionario buscarUmFuncionario(Integer id_funcionario) {
		Optional<Funcionario> funcionario = funcionarioRepository.findById(id_funcionario);
		return funcionario.orElseThrow();
	}

	public Funcionario inserirFuncionario(Funcionario funcionario) {
		funcionario.setId_funcionario(null);
		return funcionarioRepository.save(funcionario);
	}


	public void deletarUmFuncionario(Integer id_funcionario) {
		funcionarioRepository.deleteById(id_funcionario);
	}

	public Funcionario editarFuncionario(Funcionario funcionario) {
		buscarUmFuncionario(funcionario.getId_funcionario());
		return funcionarioRepository.save(funcionario);
	}

	public List<Funcionario> buscarFuncionarioCargo(Integer id_cargo) {
		List<Funcionario> funcionario = funcionarioRepository.fetchByCargo(id_cargo);
		return funcionario;
	}
	
	public Funcionario buscarFuncionarioPeloCpf(String func_cpf){
		Funcionario funcionario= funcionarioRepository.fetchByCpf(func_cpf);
		return funcionario;
	}

	public Funcionario inserirFuncionarioNoCargo(Integer id_funcionario, Cargo cargo) {
		Funcionario funcionario = buscarUmFuncionario(id_funcionario);
		funcionario.setCargo(cargo);
		return funcionarioRepository.save(funcionario);
	}

	public Funcionario deixarFuncionarioSemCargo(Integer id_funcionario) {
		Funcionario funcionario = buscarUmFuncionario(id_funcionario);
		funcionario.setCargo(null);
		return funcionarioRepository.save(funcionario);
	}
	
	public Funcionario salvarFoto(Integer id_funcionario, String caminhoFoto){
		Funcionario funcionario = buscarUmFuncionario(id_funcionario);
		funcionario.setFunc_foto(caminhoFoto);
		return funcionarioRepository.save(funcionario);
	}

}

package soulCodeAcademy.EmpresaAsd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulCodeAcademy.EmpresaAsd.models.Cargo;
import soulCodeAcademy.EmpresaAsd.models.Servico;
import soulCodeAcademy.EmpresaAsd.repositorys.CargoRepository;
import soulCodeAcademy.EmpresaAsd.repositorys.ServicoRepository;


@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;
	
	@Autowired
	private CargoService cargoService;
	
	@Autowired
	private CargoRepository cargoRepository;
	
	public List<Servico> mostrarTodosServicos(){
		return servicoRepository.findAll();
	}
	
	public Servico mostrarUmServico(Integer id_servico) {
		Optional<Servico> servico = servicoRepository.findById(id_servico);
		return servico.orElseThrow();
	}
	
	public Servico buscarServicoCargo(Integer id_cargo) {
		Servico servico = servicoRepository.buscarServicoCargo(id_cargo);
		return servico;
	}
	
	public Servico inserirServico(Integer id_cargo, Servico servico) {
		servico.setId_servico(null);
			if(id_cargo != null) {
				Cargo cargo = cargoService.buscarUmCargo(id_cargo);
				servico.setCargo(cargo);
				cargo.setServico(servico);
			
	}
	return servicoRepository.save(servico);
}
	

	public Servico editarServico(Integer id_cargo, Servico servico) {
		
			if(id_cargo != null) {
				Servico servicoAnterior = mostrarUmServico(servico.getId_servico());
				Cargo cargoAnterior = servicoAnterior.getCargo();
					if(cargoAnterior != null) {
						cargoAnterior.setServico(null);
						cargoRepository.save(cargoAnterior);
				}
				Cargo cargo = cargoService.buscarUmCargo(id_cargo);
				servico.setCargo(cargo);
				cargo.setServico(servico);
			}
			return servicoRepository.save(servico);
	}
}

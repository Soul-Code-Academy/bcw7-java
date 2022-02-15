package soulCodeAcademy.EmpresaAsd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulCodeAcademy.EmpresaAsd.models.Cargo;
import soulCodeAcademy.EmpresaAsd.repositorys.CargoRepository;


@Service
public class CargoService {
	@Autowired
	private CargoRepository cargoRepository;
	
	public List<Cargo>mostrarTodosCargos(){
		return cargoRepository.findAll();	
		}
	
	public Cargo buscarUmCargo(Integer id_cargo) {
		Optional<Cargo>cargo = cargoRepository.findById(id_cargo);
		return cargo.orElseThrow();
		}
	
	public Cargo inserirCargo(Cargo cargo) {
		return cargoRepository.save(cargo);
		}
	
	public void deletarUmCargo(Integer id_cargo) {
		cargoRepository.deleteById(id_cargo);
		}
	
	public Cargo editarCargo(Cargo cargo) {
		buscarUmCargo(cargo.getId_cargo());
		return cargoRepository.save(cargo);
		}
		
}

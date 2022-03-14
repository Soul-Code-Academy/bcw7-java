package soulCodeAcademy.EmpresaAsd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.EmpresaAsd.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer>{

	@Query(value="SELECT * FROM cargo WHERE id_departamento is null", nativeQuery = true)
	List<Cargo> cargoSemDepartamento();
	
	@Query(value="SELECT * FROM cargo where id_departamento= :id_departamento",nativeQuery = true)
	Cargo cargoDoDepartamento(Integer id_departamento);
	
	@Query(value="SELECT cargo.id_cargo,cargo.ca_nome,cargo.ca_atribuicao,departamento.id_departamento,departamento.dep_nome FROM cargo left JOIN departamento ON departamento.id_cargo = cargo.id_cargo order by cargo.ca_nome;",nativeQuery = true)
	List<List> cargoComSeuDepartamento();
	
	 

}

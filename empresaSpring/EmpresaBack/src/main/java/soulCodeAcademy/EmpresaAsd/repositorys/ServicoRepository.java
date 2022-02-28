package soulCodeAcademy.EmpresaAsd.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.EmpresaAsd.models.Servico;

public interface ServicoRepository extends JpaRepository<Servico,Integer>{
	@Query(value= "SELECT * FROM servico WHERE id_cargo= :id_cargo", nativeQuery = true)
	Servico buscarServicoCargo(Integer id_cargo);
}

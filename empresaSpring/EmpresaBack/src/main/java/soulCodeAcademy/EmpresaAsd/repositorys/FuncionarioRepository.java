package soulCodeAcademy.EmpresaAsd.repositorys;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.EmpresaAsd.models.Funcionario;


public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer>{
	
	@Query(value = "SELECT * FROM funcionario WHERE id_cargo = :id_cargo", nativeQuery = true)
	List<Funcionario> fetchByCargo(Integer id_cargo);
	
	@Query(value = "SELECT id_funcionario,func_foto,func_nome,func_cpf,func_telefone,func_email,func_cep,func_cidade,func_bairro,func_rua,func_numero,func_referencia,func_estado,ca_nome,ca_atribuicao FROM cargo right JOIN funcionario ON funcionario.id_cargo = cargo.id_cargo order by func_nome",nativeQuery = true)
	List<List> funcionariosComCargo();

	@Query(value = "SELECT * FROM funcionario WHERE func_cpf = :func_cpf", nativeQuery = true)
	Funcionario fetchByCpf(String func_cpf);
}





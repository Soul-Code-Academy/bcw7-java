package soulCodeAcademy.EmpresaAsd.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import soulCodeAcademy.EmpresaAsd.models.Funcionario;



	//Estendemos o JPA Repository para acessar seus métodos
	public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer>{
		
	}



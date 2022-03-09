package soulCodeAcademy.EmpresaAsd.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.EmpresaAsd.models.ContraCheque;

public interface ContraChequeRepository extends JpaRepository<ContraCheque, Integer> {
	 @Query(value = "SELECT * FROM bd_empresa.contra_cheque WHERE id_funcionario= :id_funcionario", nativeQuery = true)
	    List<ContraCheque> buscarContrasChequesDoFuncionario(Integer id_funcionario);
}

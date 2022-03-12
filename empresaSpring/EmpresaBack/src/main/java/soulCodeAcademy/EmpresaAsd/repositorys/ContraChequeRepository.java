package soulCodeAcademy.EmpresaAsd.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import soulCodeAcademy.EmpresaAsd.models.ContraCheque;

public interface ContraChequeRepository extends JpaRepository<ContraCheque, Integer> {
	 @Query(value = "SELECT * FROM bd_empresa.contra_cheque WHERE id_funcionario= :id_funcionario", nativeQuery = true)
	    List<ContraCheque> buscarContrasChequesDoFuncionario(Integer id_funcionario);
	 
//	 @Query(value = "SELECT matricula,cc_descricao,cc_pis,cc_bonificacao, cc_auxilioAlimentacao,cc_auxilioTransporte,cc_dataAdmissao, cc_dataPagamento, ca_nome FROM cargo right JOIN contraCheque ON contraCheque.matricula = cargo.id_cargo", nativeQuery = true)
//		List<List> contraCheques();
}

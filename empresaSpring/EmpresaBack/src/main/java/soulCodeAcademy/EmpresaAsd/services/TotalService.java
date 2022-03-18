package soulCodeAcademy.EmpresaAsd.services;


import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import soulCodeAcademy.EmpresaAsd.models.ContraCheque;

class TotalService {

	@PersistenceContext
	private EntityManager manager;


	public BigDecimal somaContraCheque(ContraCheque contraCheque) {
		TypedQuery<BigDecimal> query = manager.createQuery(
				"SELECT SUM(cc_auxilio_alimentacao + cc_auxilio_transporte + cc_bonificacao + cc_valor) as cc_total FROM bd_empresa.contra_cheque WHERE matricula = :matricula",BigDecimal.class);
		query.setParameter("contraCheque",contraCheque);
		return query.getSingleResult();
	}

	
}
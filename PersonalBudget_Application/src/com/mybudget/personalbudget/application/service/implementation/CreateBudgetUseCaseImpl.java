package com.mybudget.personalbudget.application.service.implementation;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybudget.personalbudget.application.entityassembler.EntityAssembler;
import com.mybudget.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mybudget.personalbudget.crosscutting.exeption.NgException;
import com.mybudget.personalbudget.crosscutting.exeption.TipoExcepcionEnum;
import com.mybudget.personalbudget.domain.BudgetDomain;
import com.mybudget.personalbudget.entity.BudgetEntity;
import com.mybudget.personalbudget.infrastructure.data.interfaces.BudgetRepository;

@Service
@Transactional
public  class CreateBudgetUseCaseImpl implements CreateBudgetUseCase{

	@Autowired
	private EntityAssembler<BudgetEntity,BudgetDomain> entityAssembler;
	
	@Autowired
	private BudgetRepository budgetRepository;
	
	@Override
	public void execute(final BudgetDomain budget) {
		NgException.crear(TipoExcepcionEnum.NEGOCIO, "hola", "hola");
		//budgetRepository.save(entityAssembler.assemblerEntity(budget));
	}

}
 
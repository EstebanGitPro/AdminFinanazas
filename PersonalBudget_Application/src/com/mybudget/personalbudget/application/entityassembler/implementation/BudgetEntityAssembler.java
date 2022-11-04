package com.mybudget.personalbudget.application.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mybudget.personalbudget.application.entityassembler.EntityAssembler;
import com.mybudget.personalbudget.domain.BudgetDomain;
import com.mybudget.personalbudget.entity.BudgetEntity;


@Component
public class BudgetEntityAssembler implements EntityAssembler<BudgetEntity , BudgetDomain> {

	@Override
	public BudgetDomain assemblerDomain(BudgetEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BudgetEntity assemblerEntity(BudgetDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}





}

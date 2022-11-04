package com.mybudget.personalbudget.application.command.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybudget.personalbudget.application.command.interfaces.CreateBudgetCommand;
import com.mybudget.personalbudget.application.dtoassembler.DTOAssembler;
import com.mybudget.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mybudget.personalbudget.domain.BudgetDomain;
import com.mybudget.personalbudget.dto.BudgetDTO;

@Service
public class CreateBudgetCommandImpl implements CreateBudgetCommand {

	private DTOAssembler<BudgetDTO, BudgetDomain> dtoAssembler;
	
	@Autowired
	private CreateBudgetUseCase useCase;
	
	@Override
	public void execute(BudgetDTO budget) {
		useCase.execute(dtoAssembler.assemblerDomain(budget));
	}

}

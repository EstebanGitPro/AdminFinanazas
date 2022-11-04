package com.mybudget.personalbudget.application.dtoassembler.implementation;

import org.springframework.stereotype.Component;

import com.mybudget.personalbudget.application.dtoassembler.DTOAssembler;
import com.mybudget.personalbudget.crosscutting.UtilUUID;
import com.mybudget.personalbudget.domain.BudgetDomain;
import com.mybudget.personalbudget.domain.YearDomain;
import com.mybudget.personalbudget.domain.builder.YearDomainBuilder;
import com.mybudget.personalbudget.dto.BudgetDTO;
import com.mybudget.personalbudget.dto.YearDTO;

@Component
public class BudgetDTOassembler implements DTOAssembler<BudgetDTO , BudgetDomain> {

	@Override
	public BudgetDomain assemblerDomain(BudgetDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BudgetDTO assemblerDTO(BudgetDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}


	

}

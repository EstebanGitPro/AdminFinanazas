package com.mybudget.personalbudget.application.command.interfaces;

import com.mybudget.personalbudget.dto.BudgetDTO;

public interface CreateBudgetCommand {
	
	void execute(BudgetDTO budget);

}

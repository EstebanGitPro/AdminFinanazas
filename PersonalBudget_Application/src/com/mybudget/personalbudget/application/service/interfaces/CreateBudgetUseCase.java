package com.mybudget.personalbudget.application.service.interfaces;

import com.mybudget.personalbudget.domain.BudgetDomain;

public interface CreateBudgetUseCase {

	void execute(BudgetDomain budget);
}

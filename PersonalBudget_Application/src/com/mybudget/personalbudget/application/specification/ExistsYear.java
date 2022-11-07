package com.mybudget.personalbudget.application.specification;

import java.time.LocalDate;


import com.mybudget.personalbudget.domain.YearDomain;


public class ExistsYear extends CompositeSpecification<YearDomain> {
	
	private static final int nextYear = LocalDate.now().plusYears(1).getYear();

	@Override
	public boolean isSatisfiedBy(YearDomain year) {
		return year.getYear() == nextYear;
	}
	
	

}

package com.mybudget.personalbudget.application.specification.implementation;

import java.time.LocalDate;

import com.mybudget.personalbudget.application.specification.CompositeSpecification;
import com.mybudget.personalbudget.domain.YearDomain;


public class NextsYear extends CompositeSpecification<YearDomain> {
	
	private static final int nextYear = LocalDate.now().plusYears(1).getYear();

	@Override
	public boolean isSatisfiedBy(YearDomain year) {
		return year.getYear() == nextYear;
	}
	
	

}

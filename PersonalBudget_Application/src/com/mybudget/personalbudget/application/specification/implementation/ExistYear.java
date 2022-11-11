package com.mybudget.personalbudget.application.specification.implementation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybudget.personalbudget.application.specification.CompositeSpecification;
import com.mybudget.personalbudget.domain.YearDomain;
import com.mybudget.personalbudget.infrastructure.data.interfaces.YearRepository;

public class ExistYear extends CompositeSpecification<YearDomain>  {

	
	private static final int existYear = LocalDate.now().getYear();
	
	
	
	@Override
	public boolean isSatisfiedBy(YearDomain year) {
		return year.getYear() == existYear;
	}

	
	
	

}

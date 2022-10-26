package com.mybudget.personalbudget.domain.builder;

import java.util.UUID;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
import static com.mybudget.personalbudget.crosscutting.UtilUUID.getDefauultUUID;
import com.mybudget.personalbudget.domain.BudgetDomain;
import com.mybudget.personalbudget.domain.PersonDomain;
import com.mybudget.personalbudget.domain.YearDomain;

public class BudgetDomainBuilder {
	
	private UUID id;
	private YearDomain year;
	private PersonDomain person;
	
	
	public BudgetDomainBuilder() {
		setId(DEFAULT_UUID);
		setYear(year);
		setPerson(person);
	}
	
	//Setters
	
	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();
	}

	public final BudgetDomainBuilder setId(final UUID id) {
		this.id = getDefauultUUID(id);
		return this;
	}

	public final BudgetDomainBuilder setYear(final YearDomain year) {
		this.year = (year == null) ? YearDomainBuilder.get().build(): year;
		return this;
	}

	private final BudgetDomainBuilder setPerson(final PersonDomain person) {
		this.person = (person == null) ? PersonDomainBuilder.get().build(): person;
		return this;
	}
	
	
	public final BudgetDomain build() {
		return BudgetDomain.create(id, year, person);
	}
	

}

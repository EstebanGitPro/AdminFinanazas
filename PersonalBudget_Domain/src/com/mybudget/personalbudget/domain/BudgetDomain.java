package com.mybudget.personalbudget.domain;


import java.util.UUID;

//import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
import static com.mybudget.personalbudget.crosscutting.UtilUUID.getDefauultUUID;
import com.mybudget.personalbudget.domain.builder.PersonDomainBuilder;
import com.mybudget.personalbudget.domain.builder.YearDomainBuilder;

public class BudgetDomain {
	
	private UUID id;
	private YearDomain year;
	private PersonDomain person;
	
	
	
	//constructor 
	
	private BudgetDomain(final UUID id, final YearDomain year, final PersonDomain person) {
		setId(id);
		setYear(year);
		setPerson(person);
	}
	
	//Creacional

	public static final  BudgetDomain create(final UUID id,final YearDomain year, final PersonDomain person){
		
		return new BudgetDomain(id, year,person );
		
	}
	
	
	
	//setter
	private final void setYear(YearDomain year) {
		this.year = (year == null) ? YearDomainBuilder.get().build(): year;
	}
	
	private final void setId(UUID id) {
		this.id =  getDefauultUUID(id);
		
	}
	



	private final void setPerson(PersonDomain person) {
		this.person = (person == null) ? PersonDomainBuilder.get().build(): person;
	}

 

}

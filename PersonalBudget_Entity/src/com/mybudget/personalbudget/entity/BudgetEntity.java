package com.mybudget.personalbudget.entity;

import java.util.UUID;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;;

public class BudgetEntity {
	
	/*UUID es por que se esta mapeando la entidad en bases de datos
	 * La manera más sencilla de generar un UUID (Universally Unique Identifier) es mediante la clase
	 * randomUUID
	 *  */
	private UUID id;
	private YearEntity year;
	private PersonEntity person;
	
	

	//Creamos los contructores
	
	public BudgetEntity() {
		setId(DEFAULT_UUID);
		setYear(new YearEntity());
		setPerson(new PersonEntity());
	}
	
	public BudgetEntity(final YearEntity year, final PersonEntity person) {
		setYear(year);
		setPerson(person);
	}
	
	



	public final YearEntity getYear() {
		if(year == null) {
			setYear(new YearEntity());
		}
		return year;
	}



	public final void setYear(final YearEntity year) {
		this.year = year;
	}



	public final PersonEntity getPerson() {
		if(person == null) {
			setPerson( new PersonEntity());
		}
		return person;
	}



	public final void setPerson(final PersonEntity person) {
		this.person = person;
	}

	
	
	public static final BudgetEntity create() {
		return new BudgetEntity();
	}

	public UUID getId() {
		if(id == null) {
			setId(DEFAULT_UUID);
		}
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
}

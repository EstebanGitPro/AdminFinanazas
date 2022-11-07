package com.mybudget.personalbudget.domain.builder;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
import static com.mybudget.personalbudget.crosscutting.UtilUUID.getDefauultUUID;

import java.util.UUID;

import com.mybudget.personalbudget.domain.PersonDomain;

public class PersonDomainBuilder {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middlename;
	private String firstSurname;
	private String secondSurname;
	
	
	
	//Constructor y poner los Sets
	private PersonDomainBuilder() {
		setId(DEFAULT_UUID);
		setIdCard ("");
		setFirstName ("");
		setMiddlename ("");
		setFirstSurname ("");
		setSecondSurname ("");
	
	}
	
	
	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	
	}
	
	
	//Setters
	public final PersonDomainBuilder setId(final UUID id) {
		this.id = getDefauultUUID(id);
		return this;
	}


	public final PersonDomainBuilder setIdCard(String idCard) {
		this.idCard = (idCard == null) ? "":idCard.trim();
		return this;
	}


	public final PersonDomainBuilder setFirstName(String firstName) {
		this.firstName = (firstName == null) ? "":firstName.trim();
		return this;
	}


	public final PersonDomainBuilder setMiddlename(String middlename) {
		this.middlename = (middlename == null)? "":middlename.trim();
		return this;
	}


	public final PersonDomainBuilder setFirstSurname(String firstSurname) {
		this.firstSurname = (firstSurname == null)? "": firstSurname.trim();
		return this;
	}


	public final PersonDomainBuilder setSecondSurname(String secondSurname) {
		this.secondSurname = (secondSurname == null) ? "": secondSurname.trim();
		return this;
	}

	
	//Getters
	
	


	public PersonDomain build() {/*Obtenemos el id y el year actual
	osea que con este metodo estamos returnando un objeto de tipo PesonDomain*/
		return PersonDomain.create(id, idCard, firstName, middlename, firstSurname,
				secondSurname, firstName);
	}


	public final UUID getId() {
		return id;
	}


	public final String getIdCard() {
		return idCard;
	}


	public final String getFirstName() {
		return firstName;
	}


	public final String getMiddlename() {
		return middlename;
	}


	public final String getFirstSurname() {
		return firstSurname;
	}


	public final String getSecondSurname() {
		return secondSurname;
	}
	

}
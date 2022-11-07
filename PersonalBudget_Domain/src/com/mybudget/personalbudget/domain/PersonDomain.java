package com.mybudget.personalbudget.domain;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
import static com.mybudget.personalbudget.crosscutting.UtilUUID.getDefauultUUID;

import java.util.UUID;

public class PersonDomain {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middlename;
	private String firstSurname;
	private String secondSurname;
	private String lastName;
	
	
	//constructor
	 
	private PersonDomain(final UUID id,final String idCard,final String firstName,final String middlename,final String firstSurname,
			final String secondSurname,final String lastName) {
		
		setId (id);
		setIdCard (idCard);
		setFirstName (firstName);
		setMiddlename (middlename);
		setFirstSurname (firstSurname);
		setSecondSurname (secondSurname);
		setLastName (lastName);
	}
	
	//Metodo para crear un PersonDomain
	public static PersonDomain create(final UUID id,final String idCard,final String firstName,final String middlename,final String firstSurname,
			final String secondSurname,final String lastName) {
		
		return new PersonDomain(id, idCard,  firstName, middlename, firstSurname,
				 secondSurname, lastName);
	}
	
	//Setters
	
	private final void setId(UUID id) {
		this.id = getDefauultUUID(id);
		
	}


	private final void setIdCard(String idCard) {
		this.idCard = (idCard == null)? "": idCard.trim();
	}


	private final void setFirstName(String firstName) {
		this.firstName = (firstName == null)? "": firstName.trim();
	}


	private final void setMiddlename(String middlename) {
		this.middlename = (middlename == null)? "": middlename.trim();
	}


	private final void setFirstSurname(String firstSurname) {
		this.firstSurname = (firstSurname == null)? "":firstSurname.trim();
	}


	private final void setSecondSurname(String secondSurname) {
		this.secondSurname = (secondSurname == null)? "":secondSurname.trim();
	}


	private final void setLastName(String lastName) {
		this.lastName = (lastName == null)? "":lastName.trim();
	}

	
	//Getters pueden ser publico

	public final UUID getId() {
		if(id == null) {
			setId(DEFAULT_UUID);
		}
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


	//algo de logica
	//Surname = segundo apllido
	public final String getLastName() {
		return (getFirstSurname() +" "+getSecondSurname()).trim();
	}
	
	//Este metodo obtiene el nombre completo
	public final String getName() {
		return (getFirstName() +" "+getMiddlename()).trim();
	}
	
	public final String getCompleteName() {
		return getName()+" "+ getLastName();
	}
	
	
	
	
	
	
}
	
	

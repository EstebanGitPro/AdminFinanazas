package com.mybudget.personalbudget.entity;

import java.util.UUID;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
//import static com.mybudget.personalbudget.crosscutting.UtilUUID.getDefauultUUID;

public class PersonEntity {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firtstSurname;
	private String secondSurName;
	
	
	
	//Constructor 1
	public PersonEntity() {
		setId(DEFAULT_UUID);
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirtstSurname("");
		setSecondSurName("");
			
		
	}
	
	//cosntructor 2
	
	public PersonEntity(final UUID id,final String idCard,final String firstName,final String middleName,final String firtstSurname,
			final String secondSurName) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirtstSurname(firtstSurname);
		setSecondSurName(secondSurName);
		
	}
	
	/*controlamos los nulos en los getters*/
	public final UUID getId() {
		if(id == null) {
			setId(DEFAULT_UUID);
		}
		return id;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}

	public final String getIdCard() {
		if(idCard == null) {
			setIdCard("");
		}
		return idCard.trim();
	}

	public final void setIdCard(final String idCard) {
		this.idCard = idCard;
	}

	public final String getFirstName() {
		if(firstName == null) {
			setFirstName("");
		}
		return firstName.trim();
	}

	public final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public final String getMiddleName() {
		if(middleName == null) {
			setMiddleName("");
		}
		return middleName.trim();
	}

	public final void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public final String getFirtstSurname() {
		if(firtstSurname == null) {
			setFirtstSurname("");
		}
		
		return firtstSurname.trim();
	}

	public final void setFirtstSurname(final String firtstSurname) {
		this.firtstSurname = firtstSurname;
	}

	public final String getSecondSurName() {
		if(secondSurName == null) {
			setSecondSurName("");
		}
		return secondSurName.trim();
	}

	public final void setSecondSurName(final String secondSurName) {
		this.secondSurName = secondSurName;
	}

	
	
	public static final PersonEntity create() {
		return new PersonEntity();
	}
	
	

}

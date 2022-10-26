package com.mybudget.personalbudget.dto;

public class PersonDTO {
	
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firtstSurname;
	private String secondSurName;
	private String name;
	private String lastName;
	private String completeName;
	
	
	//Constructor 1
	public PersonDTO() {
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirtstSurname("");
		setSecondSurName("");
		setName("");
		setLastName("");
		setCompleteName("");
			
		
	}
	
	//cosntructor 2
	@SuppressWarnings("squid:S107")// con esto le decimos a sonarlint que omita la advertencia para estemetodo
	public PersonDTO(final String id,final String idCard,final String firstName,final String middleName,final String firtstSurname,
			final String secondSurName,final String name,final String lastName,final String completeName) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirtstSurname(firtstSurname);
		setSecondSurName(secondSurName);
		setName(name);
		setLastName(lastName);
		setCompleteName(completeName);
		
	}
	
	/*controlamos los nulos en los getters*/
	public final String getId() {
		if(id == null) {
			setId("");
		}
		return id.trim();
	}

	public final void setId(final String id) {
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

	public final String getName() {
		if(name == null) {
			setName("");
		}
		return name.trim();
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final String getLastName() {
		if(lastName == null) {
			setLastName("");
		}
		return lastName.trim();
	}

	public final void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public final String getCompleteName() {
		if(completeName == null) {
			setCompleteName("");
		}
		return completeName.trim();
	}

	public final void setCompleteName(final String completeName) {
		this.completeName = completeName;
	}
	
	public static final PersonDTO create() {
		return new PersonDTO();
	}
	
	

	

}

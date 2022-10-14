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
	
	
	public PersonDTO() {
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirtstSurname();
		setSecondSurName();
		setName("");
		setLastName("");
		setCompleteName("");
			
		
	}
	
	//cosntructor
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

	private void setCompleteName() {
		// TODO Auto-generated method stub
		
	}

	private void setLastName() {
		// TODO Auto-generated method stub
		
	}

	private void setName() {
		// TODO Auto-generated method stub
		
	}

	private void setSecondSurName(String secondSurName2) {
		// TODO Auto-generated method stub
		
	}

	private void setFirtstSurname(String firtstSurname2) {
		// TODO Auto-generated method stub
		
	}

	private void setCompleteName(String string) {
		// TODO Auto-generated method stub
		
	}


	

	private void setLastName(String string) {
		// TODO Auto-generated method stub
		
	}


	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}


	private void setSecondSurName() {
		// TODO Auto-generated method stub
		
	}


	private void setFirtstSurname() {
		// TODO Auto-generated method stub
		
	}


	private void setMiddleName(String string) {
		// TODO Auto-generated method stub
		
	}


	private void setFirstName(String string) {
		// TODO Auto-generated method stub
		
	}


	private void setIdCard(String string) {
		// TODO Auto-generated method stub
		
	}


	private void setId(String string) {
		// TODO Auto-generated method stub
		
	}

}

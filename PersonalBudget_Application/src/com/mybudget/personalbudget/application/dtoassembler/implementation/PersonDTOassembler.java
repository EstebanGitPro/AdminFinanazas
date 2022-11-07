package com.mybudget.personalbudget.application.dtoassembler.implementation;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.getStringFromUUID;
import static com.mybudget.personalbudget.crosscutting.UtilUUID.getUUIDFromString;

import com.mybudget.personalbudget.application.dtoassembler.DTOAssembler;
import com.mybudget.personalbudget.domain.PersonDomain;

import com.mybudget.personalbudget.domain.builder.PersonDomainBuilder;

import com.mybudget.personalbudget.dto.PersonDTO;


public class PersonDTOassembler implements DTOAssembler<PersonDTO , PersonDomain> {

	@Override
	public PersonDomain assemblerDomain(PersonDTO dto) {
		// TODO Auto-generated method stub
				return null;
	}

	@Override
	public PersonDTO assemblerDTO(PersonDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

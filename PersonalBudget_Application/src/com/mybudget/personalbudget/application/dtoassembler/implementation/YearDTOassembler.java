package com.mybudget.personalbudget.application.dtoassembler.implementation;

import com.mybudget.personalbudget.application.dtoassembler.DTOAssembler;
import com.mybudget.personalbudget.crosscutting.UtilUUID;
import com.mybudget.personalbudget.domain.YearDomain;
import com.mybudget.personalbudget.domain.builder.YearDomainBuilder;
import com.mybudget.personalbudget.dto.YearDTO;

public class YearDTOassembler implements DTOAssembler<YearDTO , YearDomain> {

	@Override
	public YearDomain assemblerDomain(YearDTO dto) {
		YearDomain domain = YearDomainBuilder.get().build();
		if(dto != null) {
			domain = YearDomainBuilder.get()
									  .setId(UtilUUID.getUUIDFromString(dto.getId()))
									  .setYear(dto.getYear()).build();
		}
		return domain;
	}

	@Override
	public YearDTO assemblerDTO(YearDomain domain) {
		
		YearDTO dto = new YearDTO();
		if(domain != null) {
			dto = new YearDTO(UtilUUID.getStringFromUUID(domain.getId()), domain.getYear());
		}
		return dto;
	}

}

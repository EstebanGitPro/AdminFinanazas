package com.mybudget.personalbudget.application.dtoassembler;

//DTO = T y Domai = D
public interface DTOAssembler<T, D> {
	
	D assemblerDomain(T dto);
	T assemblerDTO(D Domain);

}

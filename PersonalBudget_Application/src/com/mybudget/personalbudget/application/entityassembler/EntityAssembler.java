package com.mybudget.personalbudget.application.entityassembler;

//Entity = E y Domai = D
public interface EntityAssembler<E, D> {
	
	D assemblerDomain(E entity);
	E assemblerEntity(D domain);

}

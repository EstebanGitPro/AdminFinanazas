package com.mybudget.personalbudget.crosscutting.exeption;

public enum ComponenteEnum {
	
	GENERAL,DATA,DOMAIN, DTO,ENTITY,INFRASTRUCTURE,SPECIFICATION,API,APPLICATION,CROSSCUTTING;

	public static ComponenteEnum obtenerDefecto()
	{
		return GENERAL;
	}
}

package com.mybudget.personalbudget.domain;

public class YearDomain {
	
	/*
	con esto queremos decir que esto va a ser un objeto inmutable
	final quiere decir que despues de inicializados por primera vez no pueden volver a cambiar
	*/
	private final String id;
	private final int year;

	
	//constructor
	private YearDomain(String id,int year) {
		this.id = id;
		this.year = year;
		
	}
	
	/*se le envia un id y un year y el me retorna un nuevo YearDomain*/
	public static  YearDomain create(String id,int year) {
		return new YearDomain(id,year);
	}
	

	public final String getId() {
		return id;
	}

	public final int getYear() {
		return year;
	}

}

package com.mybudget.personalbudget.entity;


public class YearEntity {
	
	private final String id;
	private final int year;

	
	/*se le envia un id y un year y el me retorna un nuevo YearDomain*/
	public static  YearEntity create(String id,int year) {
		return new YearEntity(id,year);
	}
	
}

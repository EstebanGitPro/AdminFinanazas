package com.mybudget.personalbudget.domain;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
import static com.mybudget.personalbudget.crosscutting.UtilUUID.getDefauultUUID;

import java.util.UUID;;


public class YearDomain {
	
	/*
	con esto queremos decir que esto va a ser un objeto inmutable
	final quiere decir que despues de inicializados por primera vez no pueden volver a cambiar
	*/
	private UUID id;
	private int year;

	
	//constructor
	private YearDomain(final UUID id,final int year) {
		setId(id);
		setYear(year);
		
	}
	
	
	/*se le envia un id y un year y el me retorna un nuevo YearDomain*/
	public static  YearDomain create(UUID id,int year) {
		return new YearDomain(id,year);
	}
	
	private final void setId(UUID id) {
	
		this.id = getDefauultUUID(id);
		
	}

	private final void setYear(int year) {
		this.year = year;
	
	}
	

	public final UUID getId() {
		if(id == null) {
			setId(DEFAULT_UUID);
		}
		return id;
	}

	public final int getYear() {
		return year;
	}
	
	/*
	//ensayos
	public static void main(String [] args) {
		UUID miUUID = UUID.randomUUID();
		System.out.println(miUUID);
		String miUUIDString = miUUID.toString();
		System.out.println(miUUIDString);
		UUID otroUUID = UUID.fromString(miUUIDString + "z");
		System.out.println(otroUUID);
		
		
	}*/
	

}

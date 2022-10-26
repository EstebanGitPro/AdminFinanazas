package com.mybudget.personalbudget.entity;

import java.util.UUID;


import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
//import static com.mybudget.personalbudget.crosscutting.UtilUUID.getDefauultUUID;

public  class YearEntity {

	private UUID id;
	private int year;
	
	//se crean dos contructores
	
	//constructor sin paramentros 
	public YearEntity() {
		setId(DEFAULT_UUID);
		setYear(0);
	}
	
	//constructor Parametrizado
	public YearEntity(final UUID id, final int year) {
		setId(id);
		setYear(year);
	}
	
	
	
	/*Como el ORM es el que va a disparar todas las creaciones
	 * entonces este create no se hace necesario
	public static final YearEntity create() {
		return new YearEntity();
	}*/
	
	
	
	/*los getter y setter si pueden ser publicos por que aqui lo unico que
	 * vamos a garantizar quee desde el punto de vista de objetos 
	 * se pueda llenar  la bolsa rapidamente para enviarla para otra parte*/
	
	
	public final UUID getId() {
		if(id == null) {
			setId(DEFAULT_UUID);
		}
		return id;
	}

	public final int getYear() {
		if(year < 0) {
			setYear(0);
		}
		return year;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}

	public final void setYear(final int year) {
		this.year = year;
	}

	
	
}

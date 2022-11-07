package com.mybudget.personalbudget.entity;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Year")
public final class YearEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "year")
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
	
	
	public UUID getId() {
		if(id == null) {
			setId(DEFAULT_UUID);
		}
		return id;
	}

	public  int getYear() {
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

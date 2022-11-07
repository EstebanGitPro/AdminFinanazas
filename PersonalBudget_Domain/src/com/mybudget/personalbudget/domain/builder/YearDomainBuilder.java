package com.mybudget.personalbudget.domain.builder;

import static com.mybudget.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
import static com.mybudget.personalbudget.crosscutting.UtilUUID.getDefauultUUID;

import java.util.UUID;

import com.mybudget.personalbudget.domain.YearDomain;

public class YearDomainBuilder {
	private UUID id;
	private int year;

	/* Aqui se va a tener un mecanismo para poderlo construir */
	//constructor
	private YearDomainBuilder() {
		setId(DEFAULT_UUID);
		setYear(0);
	}
	
	
	
	/*Tengo como obtener una instancia del YearDomainBuilder
	 * y adicionalmete podemos setear los valores que necesitamos 
	 * como lo es el id y el yer
	 */
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}
	


	

	/* se crean los set privados y los get publicos */
	
	public final YearDomainBuilder setId(UUID id) {

		this.id = getDefauultUUID (id);
		/*Retorno el objeto*/
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = year;
		return this;
	}
	/*El YearDomainBilder nunca tiene metodos
	 getters porque su objetivo es construir, no pedir los valores por eso
	 de los get estan privados*/
	
	

	/*+private final UUID getId() {
		return id;
	}

	private final int getYear() {
		return year;
	} los quitamos por que realente no os necesitamos*/
	
	
	public YearDomain build() {/*Obtenemos el id y el year actual
	osea que con este metodo estamos returnando un objeto de tipo YearDomain*/
		return YearDomain.create(id, year);
	}
	 
	/*El Builder construye el Domain*/
	

}

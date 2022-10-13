package com.mybudget.personalbudget.domain.builder;

import com.mybudget.personalbudget.domain.YearDomain;

public class YearDomainBuilder {
	private String id;
	private int year;

	/* Aqui se va a tener un mecanismo para poderlo construir */

	private YearDomainBuilder() {
		setId("");
		setYear(0);
	}
	
	
	/*Tengo como obtener una instancia del YearDomainBuilder
	 * y adicionalmete podemos setear los valores que necesitamos 
	 * como lo es el id y el yer
	 */
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}
	


	

	/* se crean los getter privados y los setter publicos */
	public final YearDomainBuilder setId(String id) {
		/*si es vacio dejelo asi y sino quitele los espacios.*/
		this.id = (id == null) ? "": id.trim();
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
	
	

	private final String getId() {
		return id;
	}

	private final int getYear() {
		return year;
	}
	
	
	public YearDomain build() {/*Obtenemos el id y el year actual
	osea que con este metodo estamos returnando un objeto de tipo YearDomain*/
		return YearDomain.create(getId(), getYear());
	}
	
	
	/* Ensayos*/
	public static void main(String[] args) {
		
		YearDomain myYear = YearDomainBuilder.get().setYear(2020).build();
		YearDomain myYearTow = YearDomainBuilder.get().setId("123").setYear(2020).build();
		YearDomain myYearThree = YearDomainBuilder.get().setId("123").build();
		YearDomain myYearFour = YearDomainBuilder.get().build();
		YearDomain myYearFive = YearDomainBuilder.get().setYear(2020).setId("123").build();
	}
	

}

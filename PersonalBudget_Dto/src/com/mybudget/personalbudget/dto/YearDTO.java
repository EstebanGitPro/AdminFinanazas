package com.mybudget.personalbudget.dto;

public  class YearDTO {

	private String id;
	private int year;
	
	//se crean dos contructores
	
	//constructor sin paramentros 
	public YearDTO() {
		setId("");
		setYear(0);
	}
	
	//constructor Parametrizado
	public YearDTO(String id, int year) {
		setId(id);
		setYear(year);
	}
	
	
	public static final YearDTO create() {
		return new YearDTO();
	}
	
	/*los getter y setter si pueden ser publicos por que aqui lo unico que
	 * vamos a garantizar quee desde el punto de vista de objetos 
	 * se pueda llenar  la bolsa rapidamente para enviarla para otra parte*/
	
	

	public final String getId() {
		
		if(id == null || "".equals(id.trim())) {
			setId("");
		}
		
		return id;
	}

	public final int getYear() {
		if(year < 0) {
			setYear(0);
		}
		return year;
	}

	public final void setId(final String id) {
		this.id = id;
	}

	public final void setYear(final int year) {
		this.year = year;
	}

	
	
}

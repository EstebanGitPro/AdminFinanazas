package com.mybudget.personalbudget.dto;

public  class YearDTO {

	private String id;
	private int year;
	
	private YearDTO() {
		setId("");
		setYear(0);
	}

	public YearDTO(String id, int year) {
		setId(id);
		setYear(year);
	}
	
	
	public static final YearDTO create() {
		return new YearDTO();
	}
	
	
	

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

	private final void setId(String id) {
		this.id = id;
	}

	private final void setYear(int year) {
		this.year = year;
	}

	
	
}

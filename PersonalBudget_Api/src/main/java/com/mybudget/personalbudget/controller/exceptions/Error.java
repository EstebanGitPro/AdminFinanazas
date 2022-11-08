package com.mybudget.personalbudget.controller.exceptions;



public class Error {
	private String exceptionName;
	private String technicalMessage;
	private String humanMessage;
	
	public  Error(String exceptionName, String technicalMessage, String humanMessage) {
		super();
		setExceptionName( exceptionName);
		setTechnicalMessage( technicalMessage);
		setHumanMessage( humanMessage);
	}

	public final String getExceptionName() {
		return exceptionName;
	}

	public final void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
	}

	public final String getTechnicalMessage() {
		return technicalMessage;
	}

	public final void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = technicalMessage;
	}

	public final String getHumanMessage() {
		return humanMessage;
	}

	public final void setHumanMessage(String humanMessage) {
		this.humanMessage = humanMessage;
	}
	
	
	
	
	
	
}
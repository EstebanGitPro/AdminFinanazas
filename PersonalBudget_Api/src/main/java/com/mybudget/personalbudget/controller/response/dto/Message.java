package com.mybudget.personalbudget.controller.response.dto;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;
import org.jboss.logging.Messages;

import com.mybudget.personalbudget.controller.response.enumeration.MessageLevel;

public class Message {
	
	private String text;
	private String title;
	private MessageLevel level;
	
	
	
	private Message(final String text,final String title, final MessageLevel level) {
		setText(text);
		setTitle(title);
		setLevel(level);
	}
	
	
	public static Message createMessage(final String text,final String title, final MessageLevel level) {
		return new Message(text, title, level);
	}
	
	//Para enviar solo el text
	public static Message createMessage(final String text, final MessageLevel level) {
		return new Message(text, text, level);
	}
	
	public static Message createFatalMessage(final String text) {
		return new Message(text, text, MessageLevel.FATAL);
	}
	
	public static Message createErrorMessage(final String text) {
		return new Message(text, text, MessageLevel.ERROR);
	}
	
	public static Message createWarningMessage(final String text) {
		return new Message(text, text, MessageLevel.WARNING);
	}
	
	public static Message createInformationMessage(final String text) {
		return new Message(text, text, MessageLevel.INFORMATION);
	}
	
	public static Message createSuccessMessage(final String text) {
		return new Message(text, text, MessageLevel.SUCCESS);
	}
	
	
	
	private final void setText(final String text) {
		
		if (text == null || "".intern() == text.intern().trim()){
			this.text ="";
		}
		else {
			this.text = text;
		}
		
	}


	private final void setTitle(final String title) {
		if (title == null || "".intern() == title.intern().trim()){
			this.title ="";
		}
		else {
			this.title = title;
		}
		
	}
	
	
	private final void setLevel(final MessageLevel level) {
		if (level == null){
			this.level = MessageLevel.FATAL;
		}
		this.level = level;
	}
	

	public final String getText() {
		return text;
	}

	public final String getTitle() {
		return title;
	}

	public final MessageLevel getLevel() {
		return level;
	}
	
	
	
	
	
	
	

}

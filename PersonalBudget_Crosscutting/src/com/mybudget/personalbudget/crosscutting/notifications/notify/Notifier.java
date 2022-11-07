package com.mybudget.personalbudget.crosscutting.notifications.notify;

import com.mybudget.personalbudget.crosscutting.notifications.CorreoElectronico;
import com.mybudget.personalbudget.crosscutting.notifications.notify.implement.NotifierSendGrid;

public abstract class Notifier {
	
	private static final String CLIENTE ="SendGrid";

	public static void enviar(CorreoElectronico correo)
	{
		if("SendGrid".equals(CLIENTE))
		{
			Notifier sendGrid = new NotifierSendGrid();
			sendGrid.notificar(correo);
		}
	}
	public abstract void notificar(CorreoElectronico correo);
}
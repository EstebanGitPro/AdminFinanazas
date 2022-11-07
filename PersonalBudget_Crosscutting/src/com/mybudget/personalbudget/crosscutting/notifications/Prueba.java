package com.mybudget.personalbudget.crosscutting.notifications;

import com.mybudget.personalbudget.crosscutting.notifications.notify.Notifier;

public class Prueba {

	public static void main(String[] args) {
		String para ="aj.faru@gmail.com";
		String asunto ="prueba notificacion ";
		String contenido= "ha funcionado sin problemas";
		
		Notifier.enviar(CorreoElectronico.crearFormatoHTML(para, asunto, contenido));
				
	}

}

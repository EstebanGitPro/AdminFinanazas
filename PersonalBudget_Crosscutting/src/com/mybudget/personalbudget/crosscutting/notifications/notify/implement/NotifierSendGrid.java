package com.mybudget.personalbudget.crosscutting.notifications.notify.implement;

import java.io.IOException;

import com.mybudget.personalbudget.crosscutting.exeption.AplicationCroscuttingException;
import com.mybudget.personalbudget.crosscutting.exeption.TipoExcepcionEnum;
import com.mybudget.personalbudget.crosscutting.notifications.CorreoElectronico;
import com.mybudget.personalbudget.crosscutting.notifications.notify.Notifier;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

public class NotifierSendGrid extends Notifier {

	private static final String LLAVE ="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";
	private static final String DE ="andres.castillo7027@uco.net.co";
	
	@Override
	public void notificar(CorreoElectronico correo) {
		try{
		Email origen= new Email(DE);
		Email destino= new Email(correo.getPara());
		
		
		Content contenido= new Content(correo.getFormato().getFormato(),correo.getContenido() );
		Mail mensaje =new Mail(origen,correo.getAsunto(),destino,contenido);
		SendGrid sender = new SendGrid(LLAVE);
		
		
		Request peticion = new Request();
		peticion.setMethod(Method.POST);
		peticion.setEndpoint("mail/send");
		peticion.setBody(mensaje.build());
		
		Response respuesta = sender.api(peticion);
		if(respuesta.getStatusCode() != 202)
		{
			String textoUsuario = "No ha sido posible enviarl el correo electronico a "+ correo.getPara();
			String textoTecnico = "SendGrid devolvio un codigo diferente a 202";
			Exception excepcion = new Exception(respuesta.getHeaders() + "-" + respuesta.getBody());
			

			throw AplicationCroscuttingException.crear(TipoExcepcionEnum.APLICACION, textoUsuario, textoTecnico, excepcion);
		}
		}catch (IOException excepcion) 
		{
			String textoUsuario = "No ha sido posible enviarl el correo electronico a "+ correo.getPara();
			String textoTecnico = "Hubo un problema de entrada/salida";
			

			throw AplicationCroscuttingException.crear(TipoExcepcionEnum.APLICACION, textoUsuario, textoTecnico, excepcion);
		
		}
		
		
		
	}

}


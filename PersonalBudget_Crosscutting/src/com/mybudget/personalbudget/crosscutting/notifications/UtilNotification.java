package com.mybudget.personalbudget.crosscutting.notifications;

import org.apache.unomi.mailchimp.services.MailChimpResult;
import org.apache.unomi.mailchimp.services.MailChimpService;
import org.apache.unomi.mailchimp.services.internal.MailChimpServiceImpl;

import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

public class UtilNotification {
	Email de= new Email("andres.castillo7027@uco.net.co");
	Email para= new Email("andres.castillo7027@uco.net.co");
	
	String asunto= "Notificacion prueba";
	Content contenido= new Content("text/html","señor <i>andres castillo</i>: <b>bienbenido</b>" );
	Mail mensaje =new Mail(de,asunto,para,contenido);
	//SendGrid sender = new SendGrid("")
	MailChimpServiceImpl sender  = new MailChimpServiceImpl();
	MailChimpService  Sender = new MailChimpServiceImpl();

}

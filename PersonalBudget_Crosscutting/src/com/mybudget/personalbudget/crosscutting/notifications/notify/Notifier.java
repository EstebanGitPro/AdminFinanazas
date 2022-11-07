package com.mybudget.personalbudget.crosscutting.notifications.notify;

import com.mybudget.personalbudget.crosscutting.notifications.CorreoElectronico;

public interface Notifier {

	void notificar(CorreoElectronico correo);
}

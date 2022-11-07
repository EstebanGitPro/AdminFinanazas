package com.mybudget.personalbudget.crosscutting.notifications;

public enum FormatoEnvioCorreoEnum {

	HTML("text/html","Envio de correo en formato HTML");

private String formato;
private String descripcion;

private FormatoEnvioCorreoEnum(String formato,  String descripcion)
{
	this.formato=formato;
	this.descripcion=descripcion;
}

public final String getFormato() {
	return formato;
}

public final String getDescripcion() {
	return descripcion;
}

public static FormatoEnvioCorreoEnum obtenerDefecto()
{
	return HTML;
}

}
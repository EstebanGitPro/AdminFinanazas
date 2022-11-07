package com.mybudget.personalbudget.crosscutting.notifications;

import com.mybudget.personalbudget.crosscutting.UtilObject;
import com.mybudget.personalbudget.crosscutting.UtilTex;

public class CorreoElectronico {
	
	private String para;
	private String asunto;
	private String contenido;
	private FormatoEnvioCorreoEnum formato;
	private CorreoElectronico(String para, String asunto, String contenido, FormatoEnvioCorreoEnum formato) {
		super();
		setPara(para);
		setAsunto(asunto);
		setContenido(contenido);
		setFormato(formato);
		
	}
	
	public static CorreoElectronico crearFormatoHTML(String para, String asunto, String contenido )
	{
		return new CorreoElectronico(para, asunto, contenido, FormatoEnvioCorreoEnum.HTML);
	}

	public final String getPara() {
		return para;
	}

	public final String getAsunto() {
		return asunto;
	}

	public final String getContenido() {
		return contenido;
	}

	public final FormatoEnvioCorreoEnum getFormato() {
		return formato;
	}

	private final void setPara(String para) {
		this.para = UtilTex.aplicarTrim(para);
	}

	private final void setAsunto(String asunto) {
		this.asunto = UtilTex.aplicarTrim(asunto);
	}

	private final void setContenido(String contenido) {
		this.contenido = UtilTex.aplicarTrim(contenido);
	}

	private final void setFormato(FormatoEnvioCorreoEnum formato) {
		
		this.formato = UtilObject.obtenerValorPorDefecto(formato,FormatoEnvioCorreoEnum.obtenerDefecto());
	}
	
	
	
	

}

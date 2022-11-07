package com.mybudget.personalbudget.crosscutting;

import org.apache.commons.lang3.StringUtils;

public class UtilTex {
	
	private UtilTex() {}
	
	public static String obtenerValorDefecto(String valor, String defecto)
	{
		return StringUtils.defaultString(valor,defecto);
	}
	
	public static String aplicarTrim(String valor)
	{
		return StringUtils.trimToEmpty(valor);
	}



}

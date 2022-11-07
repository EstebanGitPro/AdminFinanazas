package com.mybudget.personalbudget.crosscutting;

import org.apache.commons.lang3.ObjectUtils;

public class UtilObject {
	
	private UtilObject()
	{
		
	}
	
	public static <T>boolean objetoEsNulo(T objeto)
	{
		return ObjectUtils.allNull(objeto);
		
	}
	public static <T> T obtenerValorPorDefecto(T valor, T defecto)
	{
		return ObjectUtils.defaultIfNull(valor, defecto);
		
	}
	

}

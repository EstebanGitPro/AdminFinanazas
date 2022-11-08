package com.mybudget.personalbudget.crosscutting.exeption;

public class NgException extends AppException{

	protected NgException(TipoExcepcionEnum tipo, String textoUsuario, String textoTecnico,
			 Exception excepcionRaiz) {
		super(tipo, textoUsuario, textoTecnico, ComponenteEnum.DOMAIN, excepcionRaiz);
		
	}
	
	public static NgException crear(TipoExcepcionEnum tipo, String textoUsuario, String textoTecnico)
	{
		return new NgException(tipo, textoUsuario, textoTecnico, new Exception(textoTecnico));
	}

}

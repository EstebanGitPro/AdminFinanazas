package com.mybudget.personalbudget.crosscutting.exeption;

public class AplicationCroscuttingException extends AppException{

	
	private static final long serialVersionUID = 1343440360592949372L;

	private AplicationCroscuttingException(TipoExcepcionEnum tipo, String textoUsuario, String textoTecnico,
			 Exception excepcionRaiz) {
		super(tipo, textoUsuario, textoTecnico, ComponenteEnum.CROSSCUTTING, excepcionRaiz);
		
	}

	public static AppException crear(TipoExcepcionEnum tipo, String textoUsuario, String textoTecnico,
			 Exception excepcionRaiz)
	{
		return new AplicationCroscuttingException(tipo, textoUsuario, textoTecnico, excepcionRaiz);
	}
}

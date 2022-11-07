package com.mybudget.personalbudget.crosscutting.exeption;

public class AplicationException extends AppException{


		private static final long serialVersionUID = 1343440360592949372L;

		private AplicationException(TipoExcepcionEnum tipo, String textoUsuario, String textoTecnico,
				 Exception excepcionRaiz) {
			super(tipo, textoUsuario, textoTecnico, ComponenteEnum.APPLICATION, excepcionRaiz);
			
		}

		public static AppException crear(TipoExcepcionEnum tipo, String textoUsuario, String textoTecnico,
				 Exception excepcionRaiz)
		{
			return new AplicationException(tipo, textoUsuario, textoTecnico, excepcionRaiz);
		}
	

}

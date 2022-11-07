package com.mybudget.personalbudget.crosscutting.exeption;

import org.apache.commons.lang3.exception.ExceptionUtils;

import com.mybudget.personalbudget.crosscutting.UtilObject;
import com.mybudget.personalbudget.crosscutting.UtilTex;


public class AppException extends RuntimeException {

	
	private static final long serialVersionUID = -2054298440672627942L;
	private TipoExcepcionEnum tipo;
	private String textoUsuario;
	private String textoTecnico;
	private ComponenteEnum componente;
	private Exception excepcionRaiz;
	
	protected AppException(TipoExcepcionEnum tipo, String textoUsuario, String textoTecnico, ComponenteEnum componente,
			Exception excepcionRaiz) {
		super();
		setTipo(tipo);
		setTextoUsuario(textoUsuario);
		setTextoTecnico(textoTecnico);
		setComponente(componente);
		setExcepcionRaiz(excepcionRaiz);
	
	}

	

	public final TipoExcepcionEnum getTipo() {
		return tipo;
	}

	public final String getTextoUsuario() {
		return textoUsuario;
	}

	public final String getTextoTecnico() {
		return textoTecnico;
	}

	public final ComponenteEnum getComponente() {
		return componente;
	}

	public final Exception getExcepcionRaiz() {
		return excepcionRaiz;
	}



	private final void setTipo(TipoExcepcionEnum tipo) {
		this.tipo = UtilObject.obtenerValorPorDefecto(tipo, TipoExcepcionEnum.obtenerDefecto());
	}



	private final void setTextoUsuario(String textoUsuario) {
		this.textoUsuario = UtilTex.aplicarTrim(textoUsuario);
	}



	private final void setTextoTecnico(String textoTecnico) {
		this.textoTecnico = UtilTex.aplicarTrim(textoTecnico);
	}



	private final void setComponente(ComponenteEnum componente) {
		this.componente = UtilObject.obtenerValorPorDefecto(componente, ComponenteEnum.obtenerDefecto());
		
	}



	private final void setExcepcionRaiz(Exception excepcionRaiz) {
		this.excepcionRaiz = UtilObject.obtenerValorPorDefecto(excepcionRaiz, new Exception());
	}
	
	@Override
	public String toString() 
	{
		StringBuilder traza= new StringBuilder();
		traza.append("Tipo excepcion: ").append(getTipo()).append("\n");
		traza.append("Texto usuario: ").append(getTextoUsuario()).append("\n");
		traza.append("Texto tecnico: ").append(getTextoTecnico()).append("\n");
		traza.append("Componente: ").append(getComponente()).append("\n");
		traza.append("Excepcopn raiz: ").append(ExceptionUtils.getStackTrace(getExcepcionRaiz()));
		return traza.toString();
	}
	
	
	
	
	
	
	

}

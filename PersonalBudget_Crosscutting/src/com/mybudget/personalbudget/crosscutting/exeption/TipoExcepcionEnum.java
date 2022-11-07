package com.mybudget.personalbudget.crosscutting.exeption;

public enum TipoExcepcionEnum {
	NEGOCIO("Negocio", "corresponde a un tipo de excepcion que lanzada desde un flujo de negocio, por la violacion de una regla de negocio especifico"),
	APLICACION("Aplicacion","corresponde a un tipo de excepcion que es lanzada desde cuarquier parte de la aplicacion");

	private String nombre;
	private String descripcion;

	private TipoExcepcionEnum(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;

	}

	public final String getNombre() {
		return nombre;
	}

	public final String getDescripcion() {
		return descripcion;
	}
	
	public static TipoExcepcionEnum obtenerDefecto()
	{
		return APLICACION;
	}

}

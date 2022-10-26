package com.mybudget.personalbudget.crosscutting;

import java.util.UUID;

public class UtilUUID {
	
	public static final String DEFAULT_UUID_STRING = "00000000-0000-0000-0000-000000000000";
	public static final UUID   DEFAULT_UUID = UUID.fromString(DEFAULT_UUID_STRING);
	
	
	private UtilUUID() {
		super();
	}
	
	
	public static final UUID getDefauultUUID(final UUID uuid) {
		return (uuid == null)? DEFAULT_UUID : uuid;
	}
	
	
	public static final boolean isEqual(final UUID uuidOne, final UUID uuidTow) {
		return getDefauultUUID(uuidOne).equals(getDefauultUUID(uuidTow));
	} 
	
	
	/*Con este metodo estamos asegurando que cuando se genere
	 * nose a igual al que esta por defecto, si es igual a ese crea otro*/
	
	
	public static final UUID getNewUUID() {
		UUID uuid;
		
		do{ 
			uuid = UUID.randomUUID();
			
		}while(isEqual(uuid, DEFAULT_UUID));
		
		return uuid; 
	}
	
	//creamos otro metodo con el cual nos convierte de string a UUID
	//Esto no deberia estar quemado deberia existir un util string que haga la validacion
	public static final UUID getUUIDFromString(final String uuidString) {
		UUID uuid = DEFAULT_UUID;
		
		
		if(uuidString != null && !"".equals(uuidString.trim())) {
			
			try {
			uuid = UUID.fromString(uuidString);
			}catch (IllegalArgumentException exception) {
				// TODO: falta getionar la excepcion!!!
			}
		}
		
		return uuid;
		
	}
	
	//creamos otro metodo
	public static final String getStringFromUUID(final UUID uuid) {
		String uuidString = DEFAULT_UUID_STRING;
		if(uuid != null) {
			uuidString = uuid.toString();
		}
		
		return uuidString;
	}
	


}

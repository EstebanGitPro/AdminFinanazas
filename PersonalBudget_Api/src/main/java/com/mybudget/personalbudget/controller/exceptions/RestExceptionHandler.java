package com.mybudget.personalbudget.controller.exceptions;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.sentry.Sentry;

import com.microsoft.applicationinsights.TelemetryClient;
import com.mybudget.personalbudget.crosscutting.exeption.*;

@RestControllerAdvice
public class RestExceptionHandler { 
	@Autowired
	private TelemetryClient telemetryClient;
	
	
	private static final ConcurrentHashMap<String, HttpStatus> STATES = new ConcurrentHashMap<>();
	public static final String DEFAULT_MESSAGE = "Ocurrió un error procesando la solicitud. Por favor contacta al administrador del sistema.";
	
	
	public RestExceptionHandler() {
		STATES.put(AplicationCroscuttingException.class.getSimpleName(), HttpStatus.CONFLICT);
		STATES.put(NgException.class.getSimpleName(), HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	
	@ExceptionHandler(AppException.class)
	public ResponseEntity<Error> exceptionResolver(AppException exception){
		HttpStatus status = STATES.get(exception.getClass().getSimpleName());
		Error err = new Error(exception.getClass().getSimpleName(), exception.getTextoTecnico(), exception.getTextoUsuario());
		telemetryClient.trackException(exception);
		return ResponseEntity.status(status).body(err);
				
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> exceptionResolver(Exception exception){
		Error err = new Error(exception.getClass().getSimpleName(), exception.getMessage(), DEFAULT_MESSAGE);
		telemetryClient.trackException(exception);

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(err);
				
	}
	
}
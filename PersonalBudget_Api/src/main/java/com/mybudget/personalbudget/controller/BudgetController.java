package com.mybudget.personalbudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybudget.personalbudget.application.command.interfaces.CreateBudgetCommand;
import com.mybudget.personalbudget.controller.response.Response;
import com.mybudget.personalbudget.controller.response.dto.Message;
import com.mybudget.personalbudget.dto.BudgetDTO;


@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {
	
	@Autowired
	private CreateBudgetCommand createBudgetcommand;
	
	
	//T en el response Entity se le da una costomizacion
	//Aqui retornamos 
	@PostMapping
	public ResponseEntity<Response<BudgetDTO>> createBudget(@RequestBody BudgetDTO budget) {
		
		final Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		
		try {
			createBudgetcommand.execute(budget);
			response.addMessage(Message.createSuccessMessage("El budget se ha creado de forma satisfactoria"));
			
		} catch (final Exception exception) {
			// TODO: sedebe de controlar las excepciones y enviar la traza del monitoreo
			statusCode = HttpStatus.BAD_REQUEST;
			response.addMessage(Message.createErrorMessage("Ha ocurrido un problema inesperado de crear el presupuesto deseado..."));
		}
		
	
		return new ResponseEntity<>(response, statusCode); 
	}
	
	@GetMapping
	public ResponseEntity<Response<BudgetDTO>> saludar() {
		final Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		
		try {
			
			response.addMessage(Message.createSuccessMessage("El budget se ha consultado de forma satisfactoria"));
			
		} catch (final Exception exception) {
			// TODO: sedebe de controlar las excepciones y enviar la traza del monitoreo
			statusCode = HttpStatus.BAD_REQUEST;
			response.addMessage(Message.createErrorMessage("Ha ocurrido un problema inesperado de crear el presupuesto deseado..."));
		}
		
	
		return new ResponseEntity<Response<BudgetDTO>>(response, statusCode); 
	} 

}

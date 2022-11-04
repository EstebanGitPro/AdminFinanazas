package com.mybudget.personalbudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybudget.personalbudget.application.command.interfaces.CreateBudgetCommand;
import com.mybudget.personalbudget.dto.BudgetDTO;


@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {
	
	@Autowired
	private CreateBudgetCommand createBudgetcommand;
	
	@PostMapping
	public BudgetDTO createBudget(@RequestBody BudgetDTO budget) {
		createBudgetcommand.execute(budget);
		return budget;
	}
	
	@GetMapping
	public String saludar() {
		return "Hola mundo !!!";
	} 

}

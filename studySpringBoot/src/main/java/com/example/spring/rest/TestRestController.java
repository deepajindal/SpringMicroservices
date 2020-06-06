package com.example.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.EmployeeDto;
import com.example.spring.service.EmployeeService;

@RestController
public class TestRestController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/hello")
	public EmployeeDto saySomething() {
		return service.displayEmployee();
	}
}

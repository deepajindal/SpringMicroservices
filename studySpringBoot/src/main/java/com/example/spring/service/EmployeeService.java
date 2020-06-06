package com.example.spring.service;

import org.springframework.stereotype.Service;

import com.example.spring.model.EmployeeDto;

@Service
public class EmployeeService {

	public EmployeeDto displayEmployee() {
		return EmployeeDto.builder().
				employeeId(3362L).
				employeeName("Deepa").
				designation("LoL").
				build();

	}
}

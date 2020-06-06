package com.example.spring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
	
	private long employeeId;
	private String employeeName;
	private String designation;
}

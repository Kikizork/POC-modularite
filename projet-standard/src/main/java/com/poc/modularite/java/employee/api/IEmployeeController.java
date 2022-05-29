package com.poc.modularite.java.employee.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.poc.modularite.java.employee.data.EmployeeDTO;


public interface IEmployeeController {

	@GetMapping("/all")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee();
	
}

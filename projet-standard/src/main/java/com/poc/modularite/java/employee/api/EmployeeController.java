package com.poc.modularite.java.employee.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.modularite.java.employee.data.EmployeeDTO;
import com.poc.modularite.java.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements IEmployeeController {

	private final IEmployeeService employeeService;

	public EmployeeController(IEmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@Override
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee() {

		return new ResponseEntity<>(this.employeeService.findAll(), HttpStatus.OK);
	}

}

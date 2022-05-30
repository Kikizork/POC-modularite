package com.poc.modularite.java.controller.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poc.modularite.java.controller.interfaces.IEmployeeController;
import com.poc.modularite.java.data.dto.EmployeeDTO;
import com.poc.modularite.java.service.interfaces.IEmployeeService;

@Controller
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

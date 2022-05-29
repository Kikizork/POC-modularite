package com.poc.modularite.java.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.poc.modularite.java.data.dto.EmployeeDTO;

public interface IEmployeeController {

	@GetMapping("/all")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee();

}

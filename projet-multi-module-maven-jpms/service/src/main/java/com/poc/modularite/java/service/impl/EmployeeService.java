package com.poc.modularite.java.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.modularite.java.dao.interfaces.IEmployeeDAO;
import com.poc.modularite.java.data.dto.EmployeeDTO;
import com.poc.modularite.java.service.interfaces.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	private final IEmployeeDAO employeeDAO;

	public EmployeeService(IEmployeeDAO employeeDAO) {
		super();
		this.employeeDAO = employeeDAO;
	}

	@Override
	public List<EmployeeDTO> findAll() {
		return this.employeeDAO.findAll();
	}

}

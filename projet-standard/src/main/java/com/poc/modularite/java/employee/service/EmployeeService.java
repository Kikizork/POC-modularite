package com.poc.modularite.java.employee.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poc.modularite.java.employee.dao.IEmployeeDAO;
import com.poc.modularite.java.employee.data.EmployeeDTO;

@Service
public class EmployeeService implements IEmployeeService{
	
	private final IEmployeeDAO employeeDAO;
	
	

	public EmployeeService(IEmployeeDAO employeeDAO) {
		super();
		this.employeeDAO = employeeDAO;
	}

	@Override
	public List<EmployeeDTO> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	public List<EmployeeDTO> findAll(Sort sort) {
		return employeeDAO.findAll(sort);
	}

	

}

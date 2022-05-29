package com.poc.modularite.java.employee.data;


import java.time.LocalDate;
import java.time.LocalTime;

import com.poc.modularite.java.common.data.dto.IDTO;


public class EmployeeDTO implements IDTO<EmployeeModel, EmployeeDTO>{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6180493891667839559L;

	private Integer id;
	
	private String employeeName;
	
	private String employeeSurname;
	
	private String employeeEmail;
	
	private LocalDate employeeBirthdate;
	
	private LocalDate employeeStartWork;
	
	private LocalTime employeeCreationDate;
	
	private LocalTime employeeUpdateDate;
	
	private LocalTime employeeSuppressionDate;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeSurname() {
		return employeeSurname;
	}


	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}


	public String getEmployeeEmail() {
		return employeeEmail;
	}


	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}


	public LocalDate getEmployeeBirthdate() {
		return employeeBirthdate;
	}


	public void setEmployeeBirthdate(LocalDate employeeBirthdate) {
		this.employeeBirthdate = employeeBirthdate;
	}


	public LocalDate getEmployeeStartWork() {
		return employeeStartWork;
	}


	public void setEmployeeStartWork(LocalDate employeeStartWork) {
		this.employeeStartWork = employeeStartWork;
	}


	public LocalTime getEmployeeCreationDate() {
		return employeeCreationDate;
	}


	public void setEmployeeCreationDate(LocalTime employeeCreationDate) {
		this.employeeCreationDate = employeeCreationDate;
	}


	public LocalTime getEmployeeUpdateDate() {
		return employeeUpdateDate;
	}


	public void setEmployeeUpdateDate(LocalTime employeeUpdateDate) {
		this.employeeUpdateDate = employeeUpdateDate;
	}


	public LocalTime getEmployeeSuppressionDate() {
		return employeeSuppressionDate;
	}


	public void setEmployeeSuppressionDate(LocalTime employeeSuppressionDate) {
		this.employeeSuppressionDate = employeeSuppressionDate;
	}


	public EmployeeDTO() {
		super();
	}
	
	
	


	@Override
	public EmployeeModel convertToModelWithoutChildTable() {
		EmployeeModel model = new EmployeeModel();
		model.setId(id);
		model.setEmployeeName(employeeName);
		model.setEmployeeSurname(employeeSurname);
		model.setEmployeeEmail(employeeEmail);
		model.setEmployeeStartWork(employeeStartWork);
		model.setEmployeeBirthdate(employeeBirthdate);
		model.setEmployeeCreationDate(employeeCreationDate);
		model.setEmployeeUpdateDate(employeeUpdateDate);
		model.setEmployeeSuppressionDate(employeeSuppressionDate);
		
		return model;
	}


	@Override
	public EmployeeModel convertToModelWithChildTable() {
		EmployeeModel model = convertToModelWithoutChildTable();
		return model;
	}


	@Override
	public EmployeeDTO modelToDTOWithoutChildTable(EmployeeModel model) {
		id = model.getId();
		employeeName = model.getEmployeeName();
		employeeSurname = model.getEmployeeSurname();
		employeeEmail = model.getEmployeeEmail();
		employeeStartWork = model.getEmployeeStartWork();
		employeeBirthdate = model.getEmployeeBirthdate();
		employeeCreationDate = model.getEmployeeCreationDate();
		employeeUpdateDate = model.getEmployeeUpdateDate();
		employeeSuppressionDate = model.getEmployeeSuppressionDate();
		return this;
	}


	@Override
	public EmployeeDTO modelToDTOWithChildTable(EmployeeModel model) {
		EmployeeDTO employeeDTO = modelToDTOWithoutChildTable(model);
		return employeeDTO;
	}


}

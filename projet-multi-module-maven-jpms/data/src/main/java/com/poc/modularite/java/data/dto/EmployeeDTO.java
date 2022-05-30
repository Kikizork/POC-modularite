package com.poc.modularite.java.data.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.poc.modularite.java.common.data.dto.IDTO;
import com.poc.modularite.java.data.model.EmployeeModel;

public class EmployeeDTO implements IDTO<EmployeeModel, EmployeeDTO> {

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
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurname() {
		return this.employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public LocalDate getEmployeeBirthdate() {
		return this.employeeBirthdate;
	}

	public void setEmployeeBirthdate(LocalDate employeeBirthdate) {
		this.employeeBirthdate = employeeBirthdate;
	}

	public LocalDate getEmployeeStartWork() {
		return this.employeeStartWork;
	}

	public void setEmployeeStartWork(LocalDate employeeStartWork) {
		this.employeeStartWork = employeeStartWork;
	}

	public LocalTime getEmployeeCreationDate() {
		return this.employeeCreationDate;
	}

	public void setEmployeeCreationDate(LocalTime employeeCreationDate) {
		this.employeeCreationDate = employeeCreationDate;
	}

	public LocalTime getEmployeeUpdateDate() {
		return this.employeeUpdateDate;
	}

	public void setEmployeeUpdateDate(LocalTime employeeUpdateDate) {
		this.employeeUpdateDate = employeeUpdateDate;
	}

	public LocalTime getEmployeeSuppressionDate() {
		return this.employeeSuppressionDate;
	}

	public void setEmployeeSuppressionDate(LocalTime employeeSuppressionDate) {
		this.employeeSuppressionDate = employeeSuppressionDate;
	}

	public EmployeeDTO() {
		super();
	}

	@Override
	public EmployeeModel convertToModelWithoutChildTable() {
		final EmployeeModel model = new EmployeeModel();
		model.setId(this.id);
		model.setEmployeeName(this.employeeName);
		model.setEmployeeSurname(this.employeeSurname);
		model.setEmployeeEmail(this.employeeEmail);
		model.setEmployeeStartWork(this.employeeStartWork);
		model.setEmployeeBirthdate(this.employeeBirthdate);
		model.setEmployeeCreationDate(this.employeeCreationDate);
		model.setEmployeeUpdateDate(this.employeeUpdateDate);
		model.setEmployeeSuppressionDate(this.employeeSuppressionDate);

		return model;
	}

	@Override
	public EmployeeModel convertToModelWithChildTable() {
		final EmployeeModel model = convertToModelWithoutChildTable();
		return model;
	}

	@Override
	public EmployeeDTO modelToDTOWithoutChildTable(EmployeeModel model) {
		this.id = model.getId();
		this.employeeName = model.getEmployeeName();
		this.employeeSurname = model.getEmployeeSurname();
		this.employeeEmail = model.getEmployeeEmail();
		this.employeeStartWork = model.getEmployeeStartWork();
		this.employeeBirthdate = model.getEmployeeBirthdate();
		this.employeeCreationDate = model.getEmployeeCreationDate();
		this.employeeUpdateDate = model.getEmployeeUpdateDate();
		this.employeeSuppressionDate = model.getEmployeeSuppressionDate();
		return this;
	}

	@Override
	public EmployeeDTO modelToDTOWithChildTable(EmployeeModel model) {
		final EmployeeDTO employeeDTO = modelToDTOWithoutChildTable(model);
		return employeeDTO;
	}

}

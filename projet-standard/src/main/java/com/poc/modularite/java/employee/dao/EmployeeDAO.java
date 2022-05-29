package com.poc.modularite.java.employee.dao;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.poc.modularite.java.employee.data.EmployeeDTO;

@Repository
public class EmployeeDAO implements IEmployeeDAO {

	private final EmployeeRepo employeeRepo;

	public EmployeeDAO(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public List<EmployeeDTO> findAll() {

		return this.employeeRepo.findAll().stream().map(m -> new EmployeeDTO().modelToDTOWithChildTable(m)).toList();
	}

	@Override
	public List<EmployeeDTO> findAll(Sort sort) {

		return this.employeeRepo.findAll(sort).stream().map(m -> new EmployeeDTO().modelToDTOWithChildTable(m))
				.toList();
	}

	@Override
	public List<EmployeeDTO> findAllById(Iterable<Integer> ids) {

		return this.employeeRepo.findAllById(ids).stream().map(m -> new EmployeeDTO().modelToDTOWithChildTable(m))
				.toList();
	}

	@Override
	public List<EmployeeDTO> saveAll(Iterable<EmployeeDTO> dtos) {

		return this.employeeRepo.saveAll(
				StreamSupport.stream(dtos.spliterator(), false).map(d -> d.convertToModelWithChildTable()).toList())
				.stream().map(m -> new EmployeeDTO().modelToDTOWithChildTable(m)).toList();
	}

	@Override
	public EmployeeDTO save(EmployeeDTO dto) {

		return new EmployeeDTO().modelToDTOWithChildTable((this.employeeRepo.save(dto.convertToModelWithChildTable())));

	}

}

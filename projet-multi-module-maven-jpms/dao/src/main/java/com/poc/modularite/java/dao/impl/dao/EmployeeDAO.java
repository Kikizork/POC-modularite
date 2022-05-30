package com.poc.modularite.java.dao.impl.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Repository;

import com.poc.modularite.java.dao.impl.repo.EmployeeRepo;
import com.poc.modularite.java.dao.interfaces.IEmployeeDAO;
import com.poc.modularite.java.data.dto.EmployeeDTO;

@Repository
public class EmployeeDAO implements IEmployeeDAO {

	private final EmployeeRepo employeeRepo;

	public EmployeeDAO(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public List<EmployeeDTO> findAll() {

		return this.employeeRepo.findAll().stream().map(m -> new EmployeeDTO().modelToDTOWithChildTable(m))
				.collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDTO> findAllById(Iterable<Integer> ids) {

		return this.employeeRepo.findAllById(ids).stream().map(m -> new EmployeeDTO().modelToDTOWithChildTable(m))
				.collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDTO> saveAll(Iterable<EmployeeDTO> dtos) {

		return this.employeeRepo
				.saveAll(StreamSupport.stream(dtos.spliterator(), false).map(d -> d.convertToModelWithChildTable())
						.collect(Collectors.toList()))
				.stream().map(m -> new EmployeeDTO().modelToDTOWithChildTable(m)).collect(Collectors.toList());
	}

	@Override
	public EmployeeDTO save(EmployeeDTO dto) {

		return new EmployeeDTO().modelToDTOWithChildTable((this.employeeRepo.save(dto.convertToModelWithChildTable())));

	}

}

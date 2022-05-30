package com.poc.modularite.java.dao.impl.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.poc.modularite.java.dao.impl.repo.ClientRepo;
import com.poc.modularite.java.dao.interfaces.IClientDAO;
import com.poc.modularite.java.data.dto.ClientDTO;

@Repository
public class ClientDAO implements IClientDAO {

	private final ClientRepo clientRepo;

	public ClientDAO(ClientRepo clientRepo) {
		super();
		this.clientRepo = clientRepo;
	}

	@Override
	public List<ClientDTO> findAll() {

		return this.clientRepo.findAll().stream().map(m -> new ClientDTO().modelToDTOWithChildTable(m))
				.collect(Collectors.toList());
	}

	@Override
	public List<ClientDTO> findAllById(Iterable<Integer> ids) {

		return this.clientRepo.findAllById(ids).stream().map(m -> new ClientDTO().modelToDTOWithChildTable(m))
				.collect(Collectors.toList());
	}

	@Override
	public List<ClientDTO> saveAll(Iterable<ClientDTO> dtos) {

		return this.clientRepo
				.saveAll(StreamSupport.stream(dtos.spliterator(), false).map(d -> d.convertToModelWithChildTable())
						.collect(Collectors.toList()))
				.stream().map(m -> new ClientDTO().modelToDTOWithChildTable(m)).collect(Collectors.toList());
	}

	@Override
	public ClientDTO save(ClientDTO dto) {

		return new ClientDTO().modelToDTOWithChildTable((this.clientRepo.save(dto.convertToModelWithChildTable())));
	}

	@Override
	public List<ClientDTO> findAll(Sort sort) {
		return this.clientRepo.findAll(sort).stream().map(m -> new ClientDTO().modelToDTOWithChildTable(m))
				.collect(Collectors.toList());
	}

}

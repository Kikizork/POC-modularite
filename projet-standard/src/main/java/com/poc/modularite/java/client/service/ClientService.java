package com.poc.modularite.java.client.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poc.modularite.java.client.dao.IClientDAO;
import com.poc.modularite.java.client.data.ClientDTO;

@Service
public class ClientService implements IClientService {

	private final IClientDAO clientDAO;

	public ClientService(IClientDAO clientDAO) {
		super();
		this.clientDAO = clientDAO;
	}

	@Override
	public List<ClientDTO> findAll() {
		return this.clientDAO.findAll();
	}

	@Override
	public List<ClientDTO> findAll(Sort sort) {
		return this.clientDAO.findAll(sort);
	}

}

package com.poc.modularite.java.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.modularite.java.dao.interfaces.IClientDAO;
import com.poc.modularite.java.data.dto.ClientDTO;
import com.poc.modularite.java.service.interfaces.IClientService;

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

}

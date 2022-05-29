package com.poc.modularite.java.service.impl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poc.modularite.java.dao.interfaces.IEntrepriseDAO;
import com.poc.modularite.java.data.dto.EntrepriseDTO;
import com.poc.modularite.java.service.interfaces.IEntrepriseService;

@Service
public class EntrepriseService implements IEntrepriseService {

	private final IEntrepriseDAO entrepriseDAO;

	public EntrepriseService(IEntrepriseDAO entrepriseDAO) {
		super();
		this.entrepriseDAO = entrepriseDAO;
	}

	@Override
	public List<EntrepriseDTO> findAll() {

		return this.entrepriseDAO.findAll();
	}

	@Override
	public List<EntrepriseDTO> findAll(Sort sort) {
		return this.entrepriseDAO.findAll();
	}

}

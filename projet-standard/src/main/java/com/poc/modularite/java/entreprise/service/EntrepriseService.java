package com.poc.modularite.java.entreprise.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poc.modularite.java.entreprise.dao.IEntrepriseDAO;
import com.poc.modularite.java.entreprise.data.EntrepriseDTO;

@Service
public class EntrepriseService implements IEntrepriseService{
	
	private final IEntrepriseDAO entrepriseDAO;
	
	
	

	public EntrepriseService(IEntrepriseDAO entrepriseDAO) {
		super();
		this.entrepriseDAO = entrepriseDAO;
	}

	@Override
	public List<EntrepriseDTO> findAll() {

		return entrepriseDAO.findAll();
	}

	@Override
	public List<EntrepriseDTO> findAll(Sort sort) {
		return entrepriseDAO.findAll();
	}

	

}

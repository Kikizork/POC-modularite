package com.poc.modularite.java.controller.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.modularite.java.controller.interfaces.IEntrepriseController;
import com.poc.modularite.java.data.dto.EntrepriseDTO;
import com.poc.modularite.java.service.interfaces.IEntrepriseService;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseController implements IEntrepriseController {

	private final IEntrepriseService entrepriseService;

	public EntrepriseController(IEntrepriseService entrepriseService) {
		super();
		this.entrepriseService = entrepriseService;
	}

	@Override
	public ResponseEntity<List<EntrepriseDTO>> getAllEntreprise() {

		return new ResponseEntity<>(this.entrepriseService.findAll(), HttpStatus.OK);
	}

}

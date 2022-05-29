package com.poc.modularite.java.entreprise.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.modularite.java.entreprise.data.EntrepriseDTO;
import com.poc.modularite.java.entreprise.service.IEntrepriseService;

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

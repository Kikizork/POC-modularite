package com.poc.modularite.java.entreprise.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.poc.modularite.java.entreprise.data.EntrepriseDTO;

public interface IEntrepriseController {

	@GetMapping("/all")
	public ResponseEntity<List<EntrepriseDTO>> getAllEntreprise();
}

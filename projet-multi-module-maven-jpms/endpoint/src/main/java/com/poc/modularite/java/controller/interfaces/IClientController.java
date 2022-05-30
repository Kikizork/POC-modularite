package com.poc.modularite.java.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.poc.modularite.java.data.dto.ClientDTO;

public interface IClientController {

	@GetMapping("/all")
	public ResponseEntity<List<ClientDTO>> getAllClient();
}

package com.poc.modularite.java.client.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.poc.modularite.java.client.data.ClientDTO;

public interface IClientController {

	@GetMapping("/all")
	public ResponseEntity<List<ClientDTO>> getAllClient();
}

package com.poc.modularite.java.controller.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.modularite.java.controller.interfaces.IClientController;
import com.poc.modularite.java.data.dto.ClientDTO;
import com.poc.modularite.java.service.interfaces.IClientService;

@RestController
@RequestMapping("/client")
public class ClientController implements IClientController {

	private final IClientService clientService;

	public ClientController(IClientService clientService) {
		super();
		this.clientService = clientService;
	}

	@Override
	public ResponseEntity<List<ClientDTO>> getAllClient() {
		return new ResponseEntity<>(this.clientService.findAll(), HttpStatus.OK);
	}

}

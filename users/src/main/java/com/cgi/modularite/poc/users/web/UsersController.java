package com.cgi.modularite.poc.users.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.modularite.poc.users.data.dtos.UsersDTO;
import com.cgi.modularite.poc.users.service.interfaces.UsersService;

@RestController
@RequestMapping(value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsersController {

	private final UsersService usersService;

	public UsersController(UsersService usersService) {
		this.usersService = usersService;

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {

		return ResponseEntity.ok(this.usersService.findById(id));
	}

	@PostMapping("")
	public ResponseEntity<?> createUser(@RequestBody UsersDTO userDTO) {

		return new ResponseEntity<UsersDTO>(this.usersService.createUser(userDTO), HttpStatus.CREATED);
	}
}

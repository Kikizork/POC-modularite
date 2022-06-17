package com.cgi.modularite.poc.users.service.interfaces;

import java.util.Optional;

import com.cgi.modularite.poc.users.data.dtos.AuthenticationDTO;

public interface AuthenticationService {

	public Optional<AuthenticationDTO> login(String username, String password);

}

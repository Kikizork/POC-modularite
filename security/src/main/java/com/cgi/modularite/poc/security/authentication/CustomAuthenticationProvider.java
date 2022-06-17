package com.cgi.modularite.poc.security.authentication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.cgi.modularite.poc.users.data.dtos.AuthenticationDTO;
import com.cgi.modularite.poc.users.service.interfaces.AuthenticationService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	private final AuthenticationService authenticationService;

	public CustomAuthenticationProvider(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		final AuthenticationDTO authDTO = this.authenticationService
				.login(authentication.getName().toString(), authentication.getCredentials().toString())
				.orElseThrow(() -> new BadCredentialsException("Login incorrect"));

		return new UsernamePasswordAuthenticationToken(authDTO.getUsername(), authDTO.getPassword(),
				new ArrayList<>(List.of(new SimpleGrantedAuthority(authDTO.getLibAuth()))));
	}

	@Override
	public boolean supports(Class<?> authentication) {

		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}

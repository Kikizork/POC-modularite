package com.cgi.modularite.poc.users.data.dtos;

public class AuthenticationDTO {

	private String username;

	private String password;

	private String libAuth;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLibAuth() {
		return this.libAuth;
	}

	public void setLibAuth(String libAuth) {
		this.libAuth = libAuth;
	}

	public AuthenticationDTO(String username, String password, String libAuth) {
		super();
		this.username = username;
		this.password = password;
		this.libAuth = libAuth;
	}

	public AuthenticationDTO() {
		super();
	}

}

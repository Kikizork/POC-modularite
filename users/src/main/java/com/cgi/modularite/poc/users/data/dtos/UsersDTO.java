package com.cgi.modularite.poc.users.data.dtos;

import java.time.LocalDate;

import com.cgi.modularite.poc.core.data.dtos.DTOWithSystemValues;

public class UsersDTO extends DTOWithSystemValues {

	/**
	 *
	 */
	private static final long serialVersionUID = -1006237469146938961L;

	private Integer id;

	private String username;

	private String password;

	private LocalDate activationDate;

	private AuthoritiesDTO authoritie;

	public AuthoritiesDTO getAuthoritie() {
		return this.authoritie;
	}

	public void setAuthoritie(AuthoritiesDTO authoritie) {
		this.authoritie = authoritie;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public LocalDate getActivationDate() {
		return this.activationDate;
	}

	public void setActivationDate(LocalDate activationDate) {
		this.activationDate = activationDate;
	}

	public UsersDTO() {
		super();
	}

}

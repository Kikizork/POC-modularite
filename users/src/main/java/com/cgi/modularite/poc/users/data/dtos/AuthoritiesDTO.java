package com.cgi.modularite.poc.users.data.dtos;

import com.cgi.modularite.poc.core.data.dtos.DTOWithSystemValues;

public class AuthoritiesDTO extends DTOWithSystemValues {

	/**
	 *
	 */
	private static final long serialVersionUID = 8836722898628900827L;

	private Integer id;

	private String libAuth;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibAuth() {
		return this.libAuth;
	}

	public void setLibAuth(String libAuth) {
		this.libAuth = libAuth;
	}

	public AuthoritiesDTO() {
		super();
	}

}

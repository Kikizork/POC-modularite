package com.cgi.modularite.poc.users.service.interfaces;

import java.util.Optional;

import com.cgi.modularite.poc.users.data.models.AuthoritiesModel;

public interface AuthoritiesService {

	@SuppressWarnings("exports")
	public Optional<AuthoritiesModel> findById(Integer id);
}

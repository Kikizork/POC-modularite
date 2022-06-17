package com.cgi.modularite.poc.users.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cgi.modularite.poc.core.services.ServiceAbstract;
import com.cgi.modularite.poc.users.data.models.AuthoritiesModel;
import com.cgi.modularite.poc.users.data.repositories.AuthoritiesRepository;
import com.cgi.modularite.poc.users.service.interfaces.AuthoritiesService;

@Service
public class AuthoritiesServiceImpl extends ServiceAbstract<AuthoritiesRepository, AuthoritiesModel, Integer>
		implements AuthoritiesService {

	public AuthoritiesServiceImpl(AuthoritiesRepository repository) {
		super(repository);
	}

	@Override
	public Optional<AuthoritiesModel> findById(Integer id) {

		return repository.findById(id);
	}

}

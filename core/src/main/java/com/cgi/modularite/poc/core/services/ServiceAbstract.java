package com.cgi.modularite.poc.core.services;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ServiceAbstract<R extends JpaRepository<T, ID>, T, ID> {

	protected final R repository;

	public ServiceAbstract(R repository) {
		super();
		this.repository = repository;
	}

}

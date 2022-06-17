
module poc.modularite.core {
	requires java.persistence;
	requires spring.data.jpa;
	requires spring.context;
	requires spring.data.commons;
	requires spring.security.core;

	exports com.cgi.modularite.poc.core.data.dtos;
	exports com.cgi.modularite.poc.core.data.mappers;
	exports com.cgi.modularite.poc.core.data.repositories;
	exports com.cgi.modularite.poc.core.utils;
	exports com.cgi.modularite.poc.core.services;
	exports com.cgi.modularite.poc.core.exception;
}
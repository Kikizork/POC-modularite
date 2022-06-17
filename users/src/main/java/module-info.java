
open module modularite.users {
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.boot.starter;
	requires spring.data.jpa;
	requires spring.data.commons;
	requires spring.boot;
	requires spring.web;
	requires spring.beans;
	requires java.instrument;
	requires java.sql;
	requires org.hibernate.orm.core;

	requires poc.modularite.core;
	requires modelmapper;
	requires spring.security.core;
	requires java.persistence;

	exports com.cgi.modularite.poc.users.service.interfaces to modularite.poc.security;
	exports com.cgi.modularite.poc.users.data.dtos to modularite.poc.security;

	/**
	 * Requis pour injection par spring
	 */
	// opens com.cgi.modularite.poc.users to spring.core, spring.beans,
	// spring.context;
	// opens com.cgi.modularite.poc.users.web to spring.core, spring.beans,
	// spring.context;
	// opens com.cgi.modularite.poc.users.service.impl to spring.core, spring.beans,
	// spring.context;
	// opens com.cgi.modularite.poc.users.data.mappers to spring.core, spring.beans,
	// spring.context;

	/**
	 * Requis par hibernate pour instanciation après query
	 */
	// opens com.cgi.modularite.poc.users.data.models to spring.core, spring.beans,
	// spring.context, org.hibernate.orm.core;
	// opens com.cgi.modularite.poc.users.data.dtos to spring.core, spring.beans,
	// spring.context, org.hibernate.orm.core;
}
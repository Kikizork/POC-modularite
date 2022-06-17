
open module modularite.products {
	/**
	 * Nécessaire pour compilation
	 */
	requires poc.modularite.core;
	requires spring.web;
	requires java.persistence;
	requires spring.context;
	requires modelmapper;
	requires spring.boot;
	requires spring.boot.autoconfigure;

	/**
	 * Requis au lancement de spring avec des erreurs par forcement claires
	 */
	requires java.sql;
	requires org.hibernate.orm.core;
	requires java.instrument;
	requires spring.core;
	requires spring.boot.starter;
	requires spring.data.jpa;
	requires spring.data.commons;
	requires spring.security.core;

	/**
	 * Requis car nécessaire pour le .class
	 *
	 *
	 */
	requires spring.beans;

	/**
	 * Requis pour injection par spring
	 */
	// opens com.cgi.modularite.poc.products to spring.core, spring.beans,
	// spring.context;
	/**
	 * Spring web nécessaire => sinon plantage lors de l'appel api
	 */
	// opens com.cgi.modularite.poc.products.web to spring.core, spring.beans,
	// spring.context, spring.web;
	// opens com.cgi.modularite.poc.products.service.impl to spring.core,
	// spring.beans, spring.context;
	// opens com.cgi.modularite.poc.products.data.mappers to spring.core,
	// spring.beans, spring.context;

	/**
	 * Requis par hibernate pour instanciation après query Modelmapper plante lors
	 * de l'appel à l'exécution si absent
	 */
	// opens com.cgi.modularite.poc.products.data.models
	// to spring.core, spring.beans, spring.context, org.hibernate.orm.core,
	// modelmapper;
	// opens com.cgi.modularite.poc.products.data.dtos to spring.core, spring.beans,
	// spring.context,
	// org.hibernate.orm.core, modelmapper, com.fasterxml.jackson.databind;
}
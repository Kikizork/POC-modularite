
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
	 * Requis au lancement de spring
	 */
	requires java.sql;

}
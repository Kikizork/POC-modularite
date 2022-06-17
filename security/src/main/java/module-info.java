
module modularite.poc.security {
	requires spring.context;
	requires spring.security.config;
	requires spring.security.web;
	requires spring.boot.autoconfigure;
	requires spring.boot;
	requires modularite.users;
	requires spring.security.core;

	/**
	 * Requis pour injection par spring
	 */
	opens com.cgi.modularite.poc.security.config to spring.core, spring.beans, spring.context;
	opens com.cgi.modularite.poc.security.authentication to spring.core, spring.beans, spring.context;
	opens com.cgi.modularite.poc.security to spring.core, spring.beans, spring.context;
}
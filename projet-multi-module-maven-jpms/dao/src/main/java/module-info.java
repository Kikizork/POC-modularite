
module com.poc.dao {
	requires spring.context;
	requires spring.data.jpa;
	requires spring.beans;
	requires spring.data.commons;
	requires spring.core;
	requires spring.aop;
	requires java.sql;
	requires org.hibernate.orm.core;
	requires org.hibernate.commons.annotations;

	requires com.poc.common;
	requires com.poc.data;

	opens com.poc.modularite.java.dao.impl.dao;
	opens com.poc.modularite.java.dao.impl.repo;

	exports com.poc.modularite.java.dao.interfaces to com.poc.service;
}
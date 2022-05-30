
open module com.poc.dao {
	requires spring.context;
	requires spring.data.jpa;
	requires spring.beans;
	requires spring.data.commons;
	requires spring.core;
	requires spring.aop;
	requires org.hibernate.orm.core;
	requires org.hibernate.commons.annotations;

	requires com.poc.common;
	requires com.poc.data;

	exports com.poc.modularite.java.dao.interfaces to com.poc.service;
}
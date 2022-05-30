
open module com.poc.endpoint {
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.boot.starter;
	requires spring.data.jpa;
	requires spring.data.commons;
	requires spring.boot;
	requires spring.web;
	requires spring.beans;

	requires spring.core;
	requires com.poc.data;
	requires com.poc.service;
	requires java.instrument;

}
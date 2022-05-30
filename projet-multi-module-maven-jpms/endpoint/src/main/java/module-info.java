
open module com.poc.endpoint {
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.data.jpa;
	requires spring.boot;
	requires spring.web;
	requires spring.beans;
	requires spring.data.commons;
	requires spring.core;

	requires com.poc.data;
	requires com.poc.service;

}
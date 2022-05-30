
open module com.poc.service {
	requires com.poc.common;
	requires com.poc.data;
	requires spring.context;
	requires com.poc.dao;

	exports com.poc.modularite.java.service.interfaces;
}
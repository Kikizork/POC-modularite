
open module com.poc.data {
	requires com.poc.common;
	requires java.persistence;

	exports com.poc.modularite.java.data.dto;
	exports com.poc.modularite.java.data.enums;
	exports com.poc.modularite.java.data.model;
}
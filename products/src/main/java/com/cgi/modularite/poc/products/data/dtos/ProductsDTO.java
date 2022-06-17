package com.cgi.modularite.poc.products.data.dtos;

import com.cgi.modularite.poc.core.data.dtos.DTOWithSystemValues;

public class ProductsDTO extends DTOWithSystemValues {

	/**
	 *
	 */
	private static final long serialVersionUID = -7890467664313107762L;

	private Integer id;

	private String name;

	private Integer barcode;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBarcode() {
		return this.barcode;
	}

	public void setBarcode(Integer barcode) {
		this.barcode = barcode;
	}

	public ProductsDTO() {
		super();
	}

}

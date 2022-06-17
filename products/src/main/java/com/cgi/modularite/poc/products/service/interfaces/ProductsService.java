package com.cgi.modularite.poc.products.service.interfaces;

import com.cgi.modularite.poc.products.data.dtos.ProductsDTO;

public interface ProductsService {

	public ProductsDTO findById(Integer id);

	public ProductsDTO createProducts(ProductsDTO dto);
}

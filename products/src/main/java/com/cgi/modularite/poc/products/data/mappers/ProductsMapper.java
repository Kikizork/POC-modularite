package com.cgi.modularite.poc.products.data.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.cgi.modularite.poc.core.data.mappers.CommonMapper;
import com.cgi.modularite.poc.core.utils.DateUtils;
import com.cgi.modularite.poc.products.data.dtos.ProductsDTO;
import com.cgi.modularite.poc.products.data.models.ProductsModel;

@Service
public class ProductsMapper extends CommonMapper {

	public ProductsMapper(DateUtils dateUtils) {
		super(dateUtils);
	}

	private final ModelMapper modelMapper = new ModelMapper();

	public ProductsDTO convertToDto(ProductsModel productsModel) {

		return this.modelMapper.map(productsModel, ProductsDTO.class);

	}

	public ProductsModel convertToModel(ProductsDTO productsDTO) {
		return this.modelMapper.map(productsDTO, ProductsModel.class);
	}

}

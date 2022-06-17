package com.cgi.modularite.poc.products.service.impl;

import org.springframework.stereotype.Service;

import com.cgi.modularite.poc.core.exception.DataNotFoundException;
import com.cgi.modularite.poc.core.services.ServiceAbstract;
import com.cgi.modularite.poc.products.data.dtos.ProductsDTO;
import com.cgi.modularite.poc.products.data.mappers.ProductsMapper;
import com.cgi.modularite.poc.products.data.models.ProductsModel;
import com.cgi.modularite.poc.products.data.repositories.ProductsRepository;
import com.cgi.modularite.poc.products.service.interfaces.ProductsService;

@Service
public class ProductsServiceImpl extends ServiceAbstract<ProductsRepository, ProductsModel, Integer>
		implements ProductsService {

	private final ProductsMapper productsMapper;

	public ProductsServiceImpl(ProductsRepository repository, ProductsMapper productsMapper) {
		super(repository);
		this.productsMapper = productsMapper;
	}

	@Override
	public ProductsDTO findById(Integer id) {
		return this.productsMapper.convertToDto(
				this.repository.findById(id).orElseThrow(() -> new DataNotFoundException("Produit non trouvé")));
	}

	@Override
	public ProductsDTO createProducts(ProductsDTO dto) {
		final ProductsModel productsModel = this.productsMapper
				.convertToModel(this.productsMapper.initialiseSystemValuesCreation(dto));

		return this.productsMapper.convertToDto(this.repository.save(productsModel));
	}

}

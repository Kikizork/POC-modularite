package com.cgi.modularite.poc.products.data.repositories;

import org.springframework.stereotype.Repository;

import com.cgi.modularite.poc.core.data.repositories.CommonRepo;
import com.cgi.modularite.poc.products.data.models.ProductsModel;

@Repository
public interface ProductsRepository extends CommonRepo<ProductsModel, Integer> {

}

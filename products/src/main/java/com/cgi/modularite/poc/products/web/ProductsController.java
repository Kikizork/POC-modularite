package com.cgi.modularite.poc.products.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.modularite.poc.products.data.dtos.ProductsDTO;
import com.cgi.modularite.poc.products.service.interfaces.ProductsService;

@RestController
@RequestMapping(value = "/api/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductsController {

	private final ProductsService productsService;

	public ProductsController(ProductsService productsService) {
		super();
		this.productsService = productsService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {

		return ResponseEntity.ok(this.productsService.findById(id));
	}

	@PostMapping("")
	public ResponseEntity<?> createUser(@RequestBody ProductsDTO userDTO) {

		return new ResponseEntity<ProductsDTO>(this.productsService.createProducts(userDTO), HttpStatus.CREATED);
	}
}

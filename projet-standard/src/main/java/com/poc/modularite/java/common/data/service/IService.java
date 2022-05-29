package com.poc.modularite.java.common.data.service;

import java.util.List;

import org.springframework.data.domain.Sort;

public interface IService<DTO, ID> {

	List<DTO> findAll();

	List<DTO> findAll(Sort sort);
}

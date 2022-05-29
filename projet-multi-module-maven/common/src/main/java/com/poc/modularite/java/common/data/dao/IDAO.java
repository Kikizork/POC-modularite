package com.poc.modularite.java.common.data.dao;

import java.util.List;

import org.springframework.data.domain.Sort;

public interface IDAO<DTO, ID> {

	List<DTO> findAll();

	List<DTO> findAll(Sort sort);

	List<DTO> findAllById(Iterable<ID> ids);

	List<DTO> saveAll(Iterable<DTO> dtos);

	DTO save(DTO dto);

}

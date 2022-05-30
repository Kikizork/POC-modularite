package com.poc.modularite.java.common.data.service;

import java.util.List;

public interface IService<DTO, ID> {

	List<DTO> findAll();

}

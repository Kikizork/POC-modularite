package com.cgi.modularite.poc.users.data.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.cgi.modularite.poc.core.data.mappers.CommonMapper;
import com.cgi.modularite.poc.core.utils.DateUtils;
import com.cgi.modularite.poc.users.data.dtos.UsersDTO;
import com.cgi.modularite.poc.users.data.models.UsersModel;

@Service
public class UsersMapper extends CommonMapper {

	public UsersMapper(DateUtils dateUtils) {
		super(dateUtils);
	}

	private final ModelMapper modelMapper = new ModelMapper();

	public UsersDTO convertToDto(UsersModel userModel) {

		return this.modelMapper.map(userModel, UsersDTO.class);

	}

	public UsersModel convertToModel(UsersDTO userDTO) {
		return this.modelMapper.map(userDTO, UsersModel.class);
	}

}

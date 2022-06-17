package com.cgi.modularite.poc.users.service.interfaces;

import com.cgi.modularite.poc.users.data.dtos.UsersDTO;

public interface UsersService extends AuthenticationService {

	public UsersDTO findById(Integer id);

	public UsersDTO createUser(UsersDTO dto);

}

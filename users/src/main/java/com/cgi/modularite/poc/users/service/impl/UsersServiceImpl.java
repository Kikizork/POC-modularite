package com.cgi.modularite.poc.users.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cgi.modularite.poc.core.exception.DataNotFoundException;
import com.cgi.modularite.poc.core.services.ServiceAbstract;
import com.cgi.modularite.poc.users.data.dtos.AuthenticationDTO;
import com.cgi.modularite.poc.users.data.dtos.UsersDTO;
import com.cgi.modularite.poc.users.data.mappers.UsersMapper;
import com.cgi.modularite.poc.users.data.models.UsersModel;
import com.cgi.modularite.poc.users.data.repositories.UsersRepository;
import com.cgi.modularite.poc.users.service.interfaces.UsersService;

@Service
public class UsersServiceImpl extends ServiceAbstract<UsersRepository, UsersModel, Integer> implements UsersService {

	private final UsersMapper usersMapper;

	public UsersServiceImpl(UsersRepository repository, UsersMapper usersMapper) {
		super(repository);
		this.usersMapper = usersMapper;
	}

	@Override
	public UsersDTO findById(Integer id) {

		return this.usersMapper.convertToDto(
				this.repository.findById(id).orElseThrow(() -> new DataNotFoundException("Utilisateur non trouvé")));
	}

	@Override
	public UsersDTO createUser(UsersDTO dto) {
		final UsersModel usersModel = this.usersMapper
				.convertToModel(this.usersMapper.initialiseSystemValuesCreation(dto));

		return this.usersMapper.convertToDto(this.repository.save(usersModel));
	}

	@Override
	public Optional<AuthenticationDTO> login(String username, String password) {

		return this.repository.login(username, password);
	}

}

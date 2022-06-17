package com.cgi.modularite.poc.users.data.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cgi.modularite.poc.core.data.repositories.CommonRepo;
import com.cgi.modularite.poc.users.data.dtos.AuthenticationDTO;
import com.cgi.modularite.poc.users.data.models.UsersModel;

@Repository
public interface UsersRepository extends CommonRepo<UsersModel, Integer> {

	@Query("SELECT new com.cgi.modularite.poc.users.data.dtos.AuthenticationDTO(user.username, user.password, auth.libAuth) "
			+ "FROM UsersModel user JOIN user.authoritie auth "
			+ "WHERE user.username = :username AND user.password = :password ")
	public Optional<AuthenticationDTO> login(@Param("username") String username, @Param("password") String password);
}

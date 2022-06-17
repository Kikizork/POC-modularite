package com.cgi.modularite.poc.users.data.repositories;

import org.springframework.stereotype.Repository;

import com.cgi.modularite.poc.core.data.repositories.CommonRepo;
import com.cgi.modularite.poc.users.data.models.AuthoritiesModel;

@Repository
public interface AuthoritiesRepository extends CommonRepo<AuthoritiesModel, Integer> {

}

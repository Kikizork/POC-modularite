package com.poc.modularite.java.dao.impl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.modularite.java.data.model.ClientModel;

@Repository
public interface ClientRepo extends JpaRepository<ClientModel, Integer> {

}

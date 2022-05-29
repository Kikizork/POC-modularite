package com.poc.modularite.java.client.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.modularite.java.client.data.ClientModel;

@Repository
public interface ClientRepo extends JpaRepository<ClientModel, Integer>{

}

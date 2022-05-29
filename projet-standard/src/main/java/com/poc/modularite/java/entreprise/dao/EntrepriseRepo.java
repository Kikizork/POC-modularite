package com.poc.modularite.java.entreprise.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.modularite.java.entreprise.data.EntrepriseModel;

@Repository
public interface EntrepriseRepo extends JpaRepository<EntrepriseModel, Integer> {

}

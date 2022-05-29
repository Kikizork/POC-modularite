package com.poc.modularite.java.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.modularite.java.employee.data.EmployeeModel;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer>{

}

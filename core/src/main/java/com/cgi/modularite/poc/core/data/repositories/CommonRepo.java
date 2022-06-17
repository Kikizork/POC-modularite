package com.cgi.modularite.poc.core.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommonRepo<T, ID> extends JpaRepository<T, ID> {

}

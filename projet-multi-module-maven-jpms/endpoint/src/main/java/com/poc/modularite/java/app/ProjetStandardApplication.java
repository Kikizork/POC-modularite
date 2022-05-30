package com.poc.modularite.java.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.poc.modularite.java.controller.*", "com.poc.modularite.java.service.*",
		"com.poc.modularite.java.dao.*" })
@EnableJpaRepositories(basePackages = "com.poc.modularite.java.dao.impl.repo")
@EntityScan(basePackages = "com.poc.modularite.java.*")
public class ProjetStandardApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ProjetStandardApplication.class, args);
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}

	}

}

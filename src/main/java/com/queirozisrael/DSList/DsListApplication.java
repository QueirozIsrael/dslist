package com.queirozisrael.DSList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.queirozisrael.DSList", "controllers", "services", "repositories"})
@EntityScan("entities")
@EnableJpaRepositories("repositories")

public class DsListApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsListApplication.class, args);
	}

}

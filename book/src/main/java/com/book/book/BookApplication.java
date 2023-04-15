package com.book.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// entity scan for scan entity class
@EntityScan("com.book")
//component scan for controller
@ComponentScan(basePackages = "com.book")
//for scan jpa repo
@EnableJpaRepositories(basePackages = "com.book")

public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
		System.out.println("from book");
	}

}

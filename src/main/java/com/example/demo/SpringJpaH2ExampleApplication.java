package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
//@EnableJpaRepositories("com.example.demo.repository") | scanBasePackages={"com.example.demo.dao"}
public class SpringJpaH2ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaH2ExampleApplication.class, args);
		
		System.out.println("Test db is running!");
	}

}

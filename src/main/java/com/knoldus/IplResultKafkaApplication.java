package com.knoldus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = MatchResult.class)
@EnableMongoRepositories("com.knoldus.repository")
public class IplResultKafkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(IplResultKafkaApplication.class, args);
	}
}

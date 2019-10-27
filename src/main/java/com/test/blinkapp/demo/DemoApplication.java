package com.test.blinkapp.demo;

import com.test.blinkapp.demo.model.Index;
import com.test.blinkapp.demo.repo.IndexRepo;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	private IndexRepo indexRepo;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			indexRepo.save(new Index(3));
		};
	}


}

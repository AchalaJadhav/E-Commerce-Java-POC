package com.example.bct.EcommerceByAchala;

import com.example.bct.EcommerceByAchala.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class EcommerceByAchalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceByAchalaApplication.class, args);
	}

}

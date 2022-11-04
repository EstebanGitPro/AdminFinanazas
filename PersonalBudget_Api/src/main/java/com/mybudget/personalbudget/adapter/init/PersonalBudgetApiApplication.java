package com.mybudget.personalbudget.adapter.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@ComponentScan(basePackages = { "com.mybudget.personalbudget" })
@EnableJpaRepositories(basePackages = { "com.mybudget.personalbudget" })
@EntityScan(basePackages = { "com.mybudget.personalbudget" })
@EnableConfigurationProperties(Credential.class)
public class PersonalBudgetApiApplication implements CommandLineRunner {
	
	private final Credential credential;
	
	public PersonalBudgetApiApplication(Credential credential) {
	    this.credential = credential;
	  }

	public static void main(String[] args) {
		SpringApplication.run(PersonalBudgetApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger logger = LoggerFactory.getLogger(PersonalBudgetApiApplication.class);
		
		logger.info("----------------------------------------");
	    logger.info("Configuration properties");
	    logger.info("   Budget.password  is {}", credential.getUsername());
	    logger.info("   Budget.username  is {}", credential.getPassword());
	    logger.info("----------------------------------------");
		
	}

}
